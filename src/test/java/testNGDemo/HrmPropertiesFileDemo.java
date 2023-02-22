package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Utility;

public class HrmPropertiesFileDemo 
{
  @Test
  public void loginTest() throws IOException, InterruptedException 
  {
//	  File f1=new File("./"+"\\\\configdata.properties");
//	  FileInputStream fs=new FileInputStream(f1);
//	  Properties p1=new Properties();
//	  p1.load(fs);
	  Properties p1=Utility.propertiesFile();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	  driver.findElement(By.name("username")).sendKeys(p1.getProperty("un"));
	  driver.findElement(By.name("password")).sendKeys(p1.getProperty("psw"));
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
  
  }
  
}
