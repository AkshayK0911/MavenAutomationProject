package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboAutomation 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Delhi");
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		System.out.println("Total Options are: "+list1.size());
		
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pantnagar, India"))
			{
				System.out.println("Match found....");
				i.click();
				break;
			}
			
		}
		//driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		
		System.out.println("Total Options are: "+list2.size());
		
		for(WebElement i: list2)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pune, India"))
			{
				System.out.println("Match Found...");
				i.click();
				break;
			}
		}
		
		List <WebElement> dprtrMonth=driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//p[@class='fsw__date']"));
		System.out.println("Total Dates are: "+dprtrMonth.size());
		
		for(WebElement i:dprtrMonth)
		{
			System.out.println(i.getText());
			if(i.getText().contains("25"))
			{
				i.click();
				break;
			}
		}
		driver.findElement(By.xpath("//p[text()=' Click to add a return flight for better discounts']")).click();
		
		List<WebElement> rtnMonth=driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[2]//p[@class='fsw__date']"));
		System.out.println("Total Dates are: "+rtnMonth.size());
		
		for(WebElement i:rtnMonth)
		{
			System.out.println(i.getText());
			if(i.getText().contains("16"))
			{
				i.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-dvQaRk ghZzRT'])[2]")).click();
		driver.findElement(By.linkText("Done")).click();
		
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();		
		
		
	}

}
