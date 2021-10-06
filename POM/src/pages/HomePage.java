package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.OR;

public class HomePage {

	@FindBy(id = OR.ebayHPSrchBoxObject)
	WebElement ebayHPSrchBoxObject;

	public void enterTextInToEbaySrchBox(String srchValue) {
		ebayHPSrchBoxObject.sendKeys(srchValue);
	}

	@FindBy(id = OR.ebayHPDropDownBoxObject)
	WebElement ebayHPDropDownBoxObject;

	public void selectItemFromEbayDropDown(String drpDownValue) {
		Select sel = new Select(ebayHPDropDownBoxObject);
		sel.selectByVisibleText(drpDownValue);
	}

	@FindBy(id = OR.ebayHPSrchBtnObject)
	WebElement ebayHPSrchBtnObject;

	public void clickOnEbaySrchBtn() {
		ebayHPSrchBtnObject.click();
	}

}
