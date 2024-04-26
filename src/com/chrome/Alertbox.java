package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		
		
		
		

	}

}
