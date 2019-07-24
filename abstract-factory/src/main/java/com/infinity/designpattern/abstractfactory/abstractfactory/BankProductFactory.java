package com.infinity.designpattern.abstractfactory.abstractfactory;

import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;
import com.infinity.designpattern.abstractfactory.concretefactory.BankOfAmericaFactory;
import com.infinity.designpattern.abstractfactory.concretefactory.JPMorganFactory;
import com.infinity.designpattern.abstractfactory.types.BankType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankProductFactory {

    private BankOfAmericaFactory bankOfAmericaFactory;
    private JPMorganFactory jpMorganFactory;

    @Autowired
    public BankProductFactory(final BankOfAmericaFactory bankOfAmericaFactory, final JPMorganFactory jpMorganFactory) {
        this.bankOfAmericaFactory = bankOfAmericaFactory;
        this.jpMorganFactory = jpMorganFactory;
    }

    public Account createSavingsAccount(BankType bankType){
        if(BankType.BankOfAmerica == bankType){
            return bankOfAmericaFactory.createSavingsAccount();
        } else if(BankType.JPMorgan == bankType){
            return jpMorganFactory.createSavingsAccount();
        } else {
            return null;
        }
    }

    public CreditCard createCreditCard(BankType bankType){
        if(BankType.BankOfAmerica == bankType){
            return bankOfAmericaFactory.createCreditCard();
        } else if(BankType.JPMorgan == bankType){
            return jpMorganFactory.createCreditCard();
        } else {
            return null;
        }
    }
}
