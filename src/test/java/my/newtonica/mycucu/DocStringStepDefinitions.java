package my.newtonica.mycucu;

import com.smalltest.sample.cucumber.Color;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonNode;

public class DocStringStepDefinitions {

	private static Logger log=LoggerFactory.getLogger(DocStringStepDefinitions.class);
	@Given("I have data in doc string")
	public void i_have_doc_String(String str) {
		log.info(()->str);
	}
	
	@Given("I have data in doc string in json")
	public void i_have_doc_json_String(JsonNode str) {
		log.info(()->str.get("password").asText());
	}
	
	@Given("^I have 2 (red|blue|yellow) t-shirts$")
	public void colorreg(Color col) {
		log.info(()->col.toString());
	}
	
}
