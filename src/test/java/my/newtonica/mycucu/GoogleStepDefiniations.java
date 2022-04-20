package my.newtonica.mycucu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefiniations {
	
	ChromeDriver driver =null;
	@Given("user has opened browser")
	public void user_has_opened_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
	}
	@Given("user browses to https:\\/\\/www.google.com")
	public void user_browses_to_https_www_google_com() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");
	}
	@When("user types {string} in search box")
	public void user_types_in_search_box(String queryText) {
	    // Write code here that turns the phrase above into concrete actions
	    	WebElement searchBox = driver.findElement(By.name("q"));
	    	searchBox.sendKeys(queryText);
	}
	@When("user presses enter")
	public void user_presses_enter() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement searchBox = driver.findElement(By.name("q"));
    	searchBox.sendKeys(Keys.ENTER);
	}
	@Then("title must start with {string}")
	public void title_must_start_with(String expectedTitleStartwith) {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(driver.getTitle().startsWith(expectedTitleStartwith));
	}
	//////
	@Given("user is on google home page")
	public void user_is_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.google.com");
	}
	@Given("user searches for {string}")
	public void user_searches_for(String queryText) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement searchBox =driver.findElement(By.name("q"));
	    searchBox.sendKeys(queryText);
	    searchBox.sendKeys(Keys.ENTER);
	    
	}

}
