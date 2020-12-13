package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zillowSearchPage {
//	protected WebDriver driver= Driver.getDriver();
	public zillowSearchPage(){		PageFactory.initElements(Driver.getDriver(), this);	}

	@FindBy(xpath = "//button[@alt='Switch to Agent listings']/div") public WebElement searchResults;
	@FindBy(xpath = "//div/input[@type='text']") public WebElement searchField;
	@FindBy(xpath = "//div/button[@class='searchBtn zsg-search-button_text zsg-search-button_primary']") public WebElement searchButton;
/*	public WebElement searchResults=driver.findElement(By.xpath("//button[@alt='Switch to Agent listings']/div"));
	public WebElement searchField= driver.findElement(By.xpath ("//div/input[@type='text']"));
	public WebElement searchButton= driver.findElement(By.xpath ("//div/button[@class='searchBtn zsg-search-button_text zsg-search-button_primary']") );

	@FindBy(xpath = "//button[@alt='Switch to Agent listings']/div") public WebElement searchResults;
	@FindBy(xpath = "//div/input[@type='text']") public WebElement searchField;
	@FindBy(xpath = "//div/button[@class='searchBtn zsg-search-button_text zsg-search-button_primary']") public WebElement searchButton;
	@FindBy(xpath = "//div[@class='list-card-info']/a") public List<WebElement> houseForSale;
	@FindBy(xpath = "//li[@class='PaginationNumberItem-c11n-8-12-0__bnmlxt-0 brNokq']/a") public List<WebElement> pageNumber;*/

/*
	public int getSearchResults() {
//		Driver.getDriver().manage().window().maximize();
//		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.zillow.com");
		String count=searchResults.getText().replaceAll(",","");
		return Integer.parseInt(count);
	}
*/
/*
	public List<WebElement> getHouseForSale() {
		return houseForSale;
	}

	public List<WebElement> getPageNumber() {
		return pageNumber;
	}*/
}
