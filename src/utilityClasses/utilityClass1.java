package utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilityClass1 {

	
	public static void implicitlyWait(int time,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	public static WebElement explicitlyWait(WebDriver driver,int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver ,Duration.ofSeconds(time));
		WebElement element1=wait.until(ExpectedConditions.visibilityOf(element));
		return element1;
				
	}
	
	public static void screenshots(WebDriver driver) throws IOException
	{
		Date date=new Date();
		SimpleDateFormat f= new SimpleDateFormat("YYYY-MM-dd-hh:mm:ss");
		String currentdate=f.format(date);
		File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\SeleniumSS\\images"+".jpg"+currentdate);
		FileHandler.copy(sourse, dest);
		
	}
	
	public static void dropDown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
		System.out.println( s.getFirstSelectedOption().getText());
	}
	
	public static void scrollDown(WebDriver driver,String pixels)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(pixels);
	}
	
	public static void dragDrop(WebDriver driver,String xpath,String xpath1)
	{
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath(xpath));
		WebElement drop=driver.findElement(By.xpath(xpath1));
		act.dragAndDrop(drag, drop).perform();
	}
	
	public static void getData(WebDriver driver,String path,String sheetName,int a,int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet(sheetName).getRow(a).getCell(b).getStringCellValue();
		
	}
	public static void backSpace(int a,WebElement element)
	{
		for(int i=0;i<a;i++)
		{
			element.sendKeys(Keys.BACK_SPACE);
		}
	}


	



}
