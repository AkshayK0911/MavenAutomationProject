package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboAutomationWithGenericMethod 
{
	public static void dropdownOptionsIteration(WebDriver driver, By locator, String value)
	{
		List<WebElement> list1=driver.findElements(locator);
		System.out.println("Total Options are: "+list1.size());
		
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Delhi");
		
		By list1=By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']");
		dropdownOptionsIteration(driver,list1,"Pantnagar, India");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		
		By list2=By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']");
		dropdownOptionsIteration(driver,list2,"Pune, India");
		
		By dprtrMonth=By.xpath("(//div[@class='DayPicker-Month'])[1]//p[@class='fsw__date']");
		dropdownOptionsIteration(driver,dprtrMonth,"25");
		
		driver.findElement(By.xpath("//p[text()=' Click to add a return flight for better discounts']")).click();
		
		By rtnMonth=By.xpath("(//div[@class='DayPicker-Month'])[2]//p[@class='fsw__date']");
		dropdownOptionsIteration(driver,rtnMonth,"16");
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-dvQaRk ghZzRT'])[2]")).click();
		driver.findElement(By.linkText("Done")).click();
		
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();		
		
		
		
		
		
		
		
		
		
	}

}
