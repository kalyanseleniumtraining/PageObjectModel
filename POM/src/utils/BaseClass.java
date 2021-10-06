package utils;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public WebDriver openBrowser(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		return driver;

	}
	
	
	
	
	public static String getProp(String key) throws Exception
	{
		FileReader fr=new FileReader("config.properties");
		Properties p=new Properties();
		p.load(fr);
		
		String browserName=p.getProperty(key);
		return browserName;
	}

}
