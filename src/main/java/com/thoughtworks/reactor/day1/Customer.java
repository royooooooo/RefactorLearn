package com.thoughtworks.reactor.day1;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        rentals.add(rental);
    }

    String getName() {
        return name;
    }

    int statement() {
        return rentals.stream().reduce(0, (sum, rental) -> sum + getRenderPrice(rental), Integer::sum);
    }

    private int getRenderPrice(Rental rental) {
        int rentalPrice = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.CHILDREN:
                rentalPrice += 2;
                if (rental.getDayRented() > 2) rentalPrice += (rental.getDayRented() - 1) * 2;
                break;
            case Movie.NEW_RELEASE:
                rentalPrice += rental.getDayRented() * 3;
                break;
            case Movie.REGULAR:
                rentalPrice += 2;
                if (rental.getDayRented() > 3) rentalPrice += (rental.getDayRented() - 3) * 3;
                break;
            default:
                break;
        }
        return rentalPrice;
    }
}
