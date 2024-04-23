package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenAddingItems_Page {
	public WomenAddingItems_Page(WebDriver driver) 
	{
		super();
	}	
	
	@FindBy(xpath="//a[@id='women']")
		private  WebElement WOMENLink;
	@FindBy(linkText="KURTAS & SUITS")
		private  WebElement SUB_KurtaSuits;
	@FindBy(linkText="ETHNIC WEAR")
		private  WebElement SUBEthnicWear;
	@FindBy(linkText="SAREES")
		private  WebElement	SUBSaree;
	@FindBy(linkText="LEHENGA CHOLIS")
		private WebElement SUBLengas;
	@FindBy(linkText="DRESSES")
		private WebElement SUBdress;
	@FindBy(linkText="TOPS")
	private WebElement SUBtops;
	
	@FindBy(xpath="//*[contains(text(),'FOREVER 21  Casual Regular Sleeves ...')]")
	private WebElement SUBtops1;
	
	@FindBy(linkText="TSHIRTS")
	private WebElement SUB_Shirts;
	
	@FindBy(linkText="JEANS")
	private WebElement SUBjeans;
	
	@FindBy(linkText="/*[contains(text(),'kotty\"")
	private WebElement subKottyJeans;
	
	@FindBy(linkText="SHIRT")
	private WebElement SUBshirt;
	
	@FindBy(linkText="SHORTS & SKIRTS")
	private WebElement SUBShorts_skirts;
	
	@FindBy(linkText="JUMPSUITS")
	private WebElement SUBjSuits;
	
	@FindBy(linkText="SWEATERS")
	private WebElement SUBsweaters;
	@FindBy(linkText="JACKETS & COATS")
	private WebElement SUBjackets_coats;
	
	
	public WebElement getWOMENLink() {
		return WOMENLink;
	}
	public WebElement getSUB_KurtaSuits() {
		return SUB_KurtaSuits;
	}
	public WebElement getSUBEthnicWear() {
		return SUBEthnicWear;
	}
	public WebElement getSUBSaree() {
		return SUBSaree;
	}
	public WebElement getSUBLengas() {
		return SUBLengas;
	}
	public WebElement getSUBdress() {
		return SUBdress;
	}
	public WebElement getSUBtops() {
		return SUBtops;
	}
	public WebElement getSUBtops1() {
		return SUBtops1;
	}
	public WebElement getSUB_Shirts() {
		return SUB_Shirts;
	}
	public WebElement getSUBjeans() {
		return SUBjeans;
	}
	public WebElement getSubKottyJeans() {
		return subKottyJeans;
	}
	public WebElement getSUBshirt() {
		return SUBshirt;
	}
	public WebElement getSUBShorts_skirts() {
		return SUBShorts_skirts;
	}
	public WebElement getSUBjSuits() {
		return SUBjSuits;
	}
		public WebElement getSUBsweaters() {
		return SUBsweaters;
	}
	public WebElement getSUBjackets_coats() {
		return SUBjackets_coats;
	}
	
	public void AddingWomenItemsToCart()
	{
		 getWOMENLink().click();
		 getSUB_KurtaSuits().click();
		 getSUBEthnicWear().click();
		 getSUBSaree().click();
		 getSUBLengas().click();
		 getSUBdress().click();
		 getSUBtops().click();
		 getSUBtops1() .click();
		 getSUB_Shirts().click();
		 getSUBjeans().click();
		 getSUBshirt().click();
		 getSUBShorts_skirts().click();
		 getSUBjSuits().click();
		 getSUBsweaters().click();
		 getSUBjackets_coats().click();
}
}