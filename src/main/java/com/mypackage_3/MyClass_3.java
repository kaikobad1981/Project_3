package com.mypackage_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass_3 {
public static WebDriver driver;
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
		driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}    

}
