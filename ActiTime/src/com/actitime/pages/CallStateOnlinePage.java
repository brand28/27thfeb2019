package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;
import com.actitime.generic.*;

public class CallStateOnlinePage extends BasePage{

	
	
	//Declaration
	@FindBy(xpath="(//a[.='Degree Programs'])[1]")
	private WebElement degree;
	
	@FindBy(xpath="//a[contains(.,'Bachelor')]")
	private WebElement bachelor;
	
	//@FindBy(xpath="//a[contains(.,'Bachelor')]/..//a[.='Computer and Information Sciences']")
	@FindBy(xpath="//a[contains(.,'Bachelor')]/..//ul//li")
	private List<WebElement> computer;
	

	//Initialization
	public CallStateOnlinePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}	
	
	//Utilization
	Actions act=new Actions(driver);
	
	public void verifyTheTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void moveToDegree(WebElement target)
	{
		
		
		act.moveToElement(degree).perform();
		//degree.click();
	}
	
	public void moveToBachelor()
	{
		act.moveToElement(bachelor).perform();
		//bachelor.click();
	}
	
	public void moveToComputer()
	{
//		act.moveToElement(c);
//		computer.click();
		
		for(WebElement list:computer)
		{
			String text=list.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Computer and Information Sciences"))
				list.click();
		}
	
	}
	
	
	
	
	
	
	
	
	
	

}
