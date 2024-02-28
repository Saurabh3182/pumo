package com.pumo.pomclass;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AllProduct extends com.pumo.utilityclass.Baseclass
{
	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/eyebrow1.jpeg'])[3]") private WebElement inshinepencil ;

	@FindBy(xpath="((//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/ins 31 807.jpg']))[4]") private WebElement inshineultra ;
	
	@FindBy(xpath="/html/body/app-root/app-home/div/div[10]/div/div[8]/img") private WebElement inshine_foundation ;

	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/41yIBpd4ZbL.jpg'])[4]") private WebElement lakyouprofession ;
	
	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/617t+U2eOkL._SX425_.jpg'])[3]") private WebElement lakyoumulti ;

	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/616RfbNOJ5L.jpg'])[4]") private WebElement delanci18 ;

	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/71wZVZoi28L._SL1000_.jpg'])[3]") private WebElement delanci25 ;

	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/91JKZ76HAOL._SL1200_.jpg'])[4]") private WebElement delansiEye ;
	
	@FindBy(xpath="(//img[@src='https://zplusglobalmarketinsights.com/auctionBanksImages/51llpX-w1FL._SX425_.jpg'])[4]") private WebElement Lipstick ;

	@FindBy(xpath="/html/body/app-root/app-home/div/div[10]/div/div[1]/img") private WebElement UrbanMac ;

	@FindBy(xpath="(//a[text()='Home'])[1]") private WebElement Homebtn ;

	@FindBy(xpath="//a[@role='button']") private WebElement drop_down ;
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[7]") private WebElement logout ;

	
	
	public AllProduct(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}     
	
	
	public void Homebtn() throws InterruptedException
	{
		Thread.sleep(6000);
		Homebtn.click();	
	}
	
	public void drop_down() throws InterruptedException
	{
		Thread.sleep(2000);
		drop_down.click();	
	}

	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(4000);		
	}

	
	
	public void Select_UrbanMac_Lipstick() throws InterruptedException
	{
		Thread.sleep(2000);
		UrbanMac.click();
		Thread.sleep(2000);


	((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);",UrbanMac);

	}
	
	
	

}
