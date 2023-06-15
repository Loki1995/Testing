package com.ram;

import java.time.Duration; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {
	
	public void makeMyTripFrom(String expectedFromCity) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-Notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		WebElement fromButton = driver.findElement(By.xpath("//*[@for='fromCity']"));
		fromButton.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='react-autowhatever-1']//li[1]")));
		List<WebElement> fromLocation = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
		int size = fromLocation.size();
		
		for (int i=1;i<=size;i++) {
			String fromCityCode = driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]//div[2]")).getText();
			if(expectedFromCity.equalsIgnoreCase(fromCityCode)) {
				System.out.println(fromCityCode);
				driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).click();
				break;
			}
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		MakeMyTrip b = new MakeMyTrip();
		b.makeMyTripFrom("BKK");

	}

}
