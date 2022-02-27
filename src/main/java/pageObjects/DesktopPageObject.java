package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	private WebElement textTESTENVIRONMENT;
	@FindBy(xpath = "//a[text()='Desktops']") //.click
	private WebElement desktop;
	@FindBy (xpath = "//a[normalize-space()='Show All Desktops']")
	private WebElement ShowallDesktops;
	@FindBy(xpath = "//*[@class= 'dropdown open']")
	private WebElement Desktops;
//	@FindBy(xpath = "//a[@class='list-group-item active']")
//	private WebElement desktop;
	@FindBy(xpath = "//img[@title = 'Desktops']")
	private WebElement imageDesktops;
	@FindBy(xpath = "(//*[@type = 'button'])[7]")
	private WebElement listbutton;
	@FindBy(xpath = "(//*[@type = 'button'])[8]")
	private WebElement GridButton;
	@FindBy(xpath = "(//*[@id='compare-total'])")
	private WebElement produCompare;
	@FindBy(xpath = "(//*[@class = 'input-group-addon'])[1]")
	private WebElement sortByLable;
	@FindBy(xpath = "//select[@id= 'input-sort']")
	private WebElement inputDefault;
	@FindBy(xpath = "(//*[@class = 'input-group-addon'])[2]")
	private WebElement showLable;
	@FindBy(xpath = "//select[@id= 'input-limit']")
	private WebElement inputLimit;
	
	@FindBy (xpath = "(//*[@class = 'img-responsive'])[1]")
	private WebElement imageResponsive;
	@FindBy (xpath = "(//*[@class = 'img-responsive'])[5]")
	private WebElement imageResponsive5;
	@FindBy (xpath = "//a[normalize-space()='HTC Touch HD']")
	private WebElement htcTouchHD;
	@FindBy (xpath = "//button[@type=\"//a[normalize-space()='HTC Touch HD']\"]")
	private WebElement addToCartButton;
	@FindBy (xpath = "(//*[@class='img-responsive'])[6]")
	private WebElement iphonimageresponive;
	@FindBy (xpath = "//a[normalize-space()='iPhone']")
	private WebElement iphoneText;
	@FindBy (xpath = "(//*[@ type = 'button'])[21]")
	private WebElement AddToCartButton;
	@FindBy (xpath = "(//*[@ type = 'button'])[22]")
	private WebElement addTowishlis;
	@FindBy (xpath = "(//*[@ type = 'button'])[23]")
	private WebElement compareThisProduct;
	@FindBy (xpath = "//*[@title='iPod Classic']")
	private WebElement ipodClassic;
	@FindBy (xpath = "//a[normalize-space()='iPod Classic']")
	private WebElement ipodClassicText;	
	@FindBy (xpath = "(//*[@type ='button'])[24]")
	private WebElement buttontype24;
	@FindBy (xpath = "(//*[@type ='button'])[25]")
	private WebElement wishlistbutton;
	@FindBy (xpath = "(//*[@type ='button'])[26]")
	private WebElement compareThisProductButton;	
	@FindBy (xpath = "//img[@alt='MacBook Air']")
	private WebElement MacBookAirimage;
	@FindBy (xpath = "//a[normalize-space()='MacBook Air']")
	private WebElement MacBookAirtext;
	@FindBy (xpath = "(//*[@type = 'button'])[30]")
	private WebElement addToCartButton30;
	@FindBy (xpath = "(//*[@type = 'button'])[31]")
	private WebElement addToWishListButton;
	@FindBy (xpath = "(//*[@type = 'button'])[32]")
	private WebElement compareThisProductbutton;
	@FindBy (xpath = "(//img[@class = 'img-responsive'])[10]")
	private WebElement imageResponsive10;
	@FindBy (xpath = "//a[normalize-space()='Palm Treo Pro']")
	private WebElement imagePalmTreoPro;
	@FindBy (xpath = "(//button[@type = 'button'])[34]")
	private WebElement AddToCartbutton34;
	@FindBy (xpath = "(//button[@type = 'button'])[35]")
	private WebElement AddToWishListbutton;
	@FindBy (xpath = "//img[@title = 'Product 8']")
	private WebElement imageProduct8;
	@FindBy (xpath = "//a[text()= 'Product 8']")
	private WebElement product8Text;
	@FindBy (xpath = "(//*[@type = 'button'])[36]")
	private WebElement addToCartButton36;
	@FindBy (xpath = "(//*[@type = 'button'])[37]")
	private WebElement addToWishListButton37;
	@FindBy (xpath = "(//*[@type = 'button'])[38]")
	private WebElement compareThisProduct38;
	@FindBy (xpath = "(//img[@class = 'img-responsive'])[12]")
	private WebElement imgResponsive;
	@FindBy (xpath = "//a[normalize-space()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMaster;
	@FindBy (xpath = "(//button[@type='button'])[40]")
	private WebElement addtocartbutton;
	@FindBy (xpath = "//img[@title ='Sony VAIO']")
	private WebElement sonyVaio;
	@FindBy (xpath = "//a[normalize-space()='Sony VAIO']")
	private WebElement sonyVaiotext;
	@FindBy (xpath = "(//button[@type='button'])[42]")
	private WebElement buttonAddToCart;
	@FindBy (xpath ="(//button[@type='button'])[43]")
	private WebElement addToWishList;
	@FindBy (xpath = "(//button[@type='button'])[44]")
	private WebElement butoonCompareThisProduct;
	
	@FindBy(xpath = "//h5[text()='Information']")
	private WebElement InformationFooter;
	@FindBy(linkText = ("About Us"))
	private WebElement AboutUsFooter;
	@FindBy(linkText = ("Delivery Information"))
	private WebElement deliveryInformationFooter;
	@FindBy(linkText = ("Privacy Policy"))
	private WebElement privacyPolicyFooter;
	@FindBy(linkText = ("Terms & Conditions"))
	private WebElement termsAndConditionsFooter;
	@FindBy(xpath = "//h5[text()='Customer Service']")
	private WebElement customerServiceFooter;
	@FindBy(linkText = ("Contact Us"))
	private WebElement contactUsFooter;
	@FindBy(linkText = ("Returns"))
	private WebElement returnsFooter;
	@FindBy(linkText = ("Site Map"))
	private WebElement siteMapFooter;
	@FindBy(xpath = "//h5[text()='Extras']")
	private WebElement exrasFooter;
	@FindBy(linkText = ("Brands"))
	private WebElement brandsFooter;
	@FindBy(linkText = ("Gift Certificates"))
	private WebElement giftCertificatesFooter;
	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliateFooter;
	@FindBy(linkText = ("Specials"))
	private WebElement specialsFooter;
	@FindBy(xpath = "//h5[text()='My Account']")
	private WebElement wishListHeartCanonEOS5D;
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccountFooterClick;
	@FindBy(linkText = ("Order History"))
	private WebElement orderHistoryFooter;
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishListFooter;
	@FindBy(xpath = "//a[contains(text(),'Newsletter')]")
	private WebElement newsTellerFooter;
	@FindBy(xpath = "//p[contains(text(), 'Powered By')]")
	private WebElement poweredByFooter;
	
	@FindBy (tagName="a")
	private List<WebElement> allListOfItemsOnDesktop;
	public void textTestEnvoironment() {
		String text = textTESTENVIRONMENT.getText();
		
		System.out.println(text);
	}

	public void clickonDesktops() {
		desktop.click();
	}
	


	public void clickonShowAllDesktops() {
		ShowallDesktops.click();
		
	
	}


public void getListOfAllListOfItemsOnDesktop() throws InterruptedException {
//		List<WebElement> list = allListOfItemsOnDesktop;
//		Thread.sleep(3000);
//		for (int i = 0; i < list.size(); i++) {
//			String text = list.get(i).getText();
//			System.out.println(text);
		List<WebElement> list=allListOfItemsOnDesktop;
		System.out.println(list.size() + " size of element prsent in UI:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
//			String text = list.get(i).getText();
//			System.out.println(text);
			Assert.assertTrue(list.size()!=0);
		}
	
}
	
}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	

