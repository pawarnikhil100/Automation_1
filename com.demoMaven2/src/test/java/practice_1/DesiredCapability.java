package practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path+"/Drivers/IEDriverServer.exe");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("ignoreProtectedModeSettings", true);
		WebDriver driver=new InternetExplorerDriver(dc);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

}
