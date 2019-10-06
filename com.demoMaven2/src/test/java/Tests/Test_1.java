package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\com.demoMaven2\\Drivers\\chromedriver.exe");
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement test=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		test.sendKeys("Pune");
		test.sendKeys(Keys.RETURN);
	}

}
