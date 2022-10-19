package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author SanjayBabu
 *
 */
public class InboxPage extends WebDriverUtility{
	//WebDriver driver;
	//declaretion
	@FindBy(linkText = "Organizations")
	private WebElement organisationsLnk;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLnk;

	@FindBy(linkText = "Products")
	private WebElement productsLnk;

	@FindBy(xpath= "(//span[@jsaction=\"click:vyP2Ce\"])[3]")
	private WebElement logout;

	@FindBy(xpath = "//a[@class=\"gb_A gb_La gb_f\"]")
	private WebElement administratorLnk;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutLnk;

	//initialization
	public InboxPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//utilization
	
	
	public void account(WebDriver driver) throws InterruptedException
	{                     
		administratorLnk.click();
		Thread.sleep(3000);
		
	}
	public void logout1() 
	{
		logout.click();
	}
	
	
}
