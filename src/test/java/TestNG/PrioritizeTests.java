package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritizeTests {
	@Test(priority=1)
	public void demo1()
	{
		Reporter.log("demo1", true);
	}
	//when priorities are given the it will give the output based on ascii values of method name number 
	
	@Test(priority=1)
	public void demo2()
	{
		Reporter.log("demo2", true);
	}
	@Test
	public void demo3()
	{
		Reporter.log("demo3", true);
	}
	@Test(priority=-1)
	public void demo4()
	{
		Reporter.log("demo4", true);
	}
	@Test(priority=-2)
	public void demo5()
	{
		Reporter.log("demo5", true);
	}
}