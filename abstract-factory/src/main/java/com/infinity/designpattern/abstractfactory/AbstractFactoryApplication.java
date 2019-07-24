package com.infinity.designpattern.abstractfactory;

import com.infinity.designpattern.abstractfactory.abstractfactory.BankProductFactory;
import com.infinity.designpattern.abstractfactory.abstractproduct.Account;
import com.infinity.designpattern.abstractfactory.abstractproduct.CreditCard;
import com.infinity.designpattern.abstractfactory.types.BankType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

    private static BankProductFactory bankProductFactory;

    @Autowired
    public AbstractFactoryApplication(BankProductFactory bankProductFactory) {
        AbstractFactoryApplication.bankProductFactory = bankProductFactory;
    }

    public static void main(String[] args){
        SpringApplication.run(AbstractFactoryApplication.class, args);

        //Bank of America savings account
        System.out.println("Creating savings account for Bank Of America");
        final Account accountBOA = bankProductFactory.createSavingsAccount(BankType.BankOfAmerica);
        System.out.println(accountBOA);

        System.out.println();
        System.out.println("Creating savings account for JPMorgan");
        final Account accountJPM = bankProductFactory.createSavingsAccount(BankType.JPMorgan);
        System.out.println(accountJPM);

        System.out.println();
        System.out.println("Creating credit card for Bank Of America");
        final CreditCard creditCardBOA = bankProductFactory.createCreditCard(BankType.BankOfAmerica);
        System.out.println(creditCardBOA);

        System.out.println();
        System.out.println("Creating credit card for JPMorgan");
        final CreditCard creditCardJPM = bankProductFactory.createCreditCard(BankType.JPMorgan);
        System.out.println(creditCardJPM);
    }
}
