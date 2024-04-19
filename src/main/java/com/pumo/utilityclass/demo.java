package com.pumo.utilityclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo 
{
	
   static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
	}
        
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\TEstingSetUP\\Chrome\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kesseboehmer.in");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		WebElement FREEswing = driver.findElement(By.xpath("/html/body/app-root/app-product/div[2]/div/div[1]/img"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",FREEswing);
		FREEswing.click();		
		
		Thread.sleep(3000);
		
		WebElement FullFront = driver.findElement(By.xpath("/html/body/app-root/app-product/div[2]/div[3]/div[1]/img"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",FullFront);
	
		FullFront.click();		
		
		WebElement ChooseMaterial1=driver.findElement(By.xpath("/html/body/app-root/app-product/div[3]/div[1]/div/select"));
		
		Select sel = new Select(ChooseMaterial1);
		sel.selectByVisibleText("MDF/HDF");
		
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
		
	     Thread.sleep(9000);
		
		
		int integer=520;
		String intString=Integer.toString(integer);		
		
		if(isInteger(intString))
		{
			WebElement Height=driver.findElement(By.xpath("//input[@formcontrolname='frontPanelHeight']"));
			Thread.sleep(2000);
			
			Height.sendKeys(intString);
            Height.sendKeys(Keys.ENTER);
		}else
		{
			System.out.println("invalid integer");
		}
	
		int Width=400;
		String intString1=Integer.toString(Width);		
		

		if(isInteger(intString1))
		{
			WebElement Width1=driver.findElement(By.xpath("//input[@formcontrolname='frontPanelWidth']"));
			Thread.sleep(2000);
			
			Width1.sendKeys(intString1);
			Width1.sendKeys(Keys.ENTER);
		}else
		{
			System.out.println("invalid integer");
		}
		

		int thik=21;
		String intString2=Integer.toString(thik);		
		

		if(isInteger(intString2))
		{
			WebElement thickness=driver.findElement(By.xpath("//input[@formcontrolname='frontPanelThickness']"));
			Thread.sleep(2000);
			
			thickness.sendKeys(intString2);
			thickness.sendKeys(Keys.ENTER);
		}else
		{
			System.out.println("invalid integer");
		}
	   
		WebElement Submit = driver.findElement(By.xpath("/html/body/app-root/app-product/div[3]/div[2]/div[1]/form/div[2]/button[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Submit);
		Submit.click();	
	
	
	}

}
