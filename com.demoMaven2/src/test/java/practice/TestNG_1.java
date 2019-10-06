package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_1 {
	
	
	

	@Test
	@Parameters({"MyParameter"})
	public void getName(String name)
	{
		System.out.println("My Name= "+name);
	}
	
	
	
	

}
