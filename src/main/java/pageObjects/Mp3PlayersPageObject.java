package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	public Mp3PlayersPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class = 'dropdown-toggle'])[6]")
	private WebElement mp3PalayersDropDownButton;
    @FindBy (xpath = "//h2[normalize-space()='MP3 Players']")
    private WebElement mp3PlayersText;
    @FindBy (xpath = "//img[@title ='MP3 Players']")
    private WebElement mp3PPlayersImage;
    @FindBy (xpath = "//p[contains(text(),'Shop Laptop feature only the best laptop deals on ')]")
    private WebElement mp3PlayersParagraph;
    @FindBy (xpath = "//h3[normalize-space()='Refine Search']")
    private WebElement mp3PlayersRefineSearchText;
    @FindBy (className= "//button[@class= 'btn btn-default']") //Click
    private WebElement mp3PlayersListButton;
    @FindBy (id = "//button[@id='grid-view']")
    private WebElement mp3PlayersGridbutton;
    @FindBy (id = "//a[@id = 'compare-total']")
    private WebElement mp3PlayersCompareTotalLink;
    @FindBy (xpath = "(//lable[@text()= 'input-group-addon']()1")
    private WebElement mp3PlayersSortByLebal;
    @FindBy (id = "//select[@id='input-sort']")
    private WebElement mp3PlayersInputSort;
    @FindBy (xpath = "(//label[@class='input-group-addon'])[2]")
    private WebElement mp3PlayersShowInput;
    @FindBy (id ="//select[@id='input-limit']")
    private WebElement mp3PlayersInputLimit;
    @FindBy (xpath = "//img[@title='iPod Classic']")
    private WebElement mp3PlayersIpodClassicImage;
    @FindBy (xpath = "//a[normalize-space()='iPod Classic']")
    private WebElement mp3PlayersIpodClassicLink;
    @FindBy (xpath = "//p[contains(text(),'More room to move.')]")
    private WebElement mp3PlayersText1;
    @FindBy (xpath = "(//span[@class='price-tax'])[1]")
    private WebElement mp3PlayersPrice;
    @FindBy (xpath = "(//button[@type='button'])[9]")
    private WebElement mp3PlayersAddCartbutton; //click
    @FindBy (xpath = "(//button[@type='button'])[10]")
    private WebElement mp3PlayersAddToWishListButton; //click
    @FindBy (xpath = "(//button[@type='button'])[11]")
    private WebElement mp3PlayersCompareThisProductButton; //click]
    @FindBy (xpath = "(//img[@class='img-responsive'])[3]")
    private WebElement ipadNanoImage;
    @FindBy (xpath = "//a[normalize-space()='iPod Nano']")
    private WebElement ipadNanoNameLink;
    @FindBy (xpath = "//p[contains(text(),'Video in your pocket.')]")
    private WebElement ipadNanoParagraph;
    @FindBy (xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[1]//p[2]")
    private WebElement ipadNanoprice;
    @FindBy (xpath = "(//button[@type='button'])[12][") //click
    private WebElement ipaNanoAddToCartButton;
    @FindBy (xpath = "(//button[@type='button'])[13]")
    private WebElement ipadNanoAddtoWishListButton;
    @FindBy (xpath = "(//button[@type='button'])[14]") // Click
    private WebElement ipadNanoCompareThisProductButton;
    @FindBy (xpath = "(//img[@class= 'img-responsive'])[4]")
    private WebElement ipadShuffleImage;
    @FindBy (xpath = "//a[normalize-space()='iPod Shuffle']")
    private WebElement ipadShuffleNameLink;
    @FindBy (xpath = "//p[contains(text(),'Born to be worn.')]")
    private WebElement ipadShuffleParagraph;
    @FindBy (xpath = "(//p[@class = 'price'])[3]")
    private WebElement ipadShufflePrice;
    @FindBy (xpath = "(//button[@type='button'])[15]") //click
    private WebElement ipadShuffleAddToCartButton;
    @FindBy (xpath = "(//button[@type='button'])[16]") // click
    private WebElement ipadShuffleAddToWishListButton;
    @FindBy (xpath = "(//button[@type='button'])[17]") //click
    private WebElement ipadShuffleCopareThisProductButton;
    @FindBy (xpath = "(//img[@class= 'img-responsive'])[5]")
    private WebElement ipadTouchImage;
    @FindBy (xpath = "//a[normalize-space()='iPod Touch']")
    private  WebElement ipadTouchNameLink;
    @FindBy (xpath = "//p[contains(text(),'Revolutionary multi-touch interface.')]")
    private WebElement ipadTouchParagraph;
    @FindBy (xpath = "(//p[@class= 'price'])[4]")
    private WebElement ipadTouchPrice;
    @FindBy (xpath = "(//button[@type='button'])[18]")
    private WebElement ipadTouchAddToCartButton;
    @FindBy (xpath = "(//button[@type='button'])[19]")
    private WebElement ipadTouchAddToWishListButton;
    @FindBy (xpath = "(//button[@type='button'])[20]")
    private WebElement ipadTouchCompareThisProductButton;
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
}     
