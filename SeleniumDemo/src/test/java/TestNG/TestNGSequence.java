package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSequence {
	
	

	@BeforeSuite
	public void BeforeSuite(){
		
		System.out.println("@BeforeSuite annotation will be execute First --- 1");
	}
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("@BeforeTest annotation will be execute Second --- 2");
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("@BeforeClass annotation will be execute Third --- 3");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("@BeforeMethod annotation always execute before @Test annotation Fourth --- 4");
	}
	
	@Test
	public void Test1(){
		System.out.println("@Test annotation is an your test cases will be execute always after @Before Method annotation");	
	}
	
	@Test
	public void Test2(){
		System.out.println("@Test annotation is an your test cases will be execute always after @Before Method annotation");	
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("@AfterMethod annotation always execute after @Test annotation Fourth --- 5");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("@AfterClass annotation will be execute Sixth --- 6");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("@AfterTest annotation will be execute Seventh --- 7");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("@AfterSuite annotation will be execute Eighth --- 8");
	}
	
	
}
