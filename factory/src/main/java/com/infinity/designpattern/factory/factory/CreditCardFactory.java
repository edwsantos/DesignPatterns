package com.infinity.designpattern.factory.factory;

import com.infinity.designpattern.factory.definition.CreditCard;
import com.infinity.designpattern.factory.implementation.AmericanExpress;
import com.infinity.designpattern.factory.implementation.MasterCard;
import com.infinity.designpattern.factory.implementation.Visa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class CreditCardFactory {
    private Visa visa;

    private MasterCard masterCard;

    private AmericanExpress americanExpress;

    @Autowired
    public CreditCardFactory(Visa visa, MasterCard masterCard, AmericanExpress americanExpress){
        this.visa = visa;
        this.masterCard = masterCard;
        this.americanExpress = americanExpress;

    }

    private static final Pattern VISA_REGEX = Pattern.compile("^4");
    private static final Pattern MASTERCARD_REGEX = Pattern.compile("^5[1-5]");
    private static final Pattern AMEX_REGEX = Pattern.compile("^3[47]");

    public CreditCard getCreditCard(String cardNumber){

        if(VISA_REGEX.matcher(cardNumber).find()){
            return visa;
        } else if(MASTERCARD_REGEX.matcher(cardNumber).find()){
            return masterCard;
        } else if(AMEX_REGEX.matcher(cardNumber).find()){
            return americanExpress;
        } else{
           throw new IllegalArgumentException("Wrong card number, please check it");
        }
    }
}
