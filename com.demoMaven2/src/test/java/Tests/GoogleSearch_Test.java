package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearch_Test {
	public static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com");
		GoogleSearchPage.textbox_Search(driver).sendKeys("Facebook");
		GoogleSearchPage.button_Search(driver).click();

	}

}
