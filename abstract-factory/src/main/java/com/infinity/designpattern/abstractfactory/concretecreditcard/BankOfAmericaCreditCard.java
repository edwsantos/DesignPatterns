package com.infinity.designpattern.abstractfactory.concretecreditcard;

import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class BankOfAmericaCreditCard implements CreditCard {
    public String getName() {
        return "BankOfAmericaCreditCard";
    }

    public double getManagementFee() {
        return 4.0;
    }
}
