package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		//driver.findElement(By.id("search")).click();
		driver.findElement(By.name("search_query")).sendKeys("Cars");
		List<WebElement> list1=driver.findElements(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}

		
		
	}

}
