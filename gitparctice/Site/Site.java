package com.Site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Site {

	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sanji.to/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();

	}

	public static void main(String[] args) {
		Site s = new Site();
		s.launch();

	}
}
