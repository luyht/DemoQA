package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.TestBase;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;
//inheritance - is a
public class TextBoxTest extends TestCase {
	@Test(description = "Submit successfully")
	public void submitSuccessfully() {
		String fullName = "Anh Nga";
		String email = "abc@gmail.com";
		String currentAddress = "Sài Gòn";
		String permanentAddress = "Sài Gòn";
		String elementStr ="Elements";
		
		// Click Elements link trên homepage => chuyển hướng sang Elements Page
		HomePage homePage = new HomePage(testBase.webDriver);
		//scroll to Elements
		homePage.base.scrollToElement(testBase.getXpathByParam(homePage.lblCard, elementStr));
		
		//click on Elements text, navigate to Elements page
		ElementsPage elementsPage = homePage.clickOnElements();

		// Click TextBox menu trên Elements page =>chuyển hướng sang TextBox Page
		TextBoxPage textBoxPage = elementsPage.clickOnTextBox();
		
		// Input data trên TextBox Page
		textBoxPage.inputData(fullName,email,currentAddress,permanentAddress);
		
		// Click submit => verify (checkpoint - TC pass hay fail): hiển thị text
		String actualFullName= textBoxPage.getActualFullName();
		
		assertEquals(actualFullName, fullName);

	}

	//@Test(description = "Email format is wrong (without \"@\")")
	public void validateEmail() {
		// open browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\08Training\\2025\\202503_Automation\\02Practices\\Git\\DemoQA\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open website => hiển thị homepage
		driver.get("https://demoqa.com/");

		// Click Elements link trên homepage => chuyển hướng sang Elements Page

		// Click TextBox menu trên Elements page =>chuyển hướng sang TextBox Page
	}

}
