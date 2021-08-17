package net.ssqa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

import net.ssqa.constants.FrameworkConstants;
import net.ssqa.enums.WaitStrategy;

public class PhotosPage extends BasePage {

	private final By buttonSelectPhoto = By.xpath("//span[normalize-space()='Select Photo']");
	private final By buttonUpload = By.xpath("//span[text()='Upload']");
	private final By buttonNext = By.xpath("//button[@class='waves-light btn-primary btn'][normalize-space()='Next']");

	public void clickNext() 
	{
		click(buttonNext, WaitStrategy.CLICKABLE);
	}

	public void clickUpload() 
	{
		click(buttonUpload, WaitStrategy.CLICKABLE);
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
	}

	public void enterPhotopath() 
	{
		click(buttonSelectPhoto, WaitStrategy.CLICKABLE);
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		try 
		{
			Robot rb = new Robot();
			StringSelection str = new StringSelection(FrameworkConstants.getImgpath());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}

}
