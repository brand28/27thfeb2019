package com.actitime.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class FlipkartPage extends BasePage {

	//Declaration
	@FindBy(xpath ="//input[@class='LM6RPg']")
	private WebElement search;
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	private List<WebElement> list;
	
	
	
	
	
	
	
	
	
	
	
	//Intialization
	public FlipkartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterSearch(String input)
	{
		search.sendKeys(input);
	}
	
	public void getList()
	{
		System.out.println(list.size());
//		WebElement l = list.get(list.size()-2);
//		System.out.println(l);
		//l.click();
		//home work
		//driver.switch to home work
		
	}
	
	public void popupHandle() throws AWTException
	{
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
	}

	

}
