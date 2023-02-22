package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
  @Test
  public void tstcase1() 
  {
	  System.out.println("This is Test Case 1");
  }
  @Test
  public void tstcase2() 
  {
	  System.out.println("This is Test Case 2");
  }
  @Test
  public void tstcase3() 
  {
	  System.out.println("This is Test Case 3");
  }
  
  //Annotations (Rule)
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("Before method will execute before Every test");
  }
  
  @BeforeClass
  public void bClass()
  {
	  System.out.println("Before Class will run Before only first testcase");
  }
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("Before test will run before class");
  }
  
  @BeforeSuite
  public void bSuite()
  {
	  System.out.println("Before suite will run Before test");
  }
  
  //postconditions
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("After Method will run after every testcase");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("After class will run only after Last testcase");
  }
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("After Test will run after class");
  }
  
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("After suite will run after test");
  }
  
  
  
}
