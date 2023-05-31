package com.assignmentfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfb {
	public void FbLog() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jananibalakrishnan27@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Logesh@1727");
		
		WebElement login = driver.findElement(By.name("login"));
		login.clear();
		
		
	}
	
	public static void main(String[] args) {
		Loginfb f = new Loginfb();
		f.FbLog();
	}

}
