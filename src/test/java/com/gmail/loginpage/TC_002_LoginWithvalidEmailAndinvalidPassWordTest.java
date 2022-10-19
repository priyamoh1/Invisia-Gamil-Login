package com.gmail.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginPage;

public class TC_002_LoginWithvalidEmailAndinvalidPassWordTest extends BaseClass
{
	@Test
public void logintest2() throws InterruptedException
{
		LoginPage login = new LoginPage(driver);
		login.getUsernametxtEdt().sendKeys("priyatest50");
		login.getNext().click();
		Thread.sleep(8000);
		login.getPasswordtxtEdt().sendKeys("Invisia1");
		login.getNext().click();
		WebElement message = driver.findElement(By.xpath("//span[.=\"Wrong password. Try again or click Forgot password to reset it.\"]"));
		String error=message.getText();
		
		if(error.contains("Wrong"))
		{
			System.out.println("Test case TC_002 is passed");
		}
		else
		{
			System.out.println("Test case TC_002 is failed");
		}
		
				
		driver.quit();
}
}
