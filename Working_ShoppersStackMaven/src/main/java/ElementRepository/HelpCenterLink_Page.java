package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterLink_Page extends Base_Page{
public HelpCenterLink_Page(WebDriver driver) {
	super();
}

@FindBy(linkText="Help Center")
private WebElement CheckHelpCenter;

@FindBy(xpath="//button[@id='simple-tab-1']")
private WebElement DeliverOrderPage;

@FindBy(xpath="//input[@id=':r2:']")
private WebElement OrderIdTextBar;

@FindBy(xpath="MuiButtonBase-root MuiButton-root "
		+ "MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s'[")
private WebElement ClickDeliverButton;

@FindBy(xpath="//button[@id='simple-tab-2']")
private WebElement ClickDebitCard;

@FindBy(xpath="//form[@class='help_cardForm__DpZ9F MuiBox-root css-0']/select/option[2]")
private WebElement SelectIDHCbank;

@FindBy(xpath="//input[@id=':r4:']")
private WebElement AddBalanceAmountTextField;

@FindBy(xpath="//button[@type='submit']")
private WebElement addBalanceSubmitButton;

@FindBy(xpath="//button[@id='simple-tab-3']")
private WebElement ClickOnCreditCard;

@FindBy(xpath="//select[@id='demo-simple-select']/option[2]")
private WebElement SelectBankDropdown;

@FindBy(xpath="//button[@class='help_btnAddAmount__7Qvx7']")
private WebElement clickAddAmount;

@FindBy(xpath="//input[@id=':r8:']")
private WebElement AddingBalanceAmountInTextField;



@FindBy(xpath="\"//button[@id='simple-tab-4']\"")
private WebElement ClickNetBanking;

//@FindBy(xpath="//select[@id='demo-simple-select']  [3]"
private WebElement  SelectBankDropDown;

@FindBy(xpath="//div[@class='payment_actionBtn__2KSX+']/button")
private WebElement ClickRegisterNetBanking_AddAmount;

@FindBy(xpath="//input[@id=':r2:']")
private WebElement NetBankingAmountTextField;

@FindBy(xpath="//button[@id='simple-tab-5']")
private WebElement ClickingAvatarImages;

@FindBy(xpath="//a[@class='MuiButtonBase-root MuiButton-rootMuiButton-outlinedMuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium  css-79xub']")
private WebElement DownloadBoyImg;



public WebElement getCheckHelpCenter() {
	return CheckHelpCenter;
}

public WebElement getDeliverOrderPage() {
	return DeliverOrderPage;
}

public WebElement getOrderIdTextBar() {
	return OrderIdTextBar;
}

public WebElement getClickDeliverButton() {
	return ClickDeliverButton;
}

public WebElement getClickDebitCard() {
	return ClickDebitCard;
}

public WebElement getSelectIDHCbank() {
	return SelectIDHCbank;
}

public WebElement getAddBalanceAmountTextField() {
	return AddBalanceAmountTextField;
}

public WebElement getAddBalanceSubmitButton() {
	return addBalanceSubmitButton;
}

public WebElement getClickOnCreditCard() {
	return ClickOnCreditCard;
}

public WebElement getSelectBankDropdown() {
	return SelectBankDropdown;
}

public WebElement getClickAddAmount() {
	return clickAddAmount;
}

public WebElement getAddingBalanceAmountInTextField() {
	return AddingBalanceAmountInTextField;
}

public WebElement getClickNetBanking() {
	return ClickNetBanking;
}

public WebElement getSelectBankDropDown() {
	return SelectBankDropDown;
}

public WebElement getClickRegisterNetBanking_AddAmount() {
	return ClickRegisterNetBanking_AddAmount;
}

public WebElement getNetBankingAmountTextField() {
	return NetBankingAmountTextField;
}

public WebElement getClickingAvatarImages() {
	return ClickingAvatarImages;
}

public WebElement getDownloadBoyImg() {
	return DownloadBoyImg;
}

public void HelpCenterIsActive(String ABC, double number)
{
	getCheckHelpCenter().click();
	getDeliverOrderPage().click();
	getOrderIdTextBar().sendKeys("ABC");
	getClickDeliverButton().click();
	getClickDebitCard().click();
	getSelectIDHCbank().click();
	getAddBalanceAmountTextField().sendKeys("number");
	getAddBalanceSubmitButton().click();
	getClickOnCreditCard().click();
	getSelectBankDropdown().click();
	getClickRegisterNetBanking_AddAmount().click();
	getNetBankingAmountTextField().sendKeys("number");
	getClickingAvatarImages().click();
	getDownloadBoyImg().click();
	
	
	
	
	
	
	
	
}
}
