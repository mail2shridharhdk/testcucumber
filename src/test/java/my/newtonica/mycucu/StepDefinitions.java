package my.newtonica.mycucu;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycucu.Calculator;

public class StepDefinitions {

	private Calculator calc = null;
	@Given("User has a calculator")
	public void user_has_a_caculator() {
	    // Write code here that turns the phrase above into concrete actions
		calc = new Calculator();
	    //throw new io.cucumber.java.PendingException();
	}
	@When("caculator is used first time")
	public void caculator_is_used_first_time() {
	    //No-operation
		// Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("result must be {int}")
	public void initial_test_result_is(Integer operand) {
	    // Write code here that turns the phrase above into concrete actions
		Integer result = calc.getResult(0, operand);
		Assertions.assertEquals(result	, operand);
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("user adds {int}")
	public void user_adds(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		Integer result = calc.getResult(int1, 0);
		Assertions.assertEquals(result, int1);
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@When("user substract {int} and {int}")
	public void user_substract_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		Integer result = calc.substract(int1,int2);
		Assertions.assertEquals(result, 100);
	}
	@Then("result substracted must be {int}")
	public void result_substracted_must_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		Integer result = calc.substract(200,int1);
		Assertions.assertEquals(result, 100);
	}
	

}
