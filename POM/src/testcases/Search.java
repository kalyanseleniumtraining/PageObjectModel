package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.BaseClass;

public class Search {

	@Parameters({ "srchBoxValue", "drpDownValue", "execute" })
	@Test
	public void searchEbay(String srchBoxValue, String drpDownValue, String execute) throws Exception {

		if (execute.equals("YES")) {

			BaseClass bc = new BaseClass();

			String browserName = BaseClass.getProp("browser");

			WebDriver driver = bc.openBrowser(browserName);

			driver.get(BaseClass.getProp("url"));

			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			hp.enterTextInToEbaySrchBox(srchBoxValue);
			hp.selectItemFromEbayDropDown(drpDownValue);
			hp.clickOnEbaySrchBtn();
		}

	}
}
