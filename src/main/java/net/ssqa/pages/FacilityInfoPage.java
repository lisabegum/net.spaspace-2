package net.ssqa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

import net.ssqa.enums.WaitStrategy;

public class FacilityInfoPage extends BasePage {
	
	private final By textURL=By.id("mat-input-1");
	private final By textPhone=By.id("mat-input-2");
	private final By textAddress1=By.id("mat-input-3");
	private final By textAddress2=By.id("mat-input-4");
	private final By dropdownTimeZone=By.xpath("//span[contains(@class,'mat-select-placeholder')]");
	private final By textZipCode=By.id("mat-input-6");
	private final By buttonNext=By.xpath("(//button[contains(text(),'Next')])[1]");
	private final By optionEasternTime=By.xpath("//span[text()=' Eastern Time (New York) ']");
	private final By textShortDescription=By.id("mat-input-7");
	private final By textDescribeFacility=By.id("mat-input-8");
	
	public FacilityInfoPage enterShortDescription(String shortdescription)
	{
		sendKeys(textShortDescription, shortdescription,WaitStrategy.PRESENCE);
		return this;
	}
	
	public FacilityInfoPage enterDescribeFacility(String describefacility)
	{
		sendKeys(textDescribeFacility, describefacility,WaitStrategy.PRESENCE);
		return this;
	}
	
	public FacilityInfoPage enterURL(String url)
	{
		sendKeys(textURL, url,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public FacilityInfoPage enterPhoneNumber(String phonenumber)
	{
		sendKeys(textPhone, phonenumber,WaitStrategy.PRESENCE);
		return this;
	}
	
	public FacilityInfoPage enterAddress1(String address1)
	{
		sendKeys(textAddress1, address1,WaitStrategy.PRESENCE);
		return this;
	}
	
	public FacilityInfoPage enterAddress2(String address2)
	{
		sendKeys(textAddress2, address2,WaitStrategy.PRESENCE);
		return this;
	}
	
	public FacilityInfoPage clickTimeZone()
	{
		click(dropdownTimeZone,WaitStrategy.CLICKABLE);
		return this;
	}
	
	public FacilityInfoPage clickOptionEasternTime()
	{
		click(optionEasternTime,WaitStrategy.CLICKABLE);
		return this;
	}
	
	public FacilityInfoPage enterZipCode(String zipcode)
	{
		sendKeys(textZipCode, zipcode,WaitStrategy.PRESENCE);
		return this;
	}
	
	public AmenitiesPage clickNext()
	{
		click(buttonNext,WaitStrategy.CLICKABLE);
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		return new AmenitiesPage();
	}
	

}
