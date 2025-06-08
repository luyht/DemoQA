package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksForSubmitting extends Page{
	public String valueXpath="//td[text()='{@param}']/following-sibling::td";

	public ThanksForSubmitting(WebDriver dr) {
		super(dr);
	}
	
	

}
