package com.infinity.designpattern.factory.factory;

import com.infinity.designpattern.factory.definition.CreditCard;
import com.infinity.designpattern.factory.implementation.AmericanExpress;
import com.infinity.designpattern.factory.implementation.MasterCard;
import com.infinity.designpattern.factory.implementation.Visa;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CreditCardFactoryTest {

    @Mock
    Visa visa;

    @Mock
    MasterCard masterCard;

    @Mock
    AmericanExpress americanExpress;

    @InjectMocks
    CreditCardFactory creditCardFactory;

    @Test
    public void getVisaCreditCard(){
        String cardNumber = "4123456789012345";
        CreditCard creditCard = creditCardFactory.getCreditCard(cardNumber);
        Assert.assertThat(creditCard, Matchers.notNullValue());
        Assert.assertThat(creditCard, Matchers.instanceOf(Visa.class));
    }

    @Test
    public void getMasterCardCreditCard(){
        String cardNumber = "5555555555555555";
        CreditCard creditCard = creditCardFactory.getCreditCard(cardNumber);
        Assert.assertThat(creditCard, Matchers.notNullValue());
        Assert.assertThat(creditCard, Matchers.instanceOf(MasterCard.class));
    }

    @Test
    public void getAmericanExpressCreditCard(){
        String cardNumber = "3434343434343434";
        CreditCard creditCard = creditCardFactory.getCreditCard(cardNumber);
        Assert.assertThat(creditCard, Matchers.notNullValue());
        Assert.assertThat(creditCard, Matchers.instanceOf(AmericanExpress.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getCreditCardWhenWrongNumber(){
        String cardNumber = "9999999999999999";
        creditCardFactory.getCreditCard(cardNumber);
    }

}