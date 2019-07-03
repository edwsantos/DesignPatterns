package com.infinity.designpattern.factory;

import com.infinity.designpattern.factory.factory.CreditCardFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    private CreditCardFactory creditCardFactory;

    @Autowired
    public FactoryApplication(CreditCardFactory creditCardFactory){
        this.creditCardFactory = creditCardFactory;

    }

    public static void main(String[] args){
        SpringApplication.run(FactoryApplication.class, args);

    }
}
