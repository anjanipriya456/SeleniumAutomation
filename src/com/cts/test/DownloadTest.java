package com.cts.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.DashBoardPage;
import com.cts.pages.HomePage;

public class DownloadTest extends LaunchWebDriver {
	
	@Test
	
	public void Initialization() throws InterruptedException
	{
		
	    // driver.findElement(By.linkText("Downloads")).click();
		
	   //click on downloads
	   HomePage.clickOnDownloads(driver);
	
	
	   // driver.findElement(By.partialLinkText("64 bit Windows IE")).click();
	    
	   //click on 64 bit windows button 
	   DashBoardPage.clickOn64Bit(driver);
	   
	   
	   //for waiting time of page
	   Thread.sleep(5000);
	    
	    //checking the file via 2 methods
	    // method 1
       File file = new File("C:\\Users\\BLTuser.BLT035\\Downloads\\IEDriverServer_x64_3.150.1.zip");
	
        //method 2
	    boolean check = file.exists();


       //checking equals i.e., either passing or failing
       Assert.assertTrue(check, "Not Downloaded!!!");
		
//        String userName = System.getProperty("userName");
//        String fileDetails= ("C:\\Users\\" + userName + "\\Downloads\\IEDriverServer_x64_3.150.1.zip");
//	     System.out.println(fileDetails);
//	
	
	}
}
