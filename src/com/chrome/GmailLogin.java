package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin");
		driver.findElement(By.id("identifierId")).sendKeys("rajshrijaiswal717@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		

	}

}
