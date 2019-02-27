package com.actitime.tests;
import org.testng.annotations.Test;

import com.actitime.generic.*;
import com.actitime.pages.CallStateOnlinePage;

public class CallStateOnlineTest extends BaseTest{
	
	@Test(priority=1)
	public void testDegree() throws InterruptedException
	{
		CallStateOnlinePage cs= new CallStateOnlinePage(driver);
		
		String t = ExcelData.getData(file_path, "TC04", 1, 0);
		System.out.println(driver.getTitle());
		
		//verify the title
		cs.verifyTheTitle(t);
		
		//Move to Degree Programs
		cs.moveToDegree(null);
		Thread.sleep(2000);

		//move to bachelor
		cs.moveToBachelor();	
		Thread.sleep(2000);
		
		//move to computer
		cs.moveToComputer();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
