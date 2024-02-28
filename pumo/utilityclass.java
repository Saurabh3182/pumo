package Pumo.pumo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class utilityclass 
{
	Properties properties;
	
	String path="D:\\TEstingSetUP\\EclipseWorkPlace\\\\pumo\\Property.properties";
	
	public utilityclass()
	{
		properties= new Properties();
		try
		{
	      FileInputStream file=new FileInputStream("path");
          properties.load(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test
	public static String getdatafromPF(String Keys) throws IOException
	{                                             
		
//     FileInputStream file=new FileInputStream("C:\\Users\\91832\\eclipse-workspace\\Selenum\\src\\Propertyfile.properties");
		
	   FileInputStream file=new FileInputStream("D:\\TEstingSetUP\\EclipseWorkPlace\\pumo\\Property.properties");
		
		Properties Prop=new Properties();

		Prop.load(file);
		
		String values=Prop.getProperty(Keys);
		
		return values;
		
		
	}
	
	@Test
	public static String getdatafromExcel(int Rowindex , int Cellindex) throws EncryptedDocumentException, IOException
	{
		    FileInputStream file = new FileInputStream("D:\\saurabh.xlsx");
		    String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(Rowindex).getCell(Cellindex).getStringCellValue();
		    return value;

		
	}
	

	@Test
	public static void takeScreenShot(WebDriver driver,int Testid) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		//File destination=new File("C:\\Users\\Saurabh\\02Nov22-eclipse-workspace\\Final_script\\ScreenShots\\."+Testid+".jpg");		
		File destination=new File("D:\\TEstingSetUP\\Screenshot\\."+Testid+".jpg");
	
		
		FileHandler.copy(source, destination);
		
		
	}
	
	public static String takeSSInExtend(WebDriver driver,String Testid) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		String destination = System.getProperty("user.dir")+"\\test-output\\Screenshot\\."+ Testid +".jpg";
		
	//	File destination=new File("D:\\TEstingSetUP\\Screenshot\\."+Testid+".jpg");
	    File filedestination= new File(destination);
	    try{
	    	
	    	FileUtils.copyFile(source, filedestination);
	    }
	    catch(Exception e)
	    {
	    	e.getMessage();
	    }
		return destination;
	}
	
	public String readConf() throws IOException 
	{                                             
		
		
		String values=properties.getProperty("browser");
//		
		if(values!=null)
		return values;
		else
			throw new RuntimeException("browser not found");
		
	}
	
	
	
	
	

}
