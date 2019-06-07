package com.infinity.designpattern.strategy;

import com.infinity.designpattern.strategy.context.EcommerceSite;
import com.infinity.designpattern.strategy.implementation.CreditCardPaymentMethod;
import com.infinity.designpattern.strategy.implementation.PaypalPaymentMethod;


public class StrategyApp {

    public static void main(String[] args){
        EcommerceSite eCommerceSite = new EcommerceSite();
        int amountToPay = 20000;

        //First we want to pay with credit card
        eCommerceSite.setPaymentMethod(new CreditCardPaymentMethod("Tony Stark","123456789","123","12/30"));
        eCommerceSite.pay(amountToPay);

        //Now, we want to pay with Paypal
        eCommerceSite.setPaymentMethod(new PaypalPaymentMethod("tonystark@paypal.com","TonyStarkHasDied"));
        eCommerceSite.pay(amountToPay);
    }
}
