package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AutomationPracticeFormPage;
import pages.FormsPage;
import pages.HomePage;
import pages.ThanksForSubmitting;
import tests.entities.StudentRegistrationForm;

public class PracticeFormTest extends TestCase{

	@Test(dataProvider="RegistrationData")
	public void submitDataSuccessfully() {
		String projectFolder = System.getProperty("user.dir");
		StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm();
		studentRegistrationForm.firstName="Oanh";
		studentRegistrationForm.lastName="Nguyễn";
		studentRegistrationForm.email="oanh@gmail.com";
		studentRegistrationForm.gender="Male";
		studentRegistrationForm.mobile="0123456789";
		studentRegistrationForm.dateOfBirth="22 June 2001";
		studentRegistrationForm.subject="Maths, Chemistry, Computer Science";
		studentRegistrationForm.hobbies="Sports, Reading, Music";
		studentRegistrationForm.picture= projectFolder + "\\testcase\\testdata\\PracticeForm_TC01.jpg";
		studentRegistrationForm.currentAddress="Hà Nội";
		studentRegistrationForm.state="NCR";
		studentRegistrationForm.city="Delhi";
		

		AutomationPracticeFormPage automationPracticeFormPage= new AutomationPracticeFormPage(testBase.webDriver);
		testBase.webDriver.navigate().to("https://demoqa.com/automation-practice-form");
				
		ThanksForSubmitting thanksForSubmitting= automationPracticeFormPage.inputData(studentRegistrationForm);
		
		String expectedStudentName = studentRegistrationForm.firstName + " " + studentRegistrationForm.lastName;
		String actualStudentName = thanksForSubmitting.base.getTextByLocator(thanksForSubmitting.valueXpath, "Student Name");
		assertEquals(expectedStudentName, actualStudentName);
		//TODO
	}
	
//	@DataProvider(name="RegistrationData")
//	public String[][] readData() {
//		String[][] data=new String[1][12];
//		data[0][0] = "Oanh";
//	}
	
	
}
