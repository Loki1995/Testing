package com.checkingpush;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

			public void login() {
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				driver.manage().window().maximize();
				
				WebElement name = driver.findElement(By.name("email"));
				name.sendKeys("ramkumar@gmail.com");
				WebElement pass = driver.findElement(By.id("pass"));
				pass.sendKeys("ramraj");
				WebElement click = driver.findElement(By.name("login"));
				click.click();
			}
	public static void main(String[] args) {
			Dummy d = new Dummy();
			
			d.login();

	}

}
