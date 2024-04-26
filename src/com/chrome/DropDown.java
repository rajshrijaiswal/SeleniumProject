package com.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://spiceclub.spicejet.com/signup");
	     driver.manage().window().maximize();
	     
	     Select dropdown=new Select(driver.findElement(By.xpath("//select[@class='form-control form-select ']")));
	     dropdown.selectByIndex(2);
	     
	     driver.findElement(By.id("first_name")).sendKeys("Rajshri");
	     driver.findElement(By.id("last_name")).sendKeys("Jaiswal");
	     
	     Select country=new Select(driver.findElement(By.xpath("//select[@class='form-control form-select']")));
	     country.selectByVisibleText("India");
	     
	     driver.findElement(By.id("email_id")).sendKeys("rajshrijaiswal717@gmail.com");
	     List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	     System.out.println("total checkbox:"+checkbox.size());
	     WebElement check=driver.findElement(By.id("defaultCheck1"));
	     check.click();
	     //System.out.println(checkbox.get(0).isSelected());
	     

	}

}
