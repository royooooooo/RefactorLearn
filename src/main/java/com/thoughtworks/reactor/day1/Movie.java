package com.thoughtworks.reactor.day1;

class Movie {
    static final int CHILDREN = 1;
    static final int REGULAR = 2;
    static final int NEW_RELEASE = 3;

    private int priceCode;

    Movie(int priceCode) {
        this.priceCode = priceCode;
    }

    int getPriceCode() {
        return priceCode;
    }

}
