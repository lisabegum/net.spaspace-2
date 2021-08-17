package net.ssqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import net.ssqa.driver.DriverManager;
import net.ssqa.enums.WaitStrategy;
import net.ssqa.factories.ExplicitWaitFactory;

public class BasePage {
	
	protected void click(By by, WaitStrategy waitStrategy)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
	}
	
	protected void sendKeys(By by, String value,WaitStrategy waitStrategy)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
	}
	
	protected void sendKeys(By by, Keys key,WaitStrategy waitStrategy)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(key);
	}
	
	protected void selectValue(By by, String value,WaitStrategy waitStrategy)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		new Select(element).selectByVisibleText(value);
	}
	
	protected void clickUsingJavaScript(By by)
	{
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("arguments[0].scrollIntoView()", by); 
	}
	
}
