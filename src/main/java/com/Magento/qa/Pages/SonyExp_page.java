package com.Magento.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.qa.Base.Magento_Base;

public class SonyExp_page extends Magento_Base
{
	@FindBy(xpath = "//span[@class='price']") WebElement sony_cost2;
	
	@FindBy(xpath = "//input[@id='qty']") WebElement quantity;
	
	@FindBy(xpath = "//button[@title='Add to Cart']") WebElement sony_cart;
	
	@FindBy(xpath = "//div[@id='messages_product_view']") WebElement error_msg;
	
	
	
	
	
	public SonyExp_page() {
		PageFactory.initElements(driver, this);
	}
	
	public String get_cost2()
	{
		String st2 = sony_cost2.getText();
		System.out.println("cost in sonyexpiria page"+st2);
		return st2;
	}
	
	public void quant()
	{
		quantity.clear();
		quantity.sendKeys("1000");
	}
	
	public void click_cart()
	{
		sony_cart.click();
	}
	public String get_error_massage()
	{
		String er = error_msg.getText();
		System.out.println("error massage   :   "+er);
		return er;
	}

}
