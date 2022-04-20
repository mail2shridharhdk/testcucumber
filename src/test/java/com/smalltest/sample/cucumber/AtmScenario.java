//package com.smalltest.sample.cucumber;
//
//import org.hamcrest.core.Is.is;
//import org.junit.Assert.assertFalse;
//import org.junit.Assert.assertThat;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class AtmScenario {
//
//    private Atm atm;
//    private Account account;
//    private CreditCard creditCard;
//
//    private int money;
//
//    @Given("^the account balance is (\\d*)$")
//    public void createAccount(int balance) {
//        account = new Account(balance);
//    }
//
//    @And("^the card is valid$")
//    public void createCreditCard() {
//        creditCard = new CreditCard(account);
//    }
//
//    @And("^the machine contains (\\d*)$")
//    public void createATM(int money) {
//        atm = new Atm(money);
//    }
//
//    @When("^the Account Holder requests (\\d*)$")
//    public void requestMoney(int amount) {
//        money = atm.requestMoney(creditCard, amount);
//    }
//
//    @Then("^the ATM should dispense (\\d*)$")
//    public void checkMoney(int amount) {
//        assertThat(money, is(amount));
//    }
//
//    @And("^the account balance should be (\\d*)$")
//    public void checkBalance(int newBalance) {
//        assertThat(newBalance, is(creditCard.getAccount().getBalance()));
//    }
//
//    @And("^the card should be returned$")
//    public void cardShouldBeReturned() {
//        assertFalse(creditCard.isInUse());
//    }
//
//}