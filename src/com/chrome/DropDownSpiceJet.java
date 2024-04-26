package com.chrome;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownSpiceJet {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://book.spicejet.com/");
	     driver.manage().window().maximize();
	     Select s=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
         //s.selectByIndex(4);
	     s.selectByVisibleText("BDT");
	    driver.findElement(By.id("divpaxinfo")).click();
	   
	    Select sm=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
	
	    sm.selectByIndex(5);
	    Select child=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
	    child.selectByValue("2");
	    
	    Select infant=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
	    infant.selectByIndex(1);
	    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	    
	    driver.findElement(By.xpath("//a[@value='RDP']")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[19]/form/div[2]/div/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[8]/a")).click();
	   driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
	    //driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp")).click();
	   /* List<WebElement> chechbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	   System.out.println(chechbox.size()); */
	   
	   //another way to count checkbox in your webbrowser
	   int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	   System.out.println("checkbox are:"+count);
	   System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
	   for(int i=1;i<count;i++) {
		   
		   driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
	       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	   }
	   
	   
	}

}
