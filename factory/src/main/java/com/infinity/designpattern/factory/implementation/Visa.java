package com.infinity.designpattern.factory.implementation;

import com.infinity.designpattern.factory.definition.CreditCard;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Visa implements CreditCard {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public String getType(){
        return "VISA credit card";
    }
}
