package com.pumo.utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actionclass extends Baseclass
{

	public static boolean isDisplayed(WebDriver driver,WebElement ele)
	{
		boolean flag=false;
	//	flag=findElement(driver,ele);
		if(flag)
		{
			flag = ele.isDisplayed();
			if(flag)
			{
				System.out.println("The element is Displayed");
			}
			else
			{
				System.out.println("The element is not Displayed");
			}
		}
		else
		{
			System.out.println("Not Displayed");
		}
		return flag;
	}
	

	
	
	
}
