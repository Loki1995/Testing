package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.get("https://www.gmail.com");
		driver.get("https://www.facebook.com");
		driver.get("https://www.instagram.com");
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		driver.quit();
		Thread.sleep(5000);
		WebDriver driver1 = new ChromeDriver(); 
		driver1.get("https://www.google.com");
		driver1.navigate().to("https://www.firefox.com");
		driver1.navigate().to("https://www.flipkart.com");
		driver1.navigate().to("https://www.snapchat.com");
	 	driver1.manage().window().minimize();
		driver.navigate().back();
		driver1.navigate().forward();
		driver.navigate().refresh();
	        driver.close();
		           driver1.quit();
	}}

	