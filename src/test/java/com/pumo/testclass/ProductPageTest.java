package com.pumo.testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pumo.pomclass.AllProduct;
import com.pumo.pomclass.IndexPage;
import com.pumo.pomclass.LoginPage;
import com.pumo.pomclass.ProductPage;
import com.pumo.utilityclass.Baseclass;
import com.pumo.utilityclass.utilityclass;

public class ProductPageTest extends Baseclass
{
	IndexPage In ;
    int Testid; 
	LoginPage LP;
	AllProduct Ap;
	ProductPage PP;
	
	@BeforeClass
	public void open() throws InterruptedException
	{
		
		//initialize(null);
		In = new IndexPage(driver);
		//LP = new LoginPage(driver);
		Ap = new AllProduct(driver);
		PP=new ProductPage(driver);
	}
	
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
      In.Close_PopUp();
      
   /*   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
   
      Ap.Select_UrbanMac_Lipstick();;
   	Thread.sleep(4000);
   	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
      PP.SelectGram("5");

//  	((JavascriptExecutor)driver).executeScript("argument[0].click;",Ap.Select_UrbanMac_Lipstick());
//
*/

 
	}
	

	@Test
	public void Verify_Product_Instock() throws InterruptedException
	{
		    String Actual =PP.verifyproductInStock();
	        System.out.println(Actual);
			String Expected= "In Stock";
	        System.out.println(Expected);
			Assert.assertEquals(Actual, Expected);
			Reporter.log("Product Instock",true);

	}	
	
	
	@AfterMethod
	public void logout(ITestResult Result) throws IOException, InterruptedException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			utilityclass.takeScreenShot(driver, Testid);
			
		}
		
		Thread.sleep(5000);
		Ap.Homebtn();
        Ap.drop_down();
        Ap.logout();
		
	}
	
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException  
	{
	
		Thread.sleep(4000);
		driver.close();
		
	}
	
	
	
	
}
