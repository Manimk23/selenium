package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgGroupsEx {
	@BeforeMethod(alwaysRun=true)
	public void beforemethod() {
		System.out.println("exceuted before test");
	}
	@Test(groups= {"sanity","smoke"})
	public void testcase1()
	{
		System.out.println("testcase1");
	}
	@Test(groups= {"smoke"})
	public void testcase2()
	{
		System.out.println("testcase2");
	}
	@Test(groups= {"sanity"})
	public void testcase3()
	{
		System.out.println("testcase3");
	}
	@Test(groups= {"sanity","smoke"})
	public void testcase4()
	{
		System.out.println("testcase4");
	}
	@AfterMethod(alwaysRun=true)
	public void aftermethod()
	{
		System.out.println("executed after the test");
	}
}
