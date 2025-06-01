package tests;

import org.testng.annotations.Test;

import pages.AutomationPracticeFormPage;
import pages.FormsPage;
import pages.HomePage;
import tests.entities.StudentRegistrationForm;

public class PracticeFormTest extends TestCase{

	@Test
	public void submitDataSuccessfully() {
		StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm();
		studentRegistrationForm.firstName="Oanh";
		studentRegistrationForm.lastName="Nguyễn";
		studentRegistrationForm.email="oanh@gmail.com";
		studentRegistrationForm.gender="Male";
		studentRegistrationForm.mobile="0123456789";
		studentRegistrationForm.dateOfBirth="22 June 2001";
		
		
//		HomePage homePage = new HomePage(testBase.webDriver);
//		testBase.scrollToElement(testBase.getXpathByParam(homePage.lblCard, "Forms"));
//		FormsPage formsPage = homePage.clickOnForms();
		//formsPage.clickOnPracticeForm();
		AutomationPracticeFormPage automationPracticeFormPage= new AutomationPracticeFormPage(testBase.webDriver);
		testBase.webDriver.navigate().to("https://demoqa.com/automation-practice-form");
				
		automationPracticeFormPage.inputData(studentRegistrationForm);
		
	}
}
