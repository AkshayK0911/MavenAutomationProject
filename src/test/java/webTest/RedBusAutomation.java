package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAutomation {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in");
		// "From" dropdown
		driver.findElement(By.id("src")).sendKeys("Pune");

		List<WebElement> fromlist=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//li"));
		System.out.println("Total Options are: "+fromlist.size());
		
		for(WebElement i:fromlist)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Kharadi, Pune"))
			{
				i.click();
				break;
			}
		}
		
		// "To" dropdown
		driver.findElement(By.id("dest")).sendKeys("Delhi",Keys.ENTER);
		
		//Calendar
		
		driver.findElement(By.id("onward_cal")).click();
		
		//Expectations
		String date="6";
		String month="Apr";
		String year="2023";	
		
		//Month selection
		String text=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(text);//Jan 2023
		
		String arr[]=text.split(" ");
		for(String i:arr)
		{
			System.out.println(i);
		}
//		String mon=text.split(" ")[0];
//		String yer=text.split(" ")[1];
		
//		System.out.println(mon);
//		System.out.println(yer);

		
	
	
	}

}
