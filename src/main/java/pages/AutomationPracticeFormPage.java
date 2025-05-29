package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.entities.StudentRegistrationForm;

public class AutomationPracticeFormPage extends Page{
	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	public String rdGender = "//label[text()='{@param}']";
	//public By firstName = By.id("firstName");
	//public By firstName = By.id("firstName");

	public AutomationPracticeFormPage(WebDriver dr) {
		super(dr);
	}
	
	public void inputData(StudentRegistrationForm st) {
		driver.findElement(txtFirstName).sendKeys(st.firstName);
		driver.findElement(txtLastName).sendKeys(st.lastName);
		driver.findElement(txtEmail).sendKeys(st.email);
		driver.findElement(testBase.getXpathByParam(rdGender, st.gender)).click();
		
		

	}
	
	

}
