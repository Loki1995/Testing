package com.assign;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mmtrip
{
	WebDriver browser = new ChromeDriver();
	
		
		public void makemytrip(String expectedfromCity) throws InterruptedException
		{

			
			browser.get("https://www.makemytrip.com/");
			Thread.sleep(5000);
			WebElement fromButton = browser.findElement(By.xpath("//*[@for='fromCity']"));
			fromButton.click();
			WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='react-autowhatever-1']//li[1]")));
			List<WebElement> Fromlocation = browser.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
			int size = Fromlocation.size();
			
			for(int i=1;i<=size;i++)
			{
				String FromCityCode = browser.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]//div[2]")).getText();
				if(expectedfromCity.equalsIgnoreCase(FromCityCode))
				{
					System.out.println(FromCityCode);
					browser.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).click();
					break;
				}
				
			}
		
		}
		public void mmtto(String city)
		{
			browser.findElement(By.xpath("//input[@id='toCity']")).click();
			WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='react-autowhatever-1']//li[1]")));
			List<WebElement> allcity = browser.findElements(By.xpath("//div[@id='react-autowhatever-1']//p[1]"));
			for (WebElement eachcity:allcity)
			{
				String actualcity=eachcity.getText();
				if(actualcity.equalsIgnoreCase(city))
				{
					eachcity.click();
					break;
				}
			}
			
		}

		public static void main(String[] args) throws InterruptedException
		{
			// TODO Auto-generated method stub
			Mmtrip obj = new Mmtrip();
			obj.makemytrip("CCU");
			obj.mmtto("Dubai, United Arab Emirates");
		}


	
}