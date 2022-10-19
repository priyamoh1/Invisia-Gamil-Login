package com.gmail.loginpage;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.WebDriverUtility;
import com.crm.objectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_013_CheckLoginWithDifferentCredentialWithSameBrowserTest extends BaseClass
{
	@Test
	public void test13() throws InterruptedException, AWTException
	{
		WebDriverUtility web = new WebDriverUtility();
		LoginPage login = new LoginPage(driver);
		login.getUsernametxtEdt().sendKeys("priyatest50");
		login.getNext().click();
		Thread.sleep(8000);
		login.getPasswordtxtEdt().sendKeys("Invisia@1");
		login.getNext().click();
		
		web.newtab();
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://gmail.com");
		String title=driver.getCurrentUrl();
		if(title.contains("inbox"))
		{
			System.out.println("Test case TC_013 passed");
		}
		else
		{
			System.out.println("Test case TC_013 failed");
		}
        
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		Thread.sleep(8000);
		login.getUsernametxtEdt().sendKeys("priyatest50");
		login.getNext().click();
		Thread.sleep(8000);
		login.getPasswordtxtEdt().sendKeys("Invisia@1");
		login.getNext().click();
	}


}
