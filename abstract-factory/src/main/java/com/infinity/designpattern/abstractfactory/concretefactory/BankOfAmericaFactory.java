package com.infinity.designpattern.abstractfactory.concretefactory;

import com.infinity.designpattern.abstractfactory.abstractfactory.BankProductFactoryDefinition;
import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;
import com.infinity.designpattern.abstractfactory.concreteaccount.BankOfAmericaSavingsAccount;
import com.infinity.designpattern.abstractfactory.concretecreditcard.BankOfAmericaCreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankOfAmericaFactory implements BankProductFactoryDefinition {
    private BankOfAmericaSavingsAccount bankOfAmericaSavingsAccount;
    private BankOfAmericaCreditCard bankOfAmericaCreditCard;

    @Autowired
    public BankOfAmericaFactory(final BankOfAmericaSavingsAccount bankOfAmericaSavingsAccount,
                                final BankOfAmericaCreditCard bankOfAmericaCreditCard) {
        this.bankOfAmericaSavingsAccount = bankOfAmericaSavingsAccount;
        this.bankOfAmericaCreditCard = bankOfAmericaCreditCard;
    }


    public Account createSavingsAccount() {
        return bankOfAmericaSavingsAccount;
    }

    public CreditCard createCreditCard (){
        return bankOfAmericaCreditCard;
    }

}
