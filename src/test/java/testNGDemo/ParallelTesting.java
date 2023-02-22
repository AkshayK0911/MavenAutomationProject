package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting 
{
  @Test
  public void chromeTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
	  
  }
  
  @Test(enabled=false)
  public void firefoxTest() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
	  
  }
  
  @Test(enabled=false)
  public void edgeTest() 
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Title is: "+driver.getTitle());
	  
	  
  }
}
