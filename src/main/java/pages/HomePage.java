package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page{
	public String lblCard= "//h5[text()='{@param}']";

	public HomePage(WebDriver dr) {
		super(dr);
	}
	
	public ElementsPage clickOnElements() {
		driver.findElement(base.getXpathByParam(lblCard, "Elements")).click();
		return new ElementsPage(driver);
	}
	
	public FormsPage clickOnForms() {
		driver.findElement(base.getXpathByParam(lblCard, "Forms")).click();
		return new FormsPage(driver);
	}
	
	


}
