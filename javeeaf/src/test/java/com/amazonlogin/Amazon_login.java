package com.amazonlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_login {
		
		public static void main(String[] args) throws InterruptedException
		// TODO Auto-generated constructor stub
		{
			WebDriver driver = new FirefoxDriver();			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			WebElement signin = driver.findElement(By.id("nav-link-accountList"));
			signin.click();
			WebElement create = driver.findElement(By.id("createAccountSubmit"));
			create.click();
			WebElement username = driver.findElement(By.name("customerName"));
			username.sendKeys("shaik moiden");
			WebElement mobilenum = driver.findElement(By.name("email"));
			mobilenum.sendKeys("9626336885");
			WebElement email = driver.findElement(By.name("secondaryLoginClaim"));
			email.sendKeys("shaik99657233@gmail.com");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("Shaik@123");
			WebElement cont = driver.findElement(By.className("a-button-input"));
			cont.click();
			
		}
		}