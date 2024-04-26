package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.xpath("//body/div[@id='container']")).sendKeys("7770066701");
//		String currWind=driver.getWindowHandle();
//		driver.switchTo().window(currWind);
//		driver.findElement(By.xpath("//header/div[@id='navbar']")).click();
//        driver.findElement(By.id("ap_email")).sendKeys("7770066701");
//        driver.findElement(By.id("continue")).click();
	}

}
