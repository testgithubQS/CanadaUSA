package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAdminLink_Page extends Base_Page {
public CreateAdminLink_Page(WebDriver driver) {
	super();
}
@FindBy(linkText="Create Admin Account")
private WebElement CreatingAdminAcc;

@FindBy(xpath="//input[@id='First Name']")
private WebElement EnterFisrtNameTextField;

@FindBy(xpath="//input[@id='Last Name']")
private WebElement EnterLastNameTextField;

@FindBy(xpath="//input[@class='jss16']")
private WebElement GenderFemaleButton;

@FindBy(xpath="//input[@id='Phone Number']")
private WebElement PhoneNbrTextfield;

@FindBy(xpath="//input[@name='Email Address']")
private WebElement EnterEmailTextField;

@FindBy(xpath="//input[@name='Password']")
private WebElement PasswordTextField;

@FindBy(xpath="//input[@name='Confirm Password']")
private WebElement EnterConfirmPassword;

@FindBy(xpath="//select[@id='Country']")
private WebElement SelectCountry;

@FindBy(xpath="//select[@id='India']")
private WebElement SelectCountryIndia;

@FindBy(xpath="//select[@id='State']")
private WebElement SelectState;

@FindBy(xpath="//option[@id='Assam']")
private WebElement SelectAssamState;

@FindBy(xpath="//select[@id='City']")
private WebElement SelectCity;

@FindBy(xpath="//option[@id='Dhuburi']")
private WebElement SelectDhubhuri; 

@FindBy(xpath="//button[@id='Disabled Register']")
private WebElement ClickRegisterbutton;

public WebElement getCreatingAdminAcc() {
	return CreatingAdminAcc;
}

public WebElement getEnterFisrtNameTextField() {
	return EnterFisrtNameTextField;
}

public WebElement getEnterLastNameTextField() {
	return EnterLastNameTextField;
}

public WebElement getGenderFemaleButton() {
	return GenderFemaleButton;
}

public WebElement getPhoneNbrTextfield() {
	return PhoneNbrTextfield;
}

public WebElement getEnterEmailTextField() {
	return EnterEmailTextField;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}

public WebElement getEnterConfirmPassword() {
	return EnterConfirmPassword;
}

public WebElement getSelectCountry() {
	return SelectCountry;
}

public WebElement getSelectState() {
	return SelectState;
}

public WebElement getSelectCountryIndia() {
	return SelectCountryIndia;
}
public WebElement getSelectAssamState() {
	return SelectAssamState;
}

public WebElement getSelectCity() {
	return SelectCity;
}

public WebElement getSelectDhubhuri() {
	return SelectDhubhuri;
}

public WebElement getClickRegisterbutton() {
	return ClickRegisterbutton;
}

public void CreatingAdminLink(String Firstname,String Lastname, float number, String email,String Password )
{
	getCreatingAdminAcc().click(); 
	getEnterFisrtNameTextField().sendKeys("Firstname");
	getEnterLastNameTextField().sendKeys("Lastname");
	 getGenderFemaleButton().click();
	 getPhoneNbrTextfield().sendKeys("number");
	 getEnterEmailTextField().sendKeys("email");
	 getPasswordTextField().sendKeys("Password");
	 getEnterConfirmPassword().sendKeys("Password");
	 getSelectCountry().click(); 
	 getSelectCountryIndia().click();
	 getSelectState().click();
	 getSelectAssamState().click();
	 getSelectCity().click();
	 getSelectDhubhuri().click();
	 getClickRegisterbutton().click(); 
}


}
