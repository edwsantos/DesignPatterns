package com.infinity.designpattern.abstractfactory.concretecreditcard;

import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class JPMorganCreditCard implements CreditCard {
    public String getName() {
        return "JPMorganCreditCard";
    }

    public double getManagementFee() {
        return 3.0;
    }
}
