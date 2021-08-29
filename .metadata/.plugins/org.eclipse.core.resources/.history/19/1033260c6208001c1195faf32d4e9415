package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private String expectedPageTitle = "Official Ryanair website | Book direct for the lowest fares | Ryanair.com";
	private String expectedDepartUserInput = "Lisbon";
	private String expectedDestinationUserInput = "Paris Beauvais";
	
	private By cookiesAccept = By.cssSelector("button.cookie-popup-with-overlay__button");
	private By departLocation = By.id("input-button__departure");
	private By destinationLocation = By.id("input-button__destination");
	private By lisbonAirport = By.xpath("//span[contains(text(),'Lisbon')]");
	private By parisBeauvaisAirport = By.xpath("//span[contains(text(),'Paris Beauvais')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loadHomepage() {
		driver.get("https://www.ryanair.com/gb/en");
	}
	
	public String getActualPageTitle() {
		return driver.getTitle();
	}

	public String getExpectedPageTitle() {
		return expectedPageTitle;
	}
	
	public By getDepartLocation() {
		return departLocation;
	}

	public By getCookiesAccept() {
		return cookiesAccept;
	}

	public By getLisbonAirport() {
		return lisbonAirport;
	}

	public String getExpectedDepartUserInput() {
		return expectedDepartUserInput;
	}

	public String getExpectedDestinationUserInput() {
		return expectedDestinationUserInput;
	}

	public By getDestinationLocation() {
		return destinationLocation;
	}

	public By getParisBeauvaisAirport() {
		return parisBeauvaisAirport;
	}

}
