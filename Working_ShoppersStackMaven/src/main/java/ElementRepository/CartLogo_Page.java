package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartLogo_Page extends Base_Page
{
	public CartLogo_Page(WebDriver driver) 
	{
		super();
	}
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement CartLogo;
	
	@FindBy(xpath="//*[contains(text(),'Continue Shopping')]")
	private WebElement ContinueShoppingButton;
	
	@FindBy(xpath="//button[@id='buynow_fl']")
	private WebElement BuyNowButton;
	
	@FindBy(xpath="//*[contains(text(),'Add New Address')]")
	private WebElement AddNewAddressButton;
	
	@FindBy(xpath="//input[@id='Home']")
	private WebElement RadioButtonHome;
	
	@FindBy(xpath="//input[@id='Name']")
	private WebElement  NameTextfield;
	
	@FindBy(xpath="//input[@id='House/Office Info'")
	private WebElement  HouseInfo;
	
	@FindBy(xpath="//input[@id='Street Info']")
	private WebElement  StreetInfo;
	
	@FindBy(id="Landmark")
	private WebElement Landmarknfo;
	
	@FindBy(xpath="//select[@id='Country")
	private WebElement CountryDropdown ;
	
	@FindBy(xpath="option[@id='USA")
	private WebElement Choosecountry;
	
	@FindBy(xpath="//option[@id='Alaska")
	private WebElement ChooseState;
	
	@FindBy(xpath="//option[@id='Badger")
	private WebElement chooseCity;
	
	@FindBy(id="Pincode")
	private WebElement PinCodeTextField;
	
	@FindBy(xpath="//input[@id='Phone Number")
	private WebElement PhoneNumberTexfield;
	
	@FindBy(xpath="//button[@id='btnDisabled'")
	private WebElement RegisterButton;

	
	public WebElement getCartLogo() {
		return CartLogo;
	}

	public WebElement getContinueShoppingButton() {
		return ContinueShoppingButton;
	}
	public WebElement getBuyNowButton() {
		return BuyNowButton;
	}
	public WebElement getAddNewAddressButton() {
		return AddNewAddressButton;
	}

	public WebElement getRadioButtonHome() {
		return RadioButtonHome;
	}

	public WebElement getNameTextfield() {
		return NameTextfield;
	}
  public WebElement getHouseInfo() {
		return HouseInfo;
	}

	public WebElement getStreetInfo() {
		return StreetInfo;
	}

	public WebElement getLandmarknfo() {
		return Landmarknfo;
	}
   public WebElement getCountryDropdown() {
		return CountryDropdown;
	}
    public WebElement getChoosecountry() {
		return Choosecountry;
	}
	public WebElement getChooseState() {
		return ChooseState;
	}
	public WebElement getChooseCity() {
		return chooseCity;
	}

	public WebElement getPinCodeTextField() {
		return PinCodeTextField;
	}

	public WebElement getPhoneNumberTexfield() {
		return PhoneNumberTexfield;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public void AddingDetailsToCart(String name,String address,String Street,String landmark,String addPin,double PhnNumber )
			{
	getCartLogo().click();
	getContinueShoppingButton().click();
	getBuyNowButton().click();
	getAddNewAddressButton().click();
	 getRadioButtonHome().click();
	 getNameTextfield().sendKeys("name");
	 getHouseInfo().sendKeys("address");
	 getStreetInfo().sendKeys("Street");
	 getLandmarknfo().sendKeys("landmark");
	 getCountryDropdown().click();
	 getChoosecountry().click();
	 getChooseState().click();
	 getChooseCity().click();
	 getPinCodeTextField().sendKeys("addPin");
	 getPhoneNumberTexfield().sendKeys("PhnNumber");
	 getRegisterButton().click();
	 
	 
}
}