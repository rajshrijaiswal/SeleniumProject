package com.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://echoecho.com/htmlforms10.htm");
		 int radio=driver.findElements(By.xpath("//input[@name='group1']")).size();
		 System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		 for(int i=1;i<radio;i++) {
			 
			 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click(); 
		 
		 System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
		 String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		 if(text.equals("Cheese"))
		 {
			 Thread.sleep(2000);
			 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		 }
		}
		 int radiobutton=driver.findElements(By.xpath("//input[@type='radio']")).size();
		 System.out.println("all radio buttons are:"+radiobutton);

	}

}
