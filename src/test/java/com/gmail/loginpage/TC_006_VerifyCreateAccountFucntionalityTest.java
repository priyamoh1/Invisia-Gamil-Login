package com.gmail.loginpage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.WebDriverUtility;
import com.crm.objectRepository.LoginPage;

public class TC_006_VerifyCreateAccountFucntionalityTest  extends BaseClass 
{
	@Test
public void test6() throws AWTException, InterruptedException
{
	LoginPage login = new LoginPage(driver);
	login.getCreatenewaccount().click();
	
	WebDriverUtility util = new WebDriverUtility();
	util.robotup();
	Thread.sleep(5000);
	
	WebElement message = driver.findElement(By.xpath("//span[.=\"Create your Google Account\"]"));
	String error=message.getText();
	
	if(error.contains("Create"))
	{
		System.out.println("Test case TC_006 is passed");
	}
	else
	{
		System.out.println("Test case TC_006 is failed");
	}
	
			
	driver.quit();
	
	
}
}
