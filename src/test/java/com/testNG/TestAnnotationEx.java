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

public class TestAnnotationEx {

	
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
		
		/*
		 * priority
		 * enabled
		 * dependsOnMethods
		 * alwaysRun
		 * 
		 */
		
		@Test(priority=3, dependsOnMethods ="atest4")
		public void test1()
		{
			System.out.println("Test case 1");
		}
		@Test(priority=2,alwaysRun = true )
		
		public void test2()
		{
			System.out.println("Test case 2");
		}
		@Test(priority=1, enabled = false)
		public void test3()
		{
			System.out.println("Test case 3");
		}
		@Test(priority=4)
		public void atest4()
		{
			System.out.println("Test case 4");
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
