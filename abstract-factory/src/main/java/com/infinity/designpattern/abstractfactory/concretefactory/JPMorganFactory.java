package com.infinity.designpattern.abstractfactory.concretefactory;

import com.infinity.designpattern.abstractfactory.abstractfactory.BankProductFactoryDefinition;
import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;
import com.infinity.designpattern.abstractfactory.concreteaccount.JPMorganSavingsAccount;
import com.infinity.designpattern.abstractfactory.concretecreditcard.JPMorganCreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JPMorganFactory implements BankProductFactoryDefinition {
    private JPMorganSavingsAccount jpMorganSavingsAccount;
    private JPMorganCreditCard jpMorganCreditCard;

    @Autowired
    public JPMorganFactory(final JPMorganSavingsAccount jpMorganSavingsAccount,
                           final JPMorganCreditCard jpMorganCreditCard) {
        this.jpMorganSavingsAccount = jpMorganSavingsAccount;
        this.jpMorganCreditCard = jpMorganCreditCard;
    }


    public Account createSavingsAccount() {
        return jpMorganSavingsAccount;
    }

    public CreditCard createCreditCard (){
        return jpMorganCreditCard;
    }

}
