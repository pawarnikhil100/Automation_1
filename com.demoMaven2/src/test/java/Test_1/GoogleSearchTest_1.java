package Test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages_1.GoogleSearchPahe_1;

public class GoogleSearchTest_1 {
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		GoogleSearchPahe_1 obj=new GoogleSearchPahe_1(driver);
		driver.get("https://www.google.com");
		obj.enterText("School");
		
		

	}

}
