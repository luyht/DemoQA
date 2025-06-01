package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import tests.entities.StudentRegistrationForm;

public class AutomationPracticeFormPage extends Page{
	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	public String rdGender = "//label[text()='{@param}']";
	public By txtMobile = By.id("userNumber");
	public By txtDateOfBirth = By.id("dateOfBirthInput");
	public By drYear = By.className("react-datepicker__year-select");
	public By drMonth = By.className("react-datepicker__month-select");
	public String lblDateXpath = "//*[text()='{@param}']";

	public AutomationPracticeFormPage(WebDriver dr) {
		super(dr);
	}
	
	public void inputData(StudentRegistrationForm st) {
		driver.findElement(txtFirstName).sendKeys(st.firstName);
		driver.findElement(txtLastName).sendKeys(st.lastName);
		driver.findElement(txtEmail).sendKeys(st.email);
		
		//driver.findElement(testBase.getXpathByParam(rdGender, st.gender)).click();
		base.clickOnRadioButton(rdGender,st.gender);
		
		driver.findElement(txtMobile).sendKeys(st.mobile);
		driver.findElement(txtDateOfBirth).click();
		inputDateOfBirth(st.dateOfBirth);
		

	}
	
	public void inputDateOfBirth(String dateOfBirth) {
		String[] dateOfBirths = dateOfBirth.split(" ");
		String date = dateOfBirths[0];
		String month = dateOfBirths[1];
		String year = dateOfBirths[2];
		
		base.selectByVisibleText(drYear, year);
		
		base.selectByVisibleText(drMonth, month);
		
		driver.findElement(base.getXpathByParam(lblDateXpath, date)).click();	
		
	}
	
	

}
