package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditingAccountDetails_page  extends Base_Page
{
	public EditingAccountDetails_page(WebDriver driver) {
	
		super();
		
		}
	private @FindBy(xpath="MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz")
	WebElement MyProfileSetting;
	
	@FindBy(xpath="//*[contains(text(),'Edit Profile')]")
	private WebElement EditProfile;
	@FindBy(xpath="//input[@id='First Name']")
	private WebElement FirstnameTextFieldEditProfile;
	@FindBy(xpath="//input[@id='Last Name']")
	private WebElement LastnameEditProfile ;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0'][1]")
	private WebElement DOBTextField;
	@FindBy(xpath="//option[@id='Country']")
	private WebElement ChooseCountry;
	@FindBy(xpath="//option[@id='Canada']")
	private WebElement ChooseCountryOption;
	@FindBy(xpath="//select[@id='State']")
	private WebElement ChooseStateOption;	
	@FindBy(xpath="//option[@id='Badami']")
	private WebElement ChoosecityOption;	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement SubmittButton;	
	
	
	@FindBy(xpath="//div[@class='MuiGrid-root ediprofileDashNavlink css-rfnosa']")
	private WebElement MyAddress;		
	@FindBy(xpath="//input[@id='Pincode']")
	private WebElement EnterPinCodeTextfield;		
	@FindBy(xpath="//button[@id='Update Address']")
	private WebElement UpdateAddressButton;
	
	
	@FindBy(xpath="//div[@class='MuiGrid-root profileDashactive css-rfnosa']")
	private WebElement MyWallet;		
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-7u9jyn'][1]")
	private WebElement AddMoney;		
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-7u9jyn'][2]")
	private WebElement UseCoupon;		
	
	@FindBy(xpath="//input[@id='Coupon Code']")
	private WebElement UseCouponcode;
	@FindBy(xpath="//button[@name='Verify']")
	private WebElement VerifyButton;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-7u9jyn'][3]")
	private WebElement ViewTransaction;
	@FindBy(xpath="//div[@class='MuiGrid-root profileDashactive css-rfnosa']")
	private WebElement MyLikes;
	@FindBy(xpath="//select[@id='category']")
	private	WebElement MyLikesSelectCategory;
	
	
	
	public WebElement getMyProfileSetting() {
		return MyProfileSetting;
	}
	public WebElement getEditProfile() {
		return EditProfile;
	}
	public WebElement getFirstnameTextFieldEditProfile() {
		return FirstnameTextFieldEditProfile;
	}
	public WebElement getLastnameEditProfile() {
		return LastnameEditProfile;
	}
	public WebElement getDOBTextField() {
		return DOBTextField;
	}
	public WebElement getChooseCountry() {
		return ChooseCountry;
	}
	public WebElement getChooseCountryOption() {
		return ChooseCountryOption;
	}
	public WebElement getChooseStateOption() {
		return ChooseStateOption;
	}
	public WebElement getChoosecityOption() {
		return ChoosecityOption;
	}
	public WebElement getSubmittButton() {
		return SubmittButton;
	}
	public WebElement getMyAddress() {
		return MyAddress;
	}
	public WebElement getEnterPinCodeTextfield() {
		return EnterPinCodeTextfield;
	}
	public WebElement getUpdateAddressButton() {
		return UpdateAddressButton;
	}
	public WebElement getMyWallet() {
		return MyWallet;
	}
	public WebElement getAddMoney() {
		return AddMoney;
	}
	public WebElement getUseCoupon() {
		return UseCoupon;
	}
	public WebElement getUseCouponcode() {
		return UseCouponcode;
	}
	public WebElement getVerifyButton() {
		return VerifyButton;
	}
	public WebElement getViewTransaction() {
		return ViewTransaction;
	}
	public WebElement getMyLikes() {
		return MyLikes;
	}
	public WebElement getMyLikesSelectCategory() {
		return MyLikesSelectCategory;
	}

	
	public void AccountEditing(String firstName,String lastName,float DOB,String address, float pincode,String CouponCode )
	{
		getMyProfileSetting().click();
		getEditProfile().click();
		getFirstnameTextFieldEditProfile().sendKeys("firstName");;
		getLastnameEditProfile().sendKeys("lastName");
		getDOBTextField().sendKeys("DOB");
		getChooseCountry() .click();
		getChooseCountryOption().click();
		getChooseStateOption().click();
		getChoosecityOption().click();
		getSubmittButton().click();
		 getMyAddress().sendKeys("address");
		 getEnterPinCodeTextfield().sendKeys("pincode");
		 getUpdateAddressButton().click();
		 getMyWallet().click();
		 getAddMoney().click();
		 getUseCoupon().click();
		 getUseCouponcode().sendKeys("CouponCode");
		 getVerifyButton().click();
		 getViewTransaction().click();
		 getMyLikes().click();
		 getMyLikesSelectCategory().click();
	}
}
			
	