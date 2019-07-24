package com.infinity.designpattern.abstractfactory.concreteaccount;

import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import org.springframework.stereotype.Component;

@Component
public class BankOfAmericaSavingsAccount implements Account {
    public String getName() {
        return "BankOfAmericaSavingsAccount";
    }

    public double getManagementFee() {
        return 2.0;
    }
}
