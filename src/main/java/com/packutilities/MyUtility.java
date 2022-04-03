package com.packutilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mypackage_3.MyClass_3;

public class MyUtility extends MyClass_3{
	public static WebElement getExplicitWait(WebElement ele,long time){
		WebDriverWait wait= new WebDriverWait(driver,time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
		
	}

}
