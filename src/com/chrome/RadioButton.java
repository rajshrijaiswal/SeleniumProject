package com.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		//int radio=driver.findElements(By.xpath("//input[@name='group1']")).size();
        //System.out.println(radio);
		//List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		//System.out.println(radio.size());
		//driver.findElement(By.xpath("//input[@value='Milk']")).isSelected();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		
	}

}
