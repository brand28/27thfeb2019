package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority=3)
	public void testVerifyVersion()
	{
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String eVersion = ExcelData.getData(file_path, "TC03", 1, 0);
		
		LoginPage lp = new LoginPage(driver);
		
		//verify login page
		lp.verifyTheTitle(loginTitle);
		
		//verify version
		String aVersion = lp.verifyVersion();
		Reporter.log("Actual version: "+aVersion,true);
		Reporter.log("Expected version: "+eVersion,true);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aVersion, eVersion);
		sa.assertAll();
	}
}
