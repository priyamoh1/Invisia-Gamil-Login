package com.crm.genericUtilities;

public interface IConstants 
{
	String filePath="./src/test/resources/commondata.properties";
	String excelPath="./src/test/resources/TestData.xlsx";
	String chromePath=".\\src\\main\\resources\\chromedriver.exe";
	String firefoxPath=".\\src\\main\\resources\\geckodriver.exe";
	String chromeKey="webdriver.chrome.driver";
	String DbUrl="jdbc:mysql://localhost:3306/";
	String DBUsername="root";
	String DBPassword="root";
	int implicitlyWaitDuration=10;
	int explicitWaitDuration=10;
	int scriptTimeOutDuration=10;
}
