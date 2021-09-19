package com.Magento.qa.TestCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Magento.qa.Base.Magento_Base;
import com.Magento.qa.Pages.Compare_Page;
import com.Magento.qa.Pages.Home_page;
import com.Magento.qa.Pages.Mobile_Page;
import com.Magento.qa.Pages.SonyExp_page;

public class Mobile_Page_Test extends Magento_Base
{
	
	Home_page home_p;
	Mobile_Page mobile_p;
	Compare_Page compare_p;
	SonyExp_page sonyexp_p;
	
	
	public Mobile_Page_Test()
	{
		super();
	}
	@BeforeTest
	public void setUp()
	{
		initialization();
		
		home_p = new Home_page();
		mobile_p = new Mobile_Page();
		sonyexp_p = new SonyExp_page();
		
		
	}
	
	@Test
	public void test1()
	{
		home_p.click_Mobile();
		String cost1 = mobile_p.get_sony_cost();
		mobile_p.click_sony();
		String cosy2 = sonyexp_p.get_cost2();
		Assert.assertEquals(cost1, cosy2);
		
	}
	
	public void day3()
	{
		home_p.click_Mobile();
		mobile_p.click_sony();
		sonyexp_p.quant();
		String act =sonyexp_p.get_error_massage();
		String exp = input.getProperty("exp_error_masage");
		Assert.assertEquals(act, exp);
		
	}

}
