package Pumo.pumo;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Baseclass 
{
    public WebDriver driver=null ;
    public ExtentReports extent;
    public ExtentTest test;
    public ExtentHtmlReporter htmlReporter;

    @Parameters("browserName")
    
  /*  @BeforeSuite
    public void extend()
    {

		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtendReport/Pumo-Test1.html");

		htmlReporter.config().setDocumentTitle("Testing Pumo");
		
		htmlReporter.config().setReportName("testing-Pumo");
		htmlReporter.config().setTheme(Theme.DARK);
				
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname", "MyHost");
		extent.setSystemInfo("ProjectName", "Pumo");
		extent.setSystemInfo("Tester", "Saurabh");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
    }
*/
// 	@BeforeClass
	public void initialize(@Optional String browserName) throws InterruptedException, IOException
	{
		
		System.out.println(browserName);
				
		if(browserName.contains ("Chrome"))
		{
			
		System.setProperty("webdriver.chrome.driver",
	        "D:\\TEstingSetUP\\Chrome\\chromedriver-win64\\chromedriver.exe");
        
	    driver = new ChromeDriver();
	    
	    }
		else if (browserName.equals("edge"))
	     { 
	    	 
		     System.setProperty("webdriver.edge.driver",
		        "D:\\TEstingSetUP\\edge driver\\msedgedriver.exe");

		    driver = new EdgeDriver();

	     }
		driver.get("http://pumobeauty.com/master/home");
	    driver.manage().window().maximize();
	}


 /*   @AfterClass
    public void CloseBrowser() throws InterruptedException  
    {
		System.out.println("***********************All Tests Finish******************************************");
		
    }

    
	
	
	 @AfterSuite
	 public void endReport()
	 {
		extent.flush();
	 }
*/	 
}

