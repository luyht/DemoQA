package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Description: This class contains all common methods related to Selenium
 * commands
 * 
 * @author Luy
 *
 */
public class TestBase {
	public WebDriver webDriver;

	public void openWeb(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			// open browser
			System.setProperty("webdriver.chrome.driver",
					"D:\\08Training\\2025\\202503_Automation\\02Practices\\Git\\DemoQA\\driver\\chromedriver.exe");
			webDriver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			
		}
		
		// open website => hiển thị homepage
		webDriver.get(url);
		webDriver.manage().window().maximize();

	}
	
	public void scrollToElement(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript(
	            "arguments[0].scrollIntoView();", webDriver.findElement(locator));
	}
	
	public By getXpathByParam(String originalXpath, String replacement) {
		String newXpath = originalXpath.replace("{@param}",replacement);
		return By.xpath(newXpath);
	}
	/**
	 * Select a visible text in dropdown box
	 * @param locator
	 * @param visibleText
	 */
	public void selectByVisibleText(By locator, String visibleText) {
		WebElement drElement = webDriver.findElement(locator);
		Select drSelect = new Select(drElement);
		drSelect.selectByVisibleText(visibleText);
	}
	
	/**
	 * Select a radio button by text
	 * @param rdXpath
	 * @param rdText
	 */
	public void clickOnRadioButton(String rdXpath, String rdText) {
		By rdButtonLocator = getXpathByParam(rdXpath, rdText);
		WebElement rdElement = webDriver.findElement(rdButtonLocator);
		scrollToElement(rdButtonLocator);
		rdElement.click();
	}
	
	public String getTextByLocator(String xpath, String fieldName) {
		By fieldLocator = getXpathByParam(xpath, fieldName);
		return webDriver.findElement(fieldLocator).getText();
	}
	
	

}
