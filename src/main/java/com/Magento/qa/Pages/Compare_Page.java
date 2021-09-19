package com.Magento.qa.Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.qa.Base.Magento_Base;

public class Compare_Page extends Magento_Base
{
	@FindBy(xpath = "//div[@class='page-title title-buttons']/h1") WebElement textData;
	
	@FindBy(xpath = "product-shop-row top first odd") WebElement cost1;
	
	@FindBy(xpath = "//tr[@class='product-shop-row top first odd']/td[2]/div[2]/p[2]/span[2]") WebElement cost2;
	
	
	
	
	public Compare_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getData()
	{
		String s =textData.getText();
		return s;
	}
	
	public void compare_price()
	{
		String a =cost1.getText();
		String b = cost2.getText();
		
	}
	
	
	
}
