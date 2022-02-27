package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base {
	public TabletsPageObject() {
	}{
		PageFactory.initElements(driver, this);}
		@FindBy (xpath = "//a[normalize-space()='Tablets']")
		private WebElement tabletsbutton;
		@FindBy (xpath = "//h2[normalize-space()='Tablets']")
		private WebElement tabletesTitle;
		@FindBy (xpath = "(//button[@type='button'])[7]")
		private WebElement listButton;
		@FindBy (xpath = "(//button[@type='button'])[8]")
		private WebElement gridButton;
		@FindBy (xpath = "//a[@id='compare-total']")
		private WebElement copareTotalTital;
		@FindBy (xpath = "(//label[@class='input-group-addon'])[1]")
		private WebElement sortbyInput;
		@FindBy (xpath = "//select[@id='input-sort']")
		private WebElement selectInput;
		@FindBy (xpath = "(//label[@class='input-group-addon'])[2]")
		private WebElement showInput;
		@FindBy (xpath = "(//img[@class= 'img-responsive'])[2]")
		private WebElement samsungGalaxyimg;
		@FindBy (xpath = "//a[normalize-space()='Samsung Galaxy Tab 10.1']")
		private WebElement samsungGalaxyTitle;
		@FindBy (xpath = "//p[contains(text(),'Samsung Galaxy Tab 10.1, is the world’s thinnest t')]")
		private WebElement samsungGalaxyPrice;
		@FindBy (xpath = "(//button[@type='button'])[9]")
		private WebElement addTodCartButton;
		@FindBy (xpath = "(//button[@type='button'])[10]")
		private WebElement addToWishListButton;
		@FindBy (xpath = "(//button[@type='button'])[11]")
		private WebElement compareThisProductButton;
		
		
		
		
		
		
		
	}


