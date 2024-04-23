package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
	public void name(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	
		  @FindBy(id="loginBtn")
		  	private WebElement loginButton;
		  
		  @FindBy(id="Email")
			private WebElement emailTextField;
			
		 @FindBy(id="Password")
			private WebElement passwordTextField;
			
		@FindBy(id="Login")
			private WebElement Log_in;
		
		@FindBy(xpath="//a[@id='cart']")
		WebElement CartLogo;
		
		@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")
		 private WebElement AccountSetting;
		
		@FindBy(xpath="//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'][6]")
		private WebElement Logout;
		
		@FindBy(linkText="Home")
		private WebElement HomeLinkWorking;

		
		@FindBy(xpath="//button[@id='Add To Cart']")
		private WebElement AddToCartButton;
		
		
      	public WebElement getLoginButton() {
			return loginButton;
		}
		public WebElement getEmailTextField() {
			return emailTextField;
		}
		public WebElement getPasswordTextField() {
			return passwordTextField;
		}
		public WebElement getLog_in() {
			return Log_in;
		}
		public WebElement getAccountSetting() {
			return AccountSetting;
		}
		public WebElement getLogout() {
			return Logout;
		}
		public WebElement getHomeLinkWorking() {
			return HomeLinkWorking;
		}
		
		public WebElement getCartLogo() {
			return CartLogo;
		}
		public WebElement getAddToCartButton() {
			return AddToCartButton;
		}
		
		public void PerformLogin(String email,String password) {
			getLoginButton().click();
			getEmailTextField().sendKeys("email");
			getPasswordTextField().sendKeys("password");
			getLog_in().click();
			getLogout().click();
			getCartLogo().click();
			getHomeLinkWorking().click();
			getAddToCartButton().click();
		}

}
