package tests;

import org.testng.annotations.BeforeMethod;

import common.TestBase;

public class TestCase{
	//aggregation - has a
	public TestBase testBase = new TestBase();
	
	@BeforeMethod
	public void setUp() {
		String browser ="chrome";
		String url="https://demoqa.com/";
		testBase.openWeb(browser, url);
	}
	
	public void tearDown() {
		
	}

}
