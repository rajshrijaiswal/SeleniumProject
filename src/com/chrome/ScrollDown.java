package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement elem=driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
        js.executeScript("arguments[0].scrollIntoView(true);", elem);
	}

}
