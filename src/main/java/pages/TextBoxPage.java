package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends Page{
	public By txtFullName = By.id("userName");
	public By txtEmail = By.id("userEmail");
	public By txtCurrentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By txtPermanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By btnSubmit = By.id("submit");
	public By lblName = By.id("name");
	

	public TextBoxPage(WebDriver dr) {
		super(dr);
	}
	
	public void inputData(String fullName, String email, String currentAddress, String permanentAddress) {
		driver.findElement(txtFullName).sendKeys(fullName);
		driver.findElement(txtEmail).sendKeys(email);
		driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
		driver.findElement(txtPermanentAddress).sendKeys(permanentAddress);
		driver.findElement(btnSubmit).click();
	}
	
	//get actual value
	public String getActualFullName() {
		String originalStr = driver.findElement(lblName).getText();//lấy text của Selenium
		//Tách 1 chuỗi thành 1 array theo dấu ":"
		String[] splittedStr = originalStr.split(":");
		String actualFullName = splittedStr[1].trim();//lấy full name nằm ở phần tử thứ 2 của mảng, sau đó cắt dấu space ở 2 đầu
		return actualFullName;
		
		
	}

}
