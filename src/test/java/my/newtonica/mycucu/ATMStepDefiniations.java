package my.newtonica.mycucu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycucu.Account;
import mycucu.MachineBal;

public class ATMStepDefiniations {

	Account acct1 ;
	MachineBal atmBal;	
	@Given("the account balance is {int}")
	public void the_account_balance_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    acct1 = new Account();
	    acct1.setAccountNbr(12345);
	    acct1.setAccountBal(int1);
	    acct1.setCardNbr(4567);
	    
	    atmBal = new MachineBal();
	    atmBal.setBalance(100);
	}
	@Given("the card is valid")
	public void the_card_is_valid() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(4567, acct1.getCardNbr());
	}
	@Given("the machine contains {int}")
	public void the_machine_contains(Integer int1) {
		atmBal.setBalance(int1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("the Account Holder requests {int}")
	public void the_account_holder_requests(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if(acct1.getAccountBal()<int1)
		{
			throw new io.cucumber.java.PendingException("No Balance with Account");
		}else
			if(atmBal.getBalance()<int1)
				throw new io.cucumber.java.PendingException("No Balance in ATM");
			
	}
	@Then("the ATM should dispense {int}")
	public void the_atm_should_dispense(Integer int1) {
			atmBal.setBalance(atmBal.getBalance() -int1);
	}
	@Then("the account balance should be {int}")
	public void the_account_balance_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		acct1.setAccountBal(acct1.getAccountBal()-int1);
	    
	}
	@Then("the card should be returned")
	public void the_card_should_be_returned() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	}
}
