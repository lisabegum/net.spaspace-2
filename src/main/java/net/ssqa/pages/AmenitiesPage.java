package net.ssqa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.google.common.util.concurrent.Uninterruptibles;

import net.ssqa.enums.WaitStrategy;

public class AmenitiesPage extends BasePage {
	
	private final By checkboxDrySauna=By.xpath("//td[text()='Dry Sauna']/preceding::span[1]");
	private final By cellDrySaunaDescription=By.xpath("(//td[@aria-describedby='dx-col-13'])[1]");
	private final By textDescriptionDrySauna=By.xpath("//input[@class='dx-texteditor-input']");
	private final By checkboxIncludedDrySauna=By.xpath("//td[text()='Dry Sauna']/following::span[1]");
	private final By cellAddChargeDrySauna=By.xpath("(//td[@aria-describedby='dx-col-15'])[1]");
	private final By textAddChargeDrySauna=By.xpath("//input[@role='spinbutton']");
	private final By clickOutPage=By.xpath("//div[@class='dx-toolbar-items-container']");
	private final By clickNextButton=By.xpath("//div[@id='cdk-step-content-0-1']//div[@class='ng-star-inserted']//div//button[@class='waves-light btn-primary btn'][normalize-space()='Next']");
	
	public void clickNext()
	{
		click(clickNextButton, WaitStrategy.CLICKABLE);
	}
	
	public void clickcheckboxDrySauna()
	{
		click(checkboxDrySauna,WaitStrategy.CLICKABLE);
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
	
	public void clickDrySaunaCell()
	{
		click(cellDrySaunaDescription,WaitStrategy.CLICKABLE);
	}
	
	public void enterDrySaunaDescription(String description)
	{
		sendKeys(textDescriptionDrySauna, description,WaitStrategy.VISIBILITY);
		sendKeys(textDescriptionDrySauna, Keys.TAB,WaitStrategy.VISIBILITY);
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
	
	public void clickIncludedDrySauna()
	{
		click(checkboxIncludedDrySauna,WaitStrategy.CLICKABLE);
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
	
	public void clickCellAddChargeDrySauna()
	{
		click(cellAddChargeDrySauna,WaitStrategy.CLICKABLE);
	}
	
	public void enterAddChargesDrySauna(String charge)
	{
		sendKeys(textAddChargeDrySauna, charge,WaitStrategy.VISIBILITY);
	}
	
	public void clickPage()
	{
		click(clickOutPage, WaitStrategy.CLICKABLE);
	}
	

}
