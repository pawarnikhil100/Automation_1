package Pages_1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPahe_1 {
	
	 WebDriver driver=null;
	 By textBoxLocator= By.xpath("//input[@class='gLFyf gsfi']");
	 By buttonLocator= By.name("btnk");
	 
	 public GoogleSearchPahe_1(WebDriver driver)
	 {
		 this.driver=driver;
		
	 }
	
	public void enterText(String text)
	{
		driver.findElement(textBoxLocator).sendKeys(text,Keys.ENTER);
	}
	/*public void clickButton()
	{
		driver.findElement(buttonLocator).click();
	}*/
	

}
