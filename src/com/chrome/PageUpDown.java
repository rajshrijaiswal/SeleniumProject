package com.chrome;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageUpDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		/*((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(4000,0)");
*/
		Actions act=new Actions(driver);
		for(int i=0;i<20;i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
	}

}
