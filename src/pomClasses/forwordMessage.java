package pomClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClasses.utilityClass1;

public class forwordMessage extends utilityClass1 {

	WebDriver driver;
	@FindBy(xpath="(//Div[@role='textbox'])[1]")
	private WebElement searchBox;
	
	@FindBy(xpath="(//Span[text()='Shreya Kadam'])[1]")
	private WebElement contact;
	
	@FindBy(xpath="//Span[@data-testid='down-context']")
	private WebElement downArrow;
	
	@FindBy(xpath="//Li[contains(@class,'_2qR8G _1wMaz ')]")//2
	private WebElement options;
	
	@FindBy(xpath="//span[@data-testid='forward']")
	private WebElement forwordBtn;
	
	@FindBy(xpath="//div[@data-testid='cell-frame-container']")//5
	private WebElement participant;
	
	@FindBy(xpath="//span[@data-testid='send']")
	private WebElement send;
	
	
	
	public forwordMessage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		this. driver=driver;
	}
	
	
	public void searchInSearchBox(WebDriver driver)
	{
		searchBox.sendKeys("Shreya Kadam");
	}
	
	public void clickOnContact(WebDriver driver)
	{
		contact.click();
	}
	
	public void clickOnDownArrow(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(downArrow).perform();;
		explicitlyWait(driver,15,downArrow).click();;
		
	}
	
	public void selectOption(WebDriver driver)
	{
		List<WebElement>option=driver.findElements(By.xpath("//Li[contains(@class,'_2qR8G _1wMaz ')]"));
		
		option.get(2).click();
	}
	
	public void clickOnForwordBtn(WebDriver driver)
	{
		forwordBtn.click();
	}
	
	public void selectPeople(WebDriver driver)
	{
		List<WebElement>people=driver.findElements(By.xpath("//div[@data-testid='cell-frame-container']"));
		
		people.get(4).click();
	}
	
	public void sendButton(WebDriver driver) throws IOException
	{
		send.click();
		
		screenshots(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
