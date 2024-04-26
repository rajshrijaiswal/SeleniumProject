package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAGandDROPaccept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#accepted-elements");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
        Actions act=new Actions(driver);
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        WebElement drag1=driver.findElement(By.id("draggable-nonvalid"));
        act.dragAndDrop(drag, drop).build().perform();
        act.dragAndDrop(drag1, drop).build().perform();
	   
	
	}

}
