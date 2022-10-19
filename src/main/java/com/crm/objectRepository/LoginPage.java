package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaretion
	@FindBy(xpath = "//input[@type=\"email\"]")
	//@FindBys({@FindBy(xpath = "//input[@type='text']"),@FindBy(name = "user_name")})
	private WebElement usernametxtEdt;
	
	@FindAll({@FindBy(xpath = "//input[@type='password']"),@FindBy(name = "user_n")})
	//@FindBys({@FindBy(xpath = "//input[@type='text']"),@FindBy(name = "user_name")})
	private WebElement passwordtxtEdt;

	

	@FindBy(xpath = "//span[.='Next']")
	private WebElement next;
	
	@FindBy(xpath = "//button[.=\"Forgot email?\"]")
	private WebElement forgotemail;
	
	@FindBy(xpath = "//span[.=\"Forgot password?\"]")
	private WebElement forgotpassword;
	
	@FindBy(xpath = "//span[.=\"Create account\"]")
	private WebElement createnewaccount;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private WebElement passcheckbox;
	
	@FindBy(xpath = "//a[.=\"Learn more\"]")
	private WebElement learnmore;
	
	
	public WebElement getLearnmore() {
		return learnmore;
	}


	public void setLearnmore(WebElement learnmore) {
		this.learnmore = learnmore;
	}


	public WebElement getPasscheckbox() {
		return passcheckbox;
	}


	public void setPasscheckbox(WebElement passcheckbox) {
		this.passcheckbox = passcheckbox;
	}


	public WebElement getCreatenewaccount() {
		return createnewaccount;
	}


	public void setCreatenewaccount(WebElement createnewaccount) {
		this.createnewaccount = createnewaccount;
	}


	public WebElement getForgotpassword() {
		return forgotpassword;
	}


	public void setForgotpassword(WebElement forgotpassword) {
		this.forgotpassword = forgotpassword;
	}


	public WebElement getForgotemail() {
		return forgotemail;
	}


	public void setForgotemail(WebElement forgotemail) {
		this.forgotemail = forgotemail;
	}


	@FindBy(id = "submitButton")
	private WebElement submitBtn;

	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getUsernametxtEdt()
	{
		return usernametxtEdt;
	}

	public WebElement getPasswordtxtEdt() {
		return passwordtxtEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * click on submit button
	 * @throws InterruptedException 
	 */

	public void loginToAppli(String username,String password) throws InterruptedException
	{
		usernametxtEdt.sendKeys(username);
		next.click();
		Thread.sleep(10000);
		passwordtxtEdt.sendKeys(password);
		next.click();
		
		
	}


	public WebElement getNext() {
		return next;
	}


	public void setUsernametxtEdt(WebElement usernametxtEdt) {
		this.usernametxtEdt = usernametxtEdt;
	}


	public void setPasswordtxtEdt(WebElement passwordtxtEdt) {
		this.passwordtxtEdt = passwordtxtEdt;
	}


	public void setNext(WebElement next) {
		this.next = next;
	}


	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}
}
