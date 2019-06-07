package com.infinity.designpattern.strategy.context;

import com.infinity.designpattern.strategy.strategy.PaymentStrategy;

public class EcommerceSite {
    private PaymentStrategy paymentMethod;

    public void setPaymentMethod(PaymentStrategy paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void pay(int amount){
        this.paymentMethod.pay(amount);
    }
}
