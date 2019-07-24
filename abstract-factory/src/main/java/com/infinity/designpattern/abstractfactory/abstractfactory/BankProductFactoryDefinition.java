package com.infinity.designpattern.abstractfactory.abstractfactory;

import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;

public interface BankProductFactoryDefinition {
    Account createSavingsAccount();
    CreditCard createCreditCard();
}
