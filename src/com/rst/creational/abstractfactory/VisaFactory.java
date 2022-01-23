package com.rst.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLDEN:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLDEN:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
        }
        return null;
    }
}
