package com.thoughtworks.reactor.day1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CustomerTest {
    private Customer customer = new Customer("roy");

    @Before
    public void setUp() {
        Rental rental1 = new Rental(new Movie(Movie.CHILDREN), 3);
        Rental rental2 = new Rental(new Movie(Movie.NEW_RELEASE), 4);
        Rental rental3 = new Rental(new Movie(Movie.REGULAR), 5);
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
    }

    @Test
    public void should_return_price_given_rental() {
        assertEquals(customer.amountFor(), 26);
    }
}
