package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);				
	}	
	@FindBy (xpath = "//h2[normalize-space()='Software']")
	private WebElement softwaretext;
	@FindBy (xpath ="//p[normalize-space()='There are no products to list in this category.']")
	private WebElement thereAreNoProductsToListInThisCategoryText;
	@FindBy (xpath = "//a[@class ='btn btn-primary']")
	private WebElement continueButton;
	
}
	
	
	
		
	
