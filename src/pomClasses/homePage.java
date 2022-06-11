package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage  {
	
	WebDriver driver;
	
	public By searchBox=By.xpath("//Input[@type='text']");
	
	public By searchBtn=By.xpath("//Button[@type='submit']");
	
	public By cartBtn=By.xpath("//A[@class='_3SkBxJ']");
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterSearchBox()
	{
		driver.findElement(searchBox).sendKeys("realme");
	}
	
	public void SearchButton()
	{
		driver.findElement(searchBtn).click();
	}
	
	public void cartButton()
	{
		driver.findElement(cartBtn).click();
		
		try
		{
			WebElement text =driver.findElement(By.xpath("//div[text()='Missing Cart items?']"));
			String a=text.getText();
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Products are in cart");
		}
	}
	
	
	
	
	
	
	
	

}
