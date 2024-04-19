package com.pumo.utilityclass;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener
{
	   private static ExtentReports extent = new ExtentReports();
	    private static ExtentHtmlReporter htmlReporter;
	    private static ExtentTest test;
	    
	    
	    @Override
	    public void onStart(ITestContext context) {
	   //     htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtendReport/Pumo-Test1.html");
			htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtendReport/Pumo-Test "+test+".html");

	    	htmlReporter.config().setTheme(Theme.DARK);

	        try {
	            extent.setSystemInfo("Tester", System.getProperty("Saurabh"));
	            extent.setSystemInfo("Browser", context.getCurrentXmlTest().getParameter("Chrome"));
	            extent.setSystemInfo("Machine", InetAddress.getLocalHost().getHostName());
	            extent.setSystemInfo("OS", System.getProperty("Window 10"));
	            extent.setSystemInfo("Project", "Pumobeauty"); // Change this to your project name
	        } catch (UnknownHostException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.fail("Test failed");
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.skip("Test skipped");
	    }

	    // Other override methods if needed
	

}
