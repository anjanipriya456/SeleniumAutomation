package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

	
	
	private static By downloadbitLocator=(By.partialLinkText("64 bit Windows IE"));
	 
	
	public static void clickOn64Bit(WebDriver driver)
	{
		driver.findElement(downloadbitLocator).click();
	}
}
