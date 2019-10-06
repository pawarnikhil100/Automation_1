package practice_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ITestList_Practice {
	@Test
	public void login()
	{
		System.out.println("I am logged in");
	}
	@Test
	public void login1()
	{
		Assert.assertTrue(true);
	}

}
