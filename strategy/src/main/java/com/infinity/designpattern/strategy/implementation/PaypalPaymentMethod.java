package com.infinity.designpattern.strategy.implementation;

import com.infinity.designpattern.strategy.strategy.PaymentStrategy;

public class PaypalPaymentMethod  implements PaymentStrategy {
    private String paypalAccount;
    private String password;

    public PaypalPaymentMethod(String paypalAccount, String password) {
        this.paypalAccount = paypalAccount;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println(String.format("Paying %s with Paypal account %s", amount, this.paypalAccount));
    }
}
