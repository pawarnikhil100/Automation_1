package Test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages_1.GoogleSearchPahe_1;

public class GoogleSearchTestNG extends GoogleSearchPahe_1{
	public GoogleSearchTestNG(WebDriver driver) {
		super(driver);
		
	}
	WebDriver driver= null;
	@BeforeTest
	public void setup(){
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	}
	@Test
	public void googlePageTest(){
	GoogleSearchPahe_1 obj=new GoogleSearchPahe_1(driver);
	driver.get("https://www.google.com");
	obj.enterText("School");
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
