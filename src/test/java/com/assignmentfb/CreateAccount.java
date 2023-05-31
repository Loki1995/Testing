package com.assignmentfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public void AmazonAcc() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		signin.click();
		WebElement create = driver.findElement(By.id("createAccountSubmit"));
		create.click();
		WebElement username = driver.findElement(By.name("customerName"));
		username.sendKeys("JananiBalakrishnan");
		WebElement mobilenum = driver.findElement(By.name("email"));
		mobilenum.sendKeys("908744393");
		WebElement email = driver.findElement(By.name("secondaryLoginClaim"));
		email.sendKeys("jananibalakrishn27@gmail.com");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123");
		WebElement cont = driver.findElement(By.className("a-button-input"));
		cont.click();
		
	}
	
	public static void main(String[] args) { 
		CreateAccount c = new CreateAccount();
		c.AmazonAcc();
	}

}
