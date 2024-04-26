package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatoterUse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String curWindowhandle=driver.getWindowHandle();
		driver.switchTo().window(curWindowhandle);
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        driver.findElement(By.partialLinkText("Onesie")).click();
	}

}
