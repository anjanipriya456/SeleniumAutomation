package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	private static By downloadsLocator=(By.linkText("Downloads"));
	
	public static void clickOnDownloads(WebDriver driver)
	{
		driver.findElement(downloadsLocator).click();
	}
}