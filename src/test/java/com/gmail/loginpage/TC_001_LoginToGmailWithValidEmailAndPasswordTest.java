package com.gmail.loginpage;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_001_LoginToGmailWithValidEmailAndPasswordTest extends BaseClass
{
	@Test
	public void loginTest () throws InterruptedException
	{

		LoginPage login = new LoginPage(driver);
		login.getUsernametxtEdt().sendKeys("priyatest50");
		login.getNext().click();
		Thread.sleep(8000);
		login.getPasswordtxtEdt().sendKeys("Invisia@1");
		login.getNext().click();
		System.out.println("test case TC_001 passed");
		Thread.sleep(3000);
		driver.quit();
	}
}
