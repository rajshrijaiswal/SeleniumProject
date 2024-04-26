package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
         //driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
        // driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[3]/div[2]/a/div/div/div/div[1]/img")).click();
	
	   /* driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	    driver.findElement(By.id("nav-search-submit-button")).click(); 
	    //driver.findElement(By.xpath("//*[@id=\"p_90/6741117031\"]/span/a/span")).click();//*[@id="p_123/339703"]/span/a/span
	    driver.findElement(By.xpath("//*[@id=\"p_123/339703\"]/span/a/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"p_123/46655\"]/span/a/span")).click();
	    */
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().keyDown(Keys.SHIFT).sendKeys("kurti").build().perform();
		driver.findElement(By.id("nav-search-submit-button")).click();
	
	}

}
