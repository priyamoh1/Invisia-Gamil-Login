package com.gmail.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_005_VerifyForgotPasswordFunctionalityTest extends BaseClass
{
	@Test
public void test5() throws InterruptedException
{
	LoginPage login = new LoginPage(driver);
	login.getUsernametxtEdt().sendKeys("priyatest50");
	login.getNext().click();
	Thread.sleep(6000);
	login.getForgotpassword().click();
	WebElement message = driver.findElement(By.xpath("//span[.=\"Account recovery\"]"));
	String error=message.getText();
	
	if(error.contains("Account"))
	{
		System.out.println("Test case TC_005 is passed");
	}
	else
	{
		System.out.println("Test case TC_005 is failed");
	}
	
			
	driver.quit();
}
}
