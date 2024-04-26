package com.chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//simple confirm button OK
		/*driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		//inside the frame have button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
        */
		
		
		//OK AND CANCEL BUTTON
		/*
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		//inside the frame have button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().dismiss();
		 */
		
		
		//sometimes send the message in Prompt Alert
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//inside the frame have button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().sendKeys("Hi I am Rajshri");
		driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		Alert alert=driver.switchTo().alert();
		String al=alert.getText();
		System.out.println(al);
		
		 
		
		
	}

}
