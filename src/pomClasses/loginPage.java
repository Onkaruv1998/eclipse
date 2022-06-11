package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	public By email=By.xpath("(//Input[@type='text'])[2]");
	
	public By password=By.xpath("//Input[@type='password']");
	
	public By loginbtn=By.xpath("(//Button[@type='submit'])[2]");
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("akshaynarhare1541@gmail.com");
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("Akshay123");
		
	}
	
	public void loginbutton()
	{
		driver.findElement(loginbtn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
