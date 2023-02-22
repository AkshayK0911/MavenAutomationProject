package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{
	public static void capture(WebDriver driver)
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./"+"\\screenshot\\Pic"+System.currentTimeMillis()+".png");
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static Properties propertiesFile()
	{
		Properties p1=new Properties();
		File f1=new File("./"+"\\configdata.properties");
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p1;
		  
		  
	}
	//selectBasedDropdown
	public static void selectBasedDropdown(WebElement ele, String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is Dropdown Support Multiple Selection: "+dd.isMultiple());
		
		//All Options
		
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options Are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				
				i.click();
				break;
			}
		}
	}
		
	//Javascript
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,600)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,600)");
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

}
