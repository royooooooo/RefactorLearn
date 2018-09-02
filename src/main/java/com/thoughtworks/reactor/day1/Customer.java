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

    int amountFor() {
        return rentals.stream().reduce(0, (sum, rental) -> sum + rental.getPrice(), Integer::sum);
    }
}
