package Samp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demotest {
	
public void drop(String expectedCountry) throws InterruptedException
{
	WebDriver browser= new EdgeDriver();
	browser.get("https://www.makemytrip.com/");
	browser.manage().window().maximize();
	Thread.sleep(5000);
	browser.findElement(By.cssSelector("hsw_autocomplePopup autoSuggestPlugin")).click();
	WebDriverWait wait=new WebDriverWait(browser,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("li#react-autowhatever-1-section-0-item-0")));
	java.util.List<WebElement> allcountry =browser.findElements(By.cssSelector("li#react-autowhatever-1-section-0-item-0"));
	//List<WebElement> allCountries = browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
	for (WebElement eachValue :allcountry)
	{
		String actualCountry = eachValue.getText();
		if(actualCountry.equalsIgnoreCase(expectedCountry))
		{
			eachValue.click();
			break;
		}
	}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demotest d= new Demotest();
		d.drop("Mumbai");

	}

}
