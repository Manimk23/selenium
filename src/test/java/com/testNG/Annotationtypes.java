package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationtypes {
	/*
	 * BS - 1
	 * BT - 1
	 * BC - 1
	 * BM - 3
	 * @Test - 3
	 * AM - 3
	 * AC - 1
	 * AT - 1
	 * AS - 1
	 * 
	 * 
	 */
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("exceute only once before the entire automation suite");

	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("exceute only once  before the entire Test (SanityTest, RegressionTest etc)");

	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("exceute only once before all the @Test annotated methods in a class)");

	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("exceute before each @Test annotated method)");

	}
	@Test
	public void Test1()
	{
		System.out.println("Test case 1");
	}
	@Test
	
	public void Test2()
	{
		System.out.println("Test case 2");
	}
	@Test
	public void Test3()
	{
		System.out.println("Test case 3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("exceute after each @Test annotated method)");

	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("exceute only once after all the @Test annotated methods in a class)");

	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("exceute only once  after the entire Test (SanityTest, RegressionTest etc)");

	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("exceute only once after the entire automation suite");

	}
	
}
