package com.gmail.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_004_VerifyForgotEmailFunctionalityTest extends BaseClass
{
	@Test
	public void test4()
	{
		LoginPage login = new LoginPage(driver);
		login.getForgotemail().click();


		WebElement message = driver.findElement(By.xpath("//span[.=\"Find your email\"]"));
		String error=message.getText();

		if(error.contains("Find"))
		{
			System.out.println("Test case TC_004 is passed");
		}
		else
		{
			System.out.println("Test case TC_004 is failed");
		}

		driver.quit();
	}
}
