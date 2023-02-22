package dataDriverTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
  @Test
  public void hardAssertion() 
  {
	  String act="Selenium WebDriver is webui automation library.";
	  String exp="Selenium WebDriver is webui tool";
	  
	  //Assert.assertEquals(act, exp);//java.lang.AssertionError
	 
	  //Assert is a class that we are use for hard assertion.
	  //Assert.assertTrue(act.contains(exp));//Fail
	  
	  Assert.assertTrue(act.contains(exp));//Pass [It is expecting wrong answer]
	  System.out.println("Hard assert demo is completed!");
	  
	  
  }

  @Test
  public void softAssert()
  {
	  SoftAssert sf=new SoftAssert();
	  String act="Selenium WebDriver is webui automation library.";
	  String exp="Selenium WebDriver is webui automation library.";
	  
	  //sf.assertEquals(act, exp);//PAss
	  sf.assertTrue(act.contains(exp));//PAss
	  
	 
	  System.out.println("Soft Assert Demo Completed!");
	  sf.assertAll();
  }




}

