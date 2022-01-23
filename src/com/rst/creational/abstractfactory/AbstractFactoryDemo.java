package com.rst.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        int creditScore = 775;
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(creditScore);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        Validator validator = abstractFactory.getValidator(CardType.PLATINUM);
        System.out.println(card.getClass());
        System.out.println(validator.isValid());

        int newCreditScore = 500;
        abstractFactory = CreditCardFactory.getCreditCardFactory(newCreditScore);
        CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLDEN);
        Validator validator1 = abstractFactory.getValidator(CardType.GOLDEN);
        System.out.println(card1.getClass());
        System.out.println(validator1.isValid());
    }
}
