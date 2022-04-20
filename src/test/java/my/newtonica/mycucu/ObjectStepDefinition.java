package my.newtonica.mycucu;

import java.util.List;

import com.smalltest.sample.cucumber.User;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.Given;

public class ObjectStepDefinition {

	private static Logger log=LoggerFactory.getLogger(ObjectStepDefinition.class);
	@Given("I have data in table with userobject")
	public void i_have_object_Mapping(List<User> user) {
		log.info(()->user.toString());
	}
}
