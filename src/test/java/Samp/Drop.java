package Samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	
	public void dropdown() throws InterruptedException
	{
		WebDriver browser= new ChromeDriver();
		browser.get("https://leafground.com/select.xhtml");
		browser.manage().window().maximize();
		WebElement dd=browser.findElement(By.cssSelector("select.ui-selectonemenu"));
		Select country=new Select(dd);
		country.selectByIndex(1);
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Drop d=new Drop();
		d.dropdown();
	}

}
