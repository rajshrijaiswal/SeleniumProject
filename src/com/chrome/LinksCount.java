package com.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		int link=driver.findElements(By.tagName("a")).size();
		System.out.println("Links are in webPage: "+link);
		List<WebElement> alllink=driver.findElements(By.tagName("a"));
		for(WebElement link1:alllink) {
			System.out.println(link1.getText());
		}
		
		/*for(int i=0;i<link;i++) {
			driver.findElements(By.tagName("a")).get(i).click();
			System.out.println();
		}*/
		WebElement headerLink=driver.findElement(By.id("nav-xshop-container"));
		System.out.println("Header links are: "+headerLink.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("navFooter"));
		
		System.out.println("footer links are: "+footer.findElements(By.tagName("a")).size());
        
	}

}
