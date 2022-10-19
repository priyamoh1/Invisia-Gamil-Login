package com.gmail.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_003_LoginWithBlankEmailorPassWordTest extends BaseClass
{
	@Test
public void logintest3()
{
	LoginPage login = new LoginPage(driver);
	login.getUsernametxtEdt().sendKeys("");
	login.getNext().click();
	
	WebElement message = driver.findElement(By.xpath("//div[.=\"Enter an email or phone number\"]"));
	String error=message.getText();
	
	if(error.contains("Enter an email"))
	{
		System.out.println("Test case TC_003 is passed");
	}
	else
	{
		System.out.println("Test case TC_003 is failed");
	}
	
	driver.quit();
}
}