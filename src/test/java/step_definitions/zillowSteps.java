package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.zillowPropertyPage;
import pages.zillowSearchPage;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class zillowSteps {
//	protected WebDriver driver = Driver.getDriver();
	zillowSearchPage zSearchPage = new zillowSearchPage();
//	zillowPropertyPage zPropertyPage = new zillowPropertyPage();

	@Given("User is on the Zillow.com webpage")
	public void user_is_on_the_zillow_com_webpage() {
/*		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		Driver.getDriver().get("https://www.zillow.com");
//		System.out.println("User is on the Zillow.com webpage");
	}

	@Given("User verifies the title")
	public void userVerifiesTheTitle() {
		String actualTitle= Driver.getDriver().getTitle();
		String expectedTitle= "Zillow: Real Estate, Apartments, Mortgages & Home Values";
		Assert.assertEquals("The titles don't match!", actualTitle,expectedTitle);
	}

	@Given("User inputs {string} in the Zillow.com home page")
	public void user_inputs_in_the_zillow_com_home_page(String zipCode) {
		zSearchPage.searchField.sendKeys(zipCode);
//		System.out.println("User inputs {zipCode} in the Zillow.com home page");
	}
	@Given("User presses search button")
	public void user_presses_search_button() {
		zSearchPage.searchButton.click();
//		System.out.println("User presses search button");
	}
	@Then("User should see number of properties")
	public void user_should_see_number_of_properties() {
		String count=zSearchPage.searchResults.getText().replaceAll(",","");
		int result = Integer.parseInt(count);

		System.out.println("User should see number of properties = "+result);
	}


/*	@Test
	public void zillowSearchTest(){
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zillow.com");
		zSearchPage.searchField.sendKeys("77079"+ Keys.ENTER);
		System.out.println("Search results:"+zSearchPage.getSearchResults());;

	}*/
}
