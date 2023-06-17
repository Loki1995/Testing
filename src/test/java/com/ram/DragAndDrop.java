package com.ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {
	
	public void dragAndDrop() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-Notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://leafground.com/drag.xhtml");
		Actions mouseAction = new Actions(driver);
		mouseAction.moveToElement(driver.findElement(By.xpath("//*[@id='form:drag_content']"))).dragAndDrop(driver.findElement(By.xpath("//*[@id='form:drag_content']")),driver.findElement(By.xpath("//*[@id='form:drop_header']"))).perform();
		
		
		
	}

	public static void main(String[] args) {
		
		DragAndDrop n = new DragAndDrop();
		n.dragAndDrop();
	}

}
