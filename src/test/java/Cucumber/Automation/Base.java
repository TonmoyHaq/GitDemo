package Cucumber.Automation;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
public static WebDriver getDriver() {
	Properties prop= new Properties();
	//prop.load(inStream);
	
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	 driver= new FirefoxDriver();
	 prop.getProperty("url");
	driver.manage().window().maximize();
	return driver;
}
}
