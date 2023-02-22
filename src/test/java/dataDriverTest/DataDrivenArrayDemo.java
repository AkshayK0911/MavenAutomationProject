package dataDriverTest;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenArrayDemo 
{	//TestData
//	@DataProvider(name="MyData")
//	  public Object[][] testData()
//	  {
//		Object[][] arr= {{"Admin","admin123"},{"Ankita","test123"},{"Akshay","test123"}};
//	  return arr;
//		
//	  }
	
  @Test(dataProvider="MyData", dataProviderClass=CustomeData.class)
  public void loginTest(String un, String psw) 
  {
	  
	  System.out.println("Username is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
