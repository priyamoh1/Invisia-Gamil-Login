package com.gmail.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.InboxPage;
import com.crm.objectRepository.LoginPage;

public class TC_012_VerifybackButtonAfterLogoutTest extends BaseClass
{
	@Test
	public void test12() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.getUsernametxtEdt().sendKeys("priyatest50");
		login.getNext().click();
		Thread.sleep(8000);
		login.getPasswordtxtEdt().sendKeys("Invisia@1");
		login.getNext().click();
		InboxPage in = new InboxPage(driver);
		in.account(driver);
		driver.switchTo().frame("account");
		in.logout1();
		driver.navigate().back();
		WebElement message = driver.findElement(By.xpath("//span[.='Choose an account']"));
		String str=message.getText();
		System.out.println(str);
		if(str.contains("Choose"))
		{
			System.out.println("test case TC_012 passed");
		}
		else
		{
			System.out.println("test case TC_012 failed");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
