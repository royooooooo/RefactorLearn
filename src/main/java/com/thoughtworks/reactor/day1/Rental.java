package com.thoughtworks.reactor.day1;

public class Rental {
    private Movie movie;
    private int dayRented;

    Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    int getPrice() {
        int rentalPrice = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.CHILDREN:
                rentalPrice += 2;
                if (getDayRented() > 2) rentalPrice += (getDayRented() - 1) * 2;
                break;
            case Movie.NEW_RELEASE:
                rentalPrice += getDayRented() * 3;
                break;
            case Movie.REGULAR:
                rentalPrice += 2;
                if (getDayRented() > 3) rentalPrice += (getDayRented() - 3) * 3;
                break;
            default:
                break;
        }
        return rentalPrice;
    }

    private Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private int getDayRented() {
        return dayRented;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
}
