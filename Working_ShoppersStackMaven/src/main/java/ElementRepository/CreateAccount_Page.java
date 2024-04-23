package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateAccount_Page extends Base_Page
{
	
	public CreateAccount_Page(WebDriver driver) {
		super();
}
	
	 @FindBy(id="loginBtn")
     private  WebElement loginButton;  //Welcomepage
     
     public WebElement getLoginButton() {//welcomepage
		return loginButton;
	}
	public WebElement getEmailTextField() {//2ndpage
		return emailTextField;
	}

	public WebElement getPasswordTextField() {//2nd page
		return passwordTextField;
	}
	
	public WebElement getLog_in() {//2nd page
		return Log_in;
	}
		 
		@FindBy(id="loginBtn")
		private WebElement LoginButton;
		
	     @FindBy(id="Email")
	 	private WebElement emailTextField;
	 	
	 	@FindBy(id="Password")
	 	private WebElement passwordTextField;
	 	
	 	 @FindBy(id="Login")//2ndLogonPage
		  	WebElement Log_in;
		     
	 	
	 	public void CreateLogin(String email, String password)
		{
	 		getLoginButton().click();
	 		getEmailTextField().sendKeys("email");
	 		getPasswordTextField().sendKeys("Password");
	 		getLog_in().click();
	 		
		}
	 	

	/*public WebElement getCreateAcc_Button() {
		return CreateAcc_Button;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getGenderRadioButton() {
		return GenderRadioButton;
	}

	public WebElement getPhnNumber() {
		return PhnNumber;
	}

	public WebElement getEmailTextField1() {
		return EmailTextField;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}
*/
    
	/*@FindBy(id="Create Account")
   private  WebElement CreateAcc_Button;
     
     @FindBy(id="First Name")
     private WebElement FirstNameTextField;
     
     @FindBy(id="Last Name")
     private WebElement LastNameTextField;
     
     @FindBy(id="Female")
     private WebElement GenderRadioButton;
     
     @FindBy(name="Phone Number")
     private WebElement PhnNumber;
     
     @FindBy(id="Email Address")
     private   WebElement EmailTextField;
     
     @FindBy(id="Password")
     private WebElement EnterPassword;
     
     @FindBy(id="Confirm Password")
     private WebElement ConfirmPasswordTextField;
     
     @FindBy(id="Terms and Conditions")
     private WebElement CheckBox;
     
     @FindBy(id="btnDisabled")
     private WebElement RegisterBtn;
     
     getCreateAcc_Button().click();
	 		 getFirstNameTextField().sendKeys("firstName");
	 		getLastNameTextField().sendKeys("lastName");
	 		getGenderRadioButton().click();
	 		getPhnNumber().sendKeys("PhoneNumber");
	 		
	 		getCheckBox().click();
	 		getRegisterBtn().click();
	 		getEnterPassword().sendKeys("password");
	 		getEnterPassword().sendKeys("password");
	 		
   */  
    
 	
     
     
}
