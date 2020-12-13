package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class zillowPropertyPage {
	/*protected WebDriver driver = Driver.getDriver();
	public zillowPropertyPage(){ PageFactory.initElements(driver, this);	}
	@FindBy(xpath = "(//h1/span[1])[1]")
		public WebElement propertyStreetAddress;
	@FindBy(xpath = "(//h3/span[@class='ds-bed-bath-living-area'])[1]")
		public WebElement numberOfBedrooms;
	@FindBy(xpath = "(//button/span[@class='ds-bed-bath-living-area'])[1]")
		public WebElement numberOfBathrooms;
	@FindBy(xpath = "(//h3/span[@class='ds-bed-bath-living-area'])[2]/span[1]")
		public WebElement squareFeet;
	@FindBy(xpath = "(//span/span[@class='Text-c11n-8-11-1__aiai24-0 gkjXpA'])[1]")
		public WebElement zestimate;
	@FindBy(xpath = "//div/div/h5[@class='Text-c11n-8-11-1__aiai24-0 StyledHeading-c11n-8-11-1__ktujwe-0 fhWabZ sc-fznZeY dwfIAf']")
		public WebElement monthlyCost;
	@FindBy(xpath = "(//div[@class='Flex-c11n-8-11-1__n94bjd-0 guJILm'])[2]")
		public WebElement zestimateRent;
	@FindBy(xpath = "(//div/h4[@class='Text-c11n-8-11-1__aiai24-0 StyledHeading-c11n-8-11-1__ktujwe-0 kEZgBM hdp__qf5kuj-3 czKGOp'])[1]")
		public WebElement listedPrice;
	@FindBy(xpath = "//li[@class='PaginationNumberItem-c11n-8-12-0__bnmlxt-0 brNokq']/a")
		public List<WebElement> pageNumber;

	public String getPropertyStreetAddress() {
		return propertyStreetAddress.getText();
	}

	public int getNumberOfBedrooms() {
		return Integer.parseInt(numberOfBedrooms.getText());
	}

	public int getNumberOfBathrooms() {
		return Integer.parseInt(numberOfBathrooms.getText());
	}

	public int getSquareFeet() {
		String sqFt=squareFeet.getText().replaceAll(",","");
		return Integer.parseInt(sqFt);
	}

	public int getZestimate() {
		String zest=zestimate.getText().replaceAll(",","");
		return Integer.parseInt(zest);
	}

	public int getMonthlyCost() {
		String monthly=monthlyCost.getText().replaceAll(",","");
		return Integer.parseInt(monthly);
	}

	public int getZestimateRent() {
		String zestRent=zestimateRent.getText().replaceAll(",","");
		return Integer.parseInt(zestRent);
	}

	public int getListedPrice() {
		String price=listedPrice.getText().replaceAll(",","");
		return Integer.parseInt(price);
	}*/

}
