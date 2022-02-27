package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base{
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy (xpath = "//h2[normalize-space()='Phones & PDAs']")
	private WebElement phonesPDAs;
	@FindBy (xpath = "//button[@id='list-view']")
	private WebElement listButton;
	@FindBy (xpath = "//button[@id='grid-view'] ")
	private WebElement gridViewbutton;
	@FindBy (xpath = "//a[@id='compare-total']")
	private WebElement caompareTotalLink;
	@FindBy (xpath = "(//img[@class = 'img-responsive'])[2]")
	private WebElement htcTouchHDimg;
	@FindBy (xpath = "//p[contains(text(),'HTC Touch - in High Definition. Watch music videos')]")
	private  WebElement htcTouchHDContainsText;
	
	
	

}
