package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException
	{
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String eErrMessge = ExcelData.getData(file_path, "TC02", 1, 2);
		LoginPage lp = new LoginPage(driver);
		
		//verify login page
		lp.verifyTheTitle(loginTitle);
		
		int rc = ExcelData.getRowCount(file_path, "TC02");
		
		for(int i=1;i<=rc;i++)
		{
			String un = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			
			Reporter.log("UserName: "+un,true);
			Reporter.log("Password: "+pw,true);
			
			//Enter invalid username
			lp.enterUserName(un);
			
			//Enter invalid password
			lp.enterPassword(pw);
			
			//click on Login
			lp.clickOnLogin();
			
			//verify error message
			String aErrMessage = lp.verifyErrorMessage();
			
			Reporter.log("Expected Error Message: "+eErrMessge,true);
			Reporter.log("Actual Error message: "+aErrMessage,true);
			Assert.assertEquals(aErrMessage, eErrMessge);
			
			Thread.sleep(2000);
			Reporter.log("===================================================",true);
		}
	}
}
