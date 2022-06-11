package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClasses.baseClass1;
import pomClasses.forwordMessage;
import pomClasses.homePage;
import pomClasses.loginPage;

public class TestClass1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		driver=baseClass1.getWebDriver();

     //   System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
	//	WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://www.flipkart.com/");
		
	//	driver.manage().window().maximize();
		
	//	loginPage lp=new loginPage(driver);
	//	lp.enterEmail();
	//	lp.enterPassword();
	//	lp.loginbutton();
		
	//	Thread.sleep(6000);
	//	homePage hp=new homePage(driver);
		//hp.enterSearchBox();
		//hp.SearchButton();
	//	Thread.sleep(6000);
	//	hp.cartButton();
		
		Thread.sleep(20000);
		forwordMessage fm=new forwordMessage(driver);
		fm.searchInSearchBox(driver);
		fm.clickOnContact(driver);
		fm.clickOnDownArrow(driver);
		fm.selectOption(driver);
		fm.clickOnForwordBtn(driver);
		fm.selectPeople(driver);
		fm.sendButton(driver);
	}

}
