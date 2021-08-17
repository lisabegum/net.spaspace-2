package net.ssqa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

import net.ssqa.enums.WaitStrategy;

public class NewFacilityManagerPage extends BasePage {
	
	private final By textFacilityName=By.id("FacilityName");
	private final By textCity=By.id("FacilityCity");
	private final By dropdownState=By.id("FacilityState");
	private final By textFirstName=By.id("FirstName");
	private final By textLastName=By.id("LastName");
	private final By textEmail=By.id("email");
	private final By textPhone=By.id("phone");
	private final By textPassword=By.id("Password");
	private final By textConfirmPassword=By.id("ConfirmPassword");
	private final By buttonContinue=By.xpath("//button[normalize-space()='Continue']");

	
	public NewFacilityManagerPage enterFacilityName(String facilityname)
	{
		sendKeys(textFacilityName, facilityname,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterCity(String city)
	{
		sendKeys(textCity, city,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage selectState(String state)
	{
		selectValue(dropdownState, state,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterFirstName(String firstname)
	{
		sendKeys(textFirstName, firstname,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterLastName(String lastname)
	{
		sendKeys(textLastName, lastname,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterEmail(String email)
	{
		sendKeys(textEmail, email,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterPhone(String phone)
	{
		sendKeys(textPhone, phone,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterPassword(String password)
	{
		sendKeys(textPassword, password,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public NewFacilityManagerPage enterConfirmPassword(String confrimpassword)
	{
		sendKeys(textConfirmPassword, confrimpassword,WaitStrategy.VISIBILITY);
		return this;
	}
	
	public FacilityInfoPage clickContinue()
	{
		click(buttonContinue,WaitStrategy.CLICKABLE);
		Uninterruptibles.sleepUninterruptibly(15, TimeUnit.SECONDS);
		return new FacilityInfoPage();
	}
}
