package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page {
	public WebDriver driver;
	public TestBase testBase = new TestBase();

	//constructor = hàm khởi tạo
	public Page(WebDriver dr) {
		this.driver = dr;
		testBase.webDriver = dr;
	}
	
	
}
