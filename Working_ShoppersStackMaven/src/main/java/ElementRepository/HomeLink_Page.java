package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLink_Page extends Base_Page 
{
	public HomeLink_Page(WebDriver driver)
	{
		super();
	}

	@FindBy(xpath="//a[@id='kidsProd']")
	private WebElement KidsImgClickable;
	
	@FindBy(linkText="Home")
	private WebElement HomeLinkWorking;
	
	@FindBy(xpath="//*[contains(text(),'santoor')]")
	private WebElement ClickingSantoor;
	
	@FindBy(xpath="//button[@id='Add To Cart']")
	private WebElement AddToCart;

	public WebElement getKidsImgClickable() {
		return KidsImgClickable;
	}

	public WebElement getHomeLinkWorking() {
		return HomeLinkWorking;
	}

	public WebElement getClickingSantoor() {
		return ClickingSantoor;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public void HomeButtonClickable()
	{
		getKidsImgClickable().click();
		getHomeLinkWorking().click();
		getClickingSantoor().click();
		getAddToCart().click();
	}
	
	
	
	
}
