package net.ssqa.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.ssqa.constants.FrameworkConstants;
import net.ssqa.driver.DriverManager;
import net.ssqa.enums.WaitStrategy;


public class ExplicitWaitFactory {
	
	public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by)
	{
		WebElement element = null;
		if(waitStrategy==WaitStrategy.CLICKABLE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
			.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy==WaitStrategy.PRESENCE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
			.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.VISIBILITY)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
			.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.NONE)
		{
			element = DriverManager.getDriver().findElement(by);
		}
		return element;
	}

}
