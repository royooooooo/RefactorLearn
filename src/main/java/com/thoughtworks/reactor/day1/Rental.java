package com.thoughtworks.reactor.day1;

class Rental {
    private Movie movie;
    private int dayRented;

    Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    int getPrice() {
        int price = 0;
        switch (movie.getPriceCode()) {
            case Movie.CHILDREN:
                price += 2;
                if (getDayRented() > 2) price += (getDayRented() - 1) * 2;
                break;
            case Movie.NEW_RELEASE:
                price += getDayRented() * 3;
                break;
            case Movie.REGULAR:
                price += 2;
                if (getDayRented() > 3) price += (getDayRented() - 3) * 3;
                break;
            default:
                break;
        }
        return price;
    }

    private int getDayRented() {
        return dayRented;
    }

}
