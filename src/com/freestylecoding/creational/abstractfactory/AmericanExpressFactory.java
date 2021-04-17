package com.freestylecoding.creational.abstractfactory;

public class AmericanExpressFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLDEN:
                return new AmericanExpressGoldCreditCard();
            case PLATINUM:
                return new AmericanExpressPlatinumCreditCard();
            default:
                break;
        }
        return null;
    }


    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLDEN:
                return new AmericanExpressGoldValidator();
            case PLATINUM:
                return new AmericanExpressPlatinumValidator();
        }
        return null;
    }
}
