package com.thoughtworks.reactor.day1;

public class Movie {
  public static final int CHILDREN = 1;
  public static final int REGULAR = 2;
  public static final int NEW_RELEASE = 3;

  private int priceCode;

  Movie(int priceCode) {
    this.priceCode = priceCode;
  }

  public int getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(int priceCode) {
    this.priceCode = priceCode;
  }
}
