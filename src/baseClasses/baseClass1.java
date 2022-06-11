package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass1 {

	public static WebDriver getWebDriver()
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().window().maximize();
		
		
		return driver;
	}
}
