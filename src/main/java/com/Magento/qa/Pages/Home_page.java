package com.Magento.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.qa.Base.Magento_Base;

public class Home_page extends Magento_Base
{
	@FindBy(xpath = "//div[@id='header-nav']/nav/ol/li[1]") WebElement mobile;
	
	@FindBy(xpath = "//li[@class='level0 nav-2 last menu-active']") WebElement tv;
	
	@FindBy(xpath = "//input[@id='search']") WebElement searchBar;
	
	@FindBy(xpath = "//div[@class='account-cart-wrapper']/a") WebElement account;
	
	@FindBy(xpath = "//div[@class='header-minicart']/a") WebElement cart;
	
	
	
	
	public Home_page()
	{
		PageFactory.initElements(driver, this);
	}
	public void click_Mobile()
	{
		mobile.click();
	}
	
	public void click_tv()
	{
		tv.click();
	}
	
	public void click_SearchBar()
	{
		searchBar.click();
	}
	
	public void click_Account()
	{
		account.click();
	}
	
	public void click_Cart() 
	{
		cart.click();
	}

}
