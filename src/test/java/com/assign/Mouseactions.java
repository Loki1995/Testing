package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions
{
	public void hoverclick()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions mouseaction=new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"))).clickAndHold().perform();
		//mouseaction.moveToElement(driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_home']"))).click().perform();
		
		
	}
	public void draganddrop()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		Actions mouseaction=new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.xpath("//div[@id='form:drag_content']"))).dragAndDrop(driver.findElement(By.xpath("//div[@id='form:drag_content']")),driver.findElement(By.xpath("//div[@id='form:drop_content']"))).perform();
		
	}
	public static void main(String[] args)
	{
		Mouseactions obj= new Mouseactions();
		//obj.hoverclick();
		obj.draganddrop();
		
	}

}
