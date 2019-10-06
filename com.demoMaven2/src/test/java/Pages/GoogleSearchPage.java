package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebDriver driver=null;
	
	public static WebElement textbox_Search(WebDriver driver)
	{
		WebElement text= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		return text;
	}
	
	public static WebElement button_Search(WebDriver driver)
	{
		WebElement button= driver.findElement(By.name("btnk"));
		return button;
	}

}
