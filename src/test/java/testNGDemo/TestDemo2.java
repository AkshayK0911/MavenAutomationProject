package testNGDemo;

import org.testng.annotations.Test;


public class TestDemo2
{
  @Test (priority=1,description="test case 1")
  public void registre()
  {
	  System.out.println("User will Register Here!");
  }
  
  @Test(priority=2,description="test case 2")
  public void login()
  {
	  System.out.println("User will Login here!");
  }
  
  @Test(priority=3,invocationCount = 3)
  public void searchProduct()
  {
	  System.out.println("User will Search a product here!");
	  
  }
  
  @Test(priority=4,enabled=false)
  public void addToCart()
  {
	  System.out.println("User will Add product to Cart here!");
	  
  }
  
  @Test(priority=5)
  public void logout()
  {
	  System.out.println("User will Logout Here!");
  }
  
  
  
  
  
  
  
  
  
}
