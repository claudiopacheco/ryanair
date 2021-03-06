package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class Access_homepageSteps {
	
	private static WebDriver driver;
	private HomePage homePage = new HomePage(driver);
	
	@Before
	public static void startup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user navigates to the homepage")
	public void user_navigates_to_the_homepage() {
		homePage.loadHomepage();
		assertEquals(homePage.getExpectedPageTitle(), homePage.getActualPageTitle());
		driver.findElement(homePage.getCookiesAccept()).click();
	}

	@When("the user provides a Departure location")
	public void the_user_provides_a_departure_location() {
		driver.findElement(homePage.getDepartLocation()).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(homePage.getDepartLocation()).sendKeys("Lisbon");
		driver.findElement(homePage.getLisbonAirport()).click();
		//assertEquals(homePage.getExpectedDepartUserInput(), driver.findElement(homePage.getDepartLocation().getText()));
	}
	
	@When("the user provides a Destination location")
	public void the_user_provides_a_destination_location() {
		driver.findElement(homePage.getDestinationLocation()).sendKeys("Paris Beauvais");
		driver.findElement(homePage.getParisBeauvaisAirport()).click();
	}
	
	@When("the user provides a Depart date")
	public void the_user_provides_a_depart_date() {
		driver.findElement(By.id("ry-tooltip-7")).click();
	}

	@When("the user provides a Return date")
	public void the_user_provides_a_return_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user provides the amount of adults")
	public void the_user_provides_the_amount_of_adults() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user provides the amount of children")
	public void the_user_provides_the_amount_of_children() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks on Search")
	public void the_user_clicks_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the flight options are loaded")
	public void the_flight_options_are_loaded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@After
	public static void teardown() {
		driver.quit();
	}
	
}
