package com.thoughtworks.reactor.day1;

public class Shopping {
    public static void main(String[] args) {
        Rental rental1 = new Rental(new Movie(Movie.CHILDREN), 3);
        Rental rental2 = new Rental(new Movie(Movie.NEW_RELEASE), 4);
        Rental rental3 = new Rental(new Movie(Movie.REGULAR), 5);

        Customer customer = new Customer("roy");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(String.format("hello %s, price is %s !",
                customer.getName(), customer.amountFor()));
    }
}
