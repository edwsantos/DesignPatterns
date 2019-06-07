package com.infinity.designpattern.strategy.implementation;

import com.infinity.designpattern.strategy.strategy.PaymentStrategy;

public class CreditCardPaymentMethod implements PaymentStrategy {
    private String nameOnCard;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardPaymentMethod(String nameOnCard, String cardNumber, String cvv, String expirationDate) {
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    public void pay(int amount) {
        System.out.println(String.format("Paying %s with credit card number %s", amount, this.cardNumber));
    }
}
