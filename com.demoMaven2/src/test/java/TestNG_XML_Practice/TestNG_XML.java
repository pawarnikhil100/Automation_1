package TestNG_XML_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNG_XML {
	WebDriver driver=null;
	@BeforeTest
	public void m1()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test
	public void m2() throws Exception
	{
		//GoogleSearchPahe_1 obj=new GoogleSearchPahe_1(driver);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("School",Keys.ENTER);
		Thread.sleep(3000);
	}
	@AfterTest
	public void m3()
	{
		driver.close();
	}

}
