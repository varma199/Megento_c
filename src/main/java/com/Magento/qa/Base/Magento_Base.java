package com.Magento.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Magento_Base 
{
	public static Properties input;
	public static WebDriver driver;
	public static Actions act;
	
	public Magento_Base()
	{

		try {
			input = new Properties();
			FileInputStream fi = new FileInputStream("E:\\My Space\\Magento\\src\\main\\java\\com\\Magento\\qa\\config\\config.properties");
			input.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void initialization()
	{
		String browser = input.getProperty("Browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\My Space\\Magento\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\My Space\\Magento\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\My Space\\Magento\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();	
		}else {
			System.out.println("Broser not matched");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(input.getProperty("URL"));
	}
	
	public static void select_Item( String did, String val)
	{
		WebElement lst = driver.findElement(By.xpath(did));
		Select st = new Select(lst);
		st.selectByValue(val);
		
	}
	
	public static void mouse_Over(WebElement tar)
	{
		act = new Actions(driver);
		act.moveToElement(tar).perform();
	}
	
	public static void mouse_click(WebElement targ)
	{
		act = new Actions(driver);
		act.moveToElement(targ).click().perform();
	}

	
	
	
	
}
