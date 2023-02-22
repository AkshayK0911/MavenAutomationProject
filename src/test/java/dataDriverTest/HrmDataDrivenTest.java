package dataDriverTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmDataDrivenTest
{
  //@Test(dataProvider = "MyData", dataProviderClass = CustomeData.class)
  @Test(dataProvider = "filedata", dataProviderClass = CustomeData.class)
  public void LoginTest(String un, String psw) 
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	   System.out.println(driver.getCurrentUrl());
		
	   //Assertion or Validation
	   Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	   System.out.println("User has Logged In Succesfully! ");
  }
}
