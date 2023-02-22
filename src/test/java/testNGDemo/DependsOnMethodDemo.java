package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class DependsOnMethodDemo 
{
  @Test(priority=1)
  public void registerProcess()
  {
	  System.out.println("User will Register here!");
	  //Assert.assertTrue(false); All test will fail
	  AssertJUnit.assertTrue(true);
  }
  
  @Test(priority=2,dependsOnMethods = "registerProcess")
  public void loginProcess()
  {
	  System.out.println("User will Login here!");
  }
  
  @Test(priority=3,dependsOnMethods = "loginProcess")
  public void logOutProcess()
  {
	  System.out.println("User will Logout here!");
  }
  
}
