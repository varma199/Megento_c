package com.Magento.qa.Pages;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Magento.qa.Base.Magento_Base;

public class Mobile_Page extends Magento_Base
{
	
	@FindBy(xpath = "//div[@class='category-products']/div/div/div/select") WebElement sort;
	
	@FindBy(xpath = "//h2[@class='product-name']") List<WebElement> names;
	
	@FindBy(xpath = "//div[@class='price-box']") List<WebElement> costs;
	
	@FindBy(xpath = "//h2[@class='product-name']") List<WebElement> nameofProduct;
	
	@FindBy(xpath = "//li[@class='item last'][1]/div/div[3]/ul/li[2]") WebElement compare1;
	
	@FindBy(xpath = "//span[@id='product-price-1']") WebElement sony_cost;
	
	@FindBy(xpath = "//a[@title='Xperia']") WebElement sonyExp;
	
	public Mobile_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sortBy_name()
	{
		//select_Item(sort, Name);
		Select set = new Select(sort);
		set.selectByVisibleText("Name");
		List<WebElement> nms = names;
		System.out.println("Sorted by Name");
		for(int i =0;i<nms.size();i++)
		{
			String st =nms.get(i).getText();
			
			System.out.println(st);
		}
	}
	
	public void sortby_Price()
	{
		//select_Item("sort","Price");
		Select net2 = new Select(sort);
		net2.selectByVisibleText("Price");
		
		List<WebElement> cos = costs;
		System.out.println("Sorted by Price");
		for(int i=0; i<cos.size();i++)
		{
			String nm = nameofProduct.get(i).getText();
			String str = cos.get(i).getText();
			
			System.out.println(nm+"Cost is : "+str);
		}
	}
	
	//day2
	public String get_sony_cost()
	{
		String cos = sony_cost.getText();
		System.out.println("cost in mobile page   "+cos);
		return cos;
	
	}
	
	public void click_sony()
	{
		sonyExp.click();
	
	}
	
	public void add_to_Compare()
	{
		compare1.click();
		compare1.click();
		
	}

}
