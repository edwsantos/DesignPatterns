package com.infinity.designpattern.abstractfactory.concreteaccount;

import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import org.springframework.stereotype.Component;

@Component
public class JPMorganSavingsAccount implements Account {

    public String getName() {
        return "JPMorganSavingsAccount";
    }

    public double getManagementFee() {
        return 1.0;
    }
}
