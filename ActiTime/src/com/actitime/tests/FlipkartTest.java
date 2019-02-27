package com.actitime.tests;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.FlipkartPage;

public class FlipkartTest extends BaseTest{
	
	@Test(priority=1)
	public void testFlipkart() throws InterruptedException, AWTException
	{
		
		String input =ExcelData.getData(file_path, "TC05",0, 1);
		FlipkartPage fp=new FlipkartPage(driver);
		//WebElement close = driver.findElement(By.xpath("//button[.='X']"));
//		 close.click();
		
		
		fp.popupHandle();
		
		 Thread.sleep(2000);
		
		fp.enterSearch(input);
		fp.getList();
		
		
		
		
		
		
		
		
		
		
	}

}
