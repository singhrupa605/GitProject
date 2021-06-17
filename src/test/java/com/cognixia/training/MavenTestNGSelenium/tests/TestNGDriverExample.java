package com.cognixia.training.MavenTestNGSelenium.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDriverExample
{
	@Test (dataProvider  = "getData")
	public void myTest(String firstname, String lastname)
	{
		System.out.print(firstname + " ");
		System.out.print(lastname + "\n");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		String data[][] = new String[5][2];
		data[0][0] = "Rupa";
		data[0][1] = "Singh";
		
		data[1][0] = "Preeti";
		data[1][1] = "Sahu";
		
		data[2][0] = "Neha";
		data[2][1] = "Grewal";
		
		data[3][0] = "Bhavna";
		data[3][1] = "Dubey";
		
		data[4][0] = "Nisha";
		data[4][1] = "Yadav";
		
		return data;
		
		
	}

}
