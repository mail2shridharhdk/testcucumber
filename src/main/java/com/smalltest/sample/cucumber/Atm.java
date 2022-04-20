package com.smalltest.sample.cucumber;

public class Atm {

    private int money;

    public Atm(int money) {
        this.money = money;
    }

    public int requestMoney(CreditCard creditCard, int amount) {
        if (!creditCard.isValid() || amount > money) {
            return 0;
        }

        amount = creditCard.getAccount().getMoney(amount);

        money = money - amount;

        return amount;
    }

}