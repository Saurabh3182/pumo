package com.pumo.pomclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends com.pumo.utilityclass.Baseclass
{
	
	@FindBy(xpath=("/html/body/app-root/app-product/div[1]/div/div[2]/h4")) private WebElement InStock ;

	@FindBy(xpath=("//select[@class='form-select form-select-sm']")) private WebElement Gram ;

	@FindBy(xpath=("/html/body/app-root/app-product/div[1]/div/div[2]/h1")) private WebElement ProductName ;
	
	@FindBy(xpath=("/html/body/app-root/app-product/div[1]/div/div[3]/div/div/select/option[2]")) private WebElement gr_no ;
	
	@FindBy(xpath="//button[@class='cart ng-star-inserted']") private WebElement AddCart ;

	@FindBy(xpath="(//a[@class='nav-link'])[1]") private WebElement GotoCart ;
	


	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyproductname()
	{
		String Pname=ProductName.getText();
		return Pname;
	}
	
	public String verifyproductInStock()
	{
		String Stock=InStock.getText();
		return Stock;
	}
	
	public void SelectGram(String gr) throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) Gram));
		
		Select sel = new Select(Gram);
		sel.selectByVisibleText(gr);
		Thread.sleep(4000);
			
	}
	
	public boolean selectedWeight() throws InterruptedException
	{
		boolean result=gr_no.isSelected();
		return result;
	}
	
	public boolean Clickon_AddTo_CartBtn() throws InterruptedException
	{
		AddCart.click();
		Thread.sleep(4000);
		
		boolean result = AddCart.isDisplayed();
		if(result)
		{
			System.out.println("The Search_btn is Present/Displayed");
		}
		else
		{
			System.out.println("The element is not Present/Displayed");
		}
		return result;
		
		
	}
	
	public void Clickon_GoTo_CartBtn() throws InterruptedException
	{
		
		GotoCart.click();
		Thread.sleep(4000);
	}
	
	
	
	
	
}
