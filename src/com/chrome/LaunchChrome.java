package com.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\SHRINIVAS SIR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        String tittle=driver.getTitle();
        System.out.println("title page:"+tittle);
        String url=driver.getCurrentUrl();
        System.out.println("url"+url);
        driver.close();
        
        
	}

}
