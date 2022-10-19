package com.gmail.loginpage;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_008_VerifyShowPassWordCheckBoxTest extends BaseClass
{
	@Test
	public void test8() throws InterruptedException, AWTException
	{
		LoginPage login = new LoginPage(driver);
		login.getUsernametxtEdt().sendKeys("priyatest50");
		login.getNext().click();
		Thread.sleep(8000);
		login.getPasswordtxtEdt().sendKeys("Invisia1");
		login.getPasswordtxtEdt().sendKeys(Keys.CONTROL,"A");
		login.getPasswordtxtEdt().sendKeys(Keys.CONTROL,"C");
		Thread.sleep(3000);
		//System.out.println(value);
		System.out.println("password is visible");
		System.out.println("Test case TC_008 is passed");	
		driver.quit();

	}
}
