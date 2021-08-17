package net.ssqa.pages;

import org.openqa.selenium.By;

import net.ssqa.enums.WaitStrategy;

public class SubmitReviewPage extends BasePage {
	
	private final By buttonSubmitForReview=By.xpath("//button[text()='Submit for Review']");
	
	public void clickSubmitForReview()
	{
		click(buttonSubmitForReview, WaitStrategy.CLICKABLE);
	}

}
