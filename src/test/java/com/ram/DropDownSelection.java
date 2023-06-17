package com.ram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownSelection {

	public void  dropDown() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));
		
		driver.findElement(By.name("firstname")).sendKeys("Dulashi");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Raman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("dulashiraman861@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-type='password']")).sendKeys("Raman980@");
		Thread.sleep(2000);
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayDropDownSelect = new  Select(dayDropDown);
		dayDropDownSelect.selectByIndex(10);
		Thread.sleep(2000);
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthDropDownSelect = new Select(monthDropDown);
		monthDropDownSelect.selectByValue("4");
		Thread.sleep(2000);
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearDropDownSelect = new Select(yearDropDown);
		yearDropDownSelect.selectByVisibleText("1998");

		driver.quit();
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		DropDownSelection fb = new DropDownSelection();
		
		fb.dropDown();
	}

}
