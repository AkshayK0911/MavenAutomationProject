package testNGDemo;

import org.testng.annotations.Test;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadLessBrowserTest {
  @Test
  public void desireProperties() 
  {
	  //Browser Properties
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  System.out.println(cap.getBrowserName());
	  System.out.println(cap.getBrowserVersion());
	  System.out.println(cap.getPlatformName());

	  //To get all properties
	  Map<String,Object>map=cap.asMap();
	  System.out.println(map);
  
  
  }
  @Test
  public void headLessTest()
  {
	  ChromeOptions op=new ChromeOptions();
	  op.setHeadless(true);
	  WebDriver driver=new ChromeDriver(op);
	  System.out.println("Browser is open");
	  driver.get("https://www.google.com");
	  System.out.println("Application is open");
	  
	  driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
	  System.out.println("Search for Java is done!");
	  System.out.println(driver.getCurrentUrl());
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
