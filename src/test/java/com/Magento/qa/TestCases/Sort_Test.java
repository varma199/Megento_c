package com.Magento.qa.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Magento.qa.Base.Magento_Base;
import com.Magento.qa.Pages.Home_page;
import com.Magento.qa.Pages.Mobile_Page;

public class Sort_Test extends Magento_Base
{
	Home_page home_p;
	Mobile_Page mobile_p;
	
	
	public Sort_Test()
	{
		super();
	}
	@BeforeTest
	public void setUp()
	{
		initialization();
		home_p = new Home_page();
		mobile_p = new Mobile_Page();
		
	}
	@Test
	public void print_sorted_names()
	{
		home_p.click_Mobile();
		mobile_p.sortBy_name();
		mobile_p.sortby_Price();
		
		
	}

}
