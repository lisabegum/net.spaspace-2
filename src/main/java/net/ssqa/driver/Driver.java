package net.ssqa.driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import net.ssqa.constants.FrameworkConstants;
import net.ssqa.utils.PropertiesUtil;

public final class Driver {
	
	private Driver() {}
	
	public static void initDriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver()))
		{
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertiesUtil.getValue("devurl"));
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
	}
	
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
