package com.actitime.tests;

import java.time.LocalDate;
import java.util.Date;

import org.apache.poi.ss.examples.LoanCalculator;
import org.openqa.selenium.remote.LocalFileDetector;

public class demo {

	public static void main(String[] args) 
	{
		
		LocalDate date= LocalDate.now();
		LocalDate day = date.plusDays(5);
		System.out.println(day);
		

	}

}
