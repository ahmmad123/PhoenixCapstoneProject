package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	public ComponentsPageObject(){
		PageFactory.initElements(driver, this);}
	@FindBy (xpath = "//a[normalize-space()='Mice and Trackballs (0)']")
	private WebElement miceAndTrackballsDropDownList;
	@FindBy (xpath = "//a[normalize-space()='Monitors (2)']")
	private WebElement monitorsDropDownList;
	@FindBy (xpath = "//a[normalize-space()='Printers (0)']")
	private WebElement printersDropDownlist;
	@FindBy (xpath = "//a[normalize-space()='Scanners (0)']")
	private WebElement scannersDropDownList;
	@FindBy (xpath = "//a[normalize-space()='Web Cameras (0)']")
	private WebElement webCamerasDropDownList;
	@FindBy (xpath = "(//a[@class='see-all'])[4]")
	private WebElement showAllComponentsDropDwonList;
	
		
	
	}


