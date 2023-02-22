package dataDriverTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import generic.Utility;

public class ScreenshotDemo {
  @Test
  public void capture() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./"+"\\screenshot\\google.png");
	  FileHandler.copy(temp, dest);
	  System.out.println("ScreenShot is Captured");
	  
	  
	  driver.get("https://www.amazon.in");
	  Utility.capture(driver);
	  
	  driver.get("https://www.facebook.com");
	  Utility.capture(driver);
	  
	  
  }
}
