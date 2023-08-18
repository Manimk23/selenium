package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgGroupsEx2 {
	@BeforeMethod(alwaysRun=true)
	public void beforemethod() {
		System.out.println("exceuted before test");
	}
	@Test(groups= {"smoke"})
	public void testcase5()
	{
		System.out.println("testcase5");
	}
	@Test(groups= {"smoke", "unit"})
	public void testcase6()
	{
		System.out.println("testcase6");
	}
	@Test(groups= {"unit"})
	public void testcase7()
	{
		System.out.println("testcase7");
	}
	@Test(groups= {"unit"})
	public void testcase8()
	{
		System.out.println("testcase8");
	}
	@AfterMethod(alwaysRun=true)
	public void aftermethod()
	{
		System.out.println("executed after the test");
	}
}

