package net.ssqa.pages;

import org.openqa.selenium.By;

import net.ssqa.enums.WaitStrategy;

public class HomePage extends BasePage {
	
	private final By buttonApplyNow=By.xpath("//button[normalize-space()='Apply Now']");
	
	public NewFacilityManagerPage clickApplyNow()
	{
		click(buttonApplyNow,WaitStrategy.CLICKABLE);
		return new NewFacilityManagerPage();
	}

}
