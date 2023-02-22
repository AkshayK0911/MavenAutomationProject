package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import generic.Utility;

public class DropdownDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//Identify Dropdown
		WebElement ele1=driver.findElement(By.name("url"));
		
		// Utility.selectBasedDropdown(ele1, "Baby");
		
		
		
		//select is class in selenium
		Select ddele=new Select(ele1);

		System.out.println("is Dropdown Supports Multiple Selection? "+ddele.isMultiple());
		
		//single selection
		ddele.selectByIndex(4);
		Thread.sleep(2000);
		
		ddele.selectByValue("search-alias=electronics");
		Thread.sleep(2000);
		
		ddele.selectByVisibleText("Gift Cards");
		
		//Print All options
		
		List<WebElement> allOptions=ddele.getOptions();
		System.out.println("Total Number of Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Software"))
			{
				System.out.println("Match Found..... Test Passed!");
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
