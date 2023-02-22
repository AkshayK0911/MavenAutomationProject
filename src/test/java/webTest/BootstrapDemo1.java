package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");

		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[@role='menu'])[1]//li//a"));
		System.out.println("Total Options are: "+list1.size());
		
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
		}
		
	}

}
