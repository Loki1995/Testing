package com.checkingpush;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingPush {
	
	public void AmazonAcc() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

}
	public static void main(String[] args) {
		CheckingPush p = new CheckingPush();
		p.AmazonAcc();
	}
}
