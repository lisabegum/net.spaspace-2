package net.ssqa.pages;

import org.openqa.selenium.By;

import net.ssqa.enums.WaitStrategy;

public class TherapistInfomationPage extends BasePage {
	
	private final By textParkingInfo=By.xpath("//div[text()='Parking Info:']/following::textarea[1]");
	private final By textUniformInfo=By.xpath("//div[text()='Uniform Info:']/following::textarea[1]");
	private final By textCheckinInfo=By.xpath("//div[text()='CheckIn Info:']/following::textarea[1]");
	private final By textAdditionalInfo=By.xpath("//div[text()='Additional Info:']/following::textarea[1]");
	private final By buttonNext=By.xpath("(//button[text()='Next '])[3]");
	
	public void clickNext()
	{
		click(buttonNext, WaitStrategy.CLICKABLE);
	}
	
	public void enterParkingInfo(String parkinginfo)
	{
		sendKeys(textParkingInfo, parkinginfo, WaitStrategy.NONE);
	}
	
	public void enterUniformInfo(String uniforminfo)
	{
		sendKeys(textUniformInfo, uniforminfo, WaitStrategy.NONE);
	}
	
	public void enterCheckinInfo(String checkininfo)
	{
		sendKeys(textCheckinInfo, checkininfo, WaitStrategy.NONE);
	}
	
	public void enterAdditionalInfo(String additionalinfo)
	{
		sendKeys(textAdditionalInfo, additionalinfo, WaitStrategy.NONE);
	}

}
