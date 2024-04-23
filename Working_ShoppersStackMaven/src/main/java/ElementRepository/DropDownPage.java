package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends Base_Page
{
	
	public DropDownPage(WebDriver driver) {
		super();
		}
		
	@FindBy(xpath="//select[@id='category'")
	private WebElement DropDownButton;
	
	@FindBy(xpath="//option[id='men']")
	private	WebElement MenDropdown;
	
	@FindBy(id="searchBtn")
	private WebElement SearchButton;
	
	@FindBy(xpath="//option[@id=women']")
	private WebElement womenDropdown;
	
	@FindBy(xpath="//option[@id=kids']")
	private WebElement KidsDropDown;
	
	@FindBy(xpath="//option[@id='electronics']")
	private WebElement ElectronicsDropDown;
	
	@FindBy(xpath="//option[@id=['beauty']")
	private WebElement BeautyDropDown;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement SearchTextfield;
	
	@FindBy(xpath="//*[contains(text(),'tokyo talkies')]")
	private WebElement  WomenRegularFitShirt;
	
	

	@FindBy(id="Add To Cart")
	private WebElement  AddToCartButton ;
	
	@FindBy(xpath="//*[contains(text(),'allen solly')]")
	private WebElement KidsAllensollyshirt;
	
	@FindBy(xpath="//*[contains(text(),'mi arcus')]")
	private WebElement ElephantToy;
	
	
	public WebElement getDropDownButton() {
		return DropDownButton;
	}

	public WebElement getMenDropdown() {
		return MenDropdown;}


	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getWomenDropdown() {
		return womenDropdown;
	}

	public WebElement getKidsDropDown() {
		return KidsDropDown;
	}
	public WebElement getElectronicsDropDown() {
		return ElectronicsDropDown;
	}
	public WebElement getBeautyDropDown() {
		return BeautyDropDown;
	}
	
	public WebElement getSearchTextfield() {
		return SearchTextfield;
	}
	public WebElement getWomenRegularFitShirt() {
		return WomenRegularFitShirt;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	public WebElement getKidsAllensollyshirt() {
		return KidsAllensollyshirt;
	}
	public WebElement getElephantToy() {
		return ElephantToy;
	}
	
public void performActionDropdown()
		
		{		
		 getDropDownButton().click();
		 getMenDropdown().click();
		 getSearchButton().click();
		 
		 getWomenDropdown().click();
		 getWomenRegularFitShirt().click();
		 
		  getElectronicsDropDown().click();
		 
		 getBeautyDropDown().click();
		 getSearchTextfield().sendKeys("items");
		  getAddToCartButton().click();
		  
		  getKidsDropDown().click();
		 getKidsAllensollyshirt().click();
		 
		 getElephantToy().click();
	}
}
//















