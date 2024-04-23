package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenLinkAddingItems_Page extends Base_Page
{
	public MenLinkAddingItems_Page(WebDriver driver)
		{super();
			}
	
	        @FindBy(xpath="//a[@id='men")
			private WebElement MenHeaderLink;
			@FindBy(xpath="*[contains(text(),'puma')][1]")
			private  WebElement	TopWear;
			@FindBy(xpath="//button[@id='Add To Cart']")
			private  WebElement AddToCart;
			@FindBy(xpath="//div[@class='featuredProducts_cardFooter__B8KN4'][1]")
			private  WebElement AddToCartKurta;
	
			@FindBy(partialLinkText="BottomWear")
			private  WebElement bottomWear;
			@FindBy(linkText="Home")
			private  WebElement	HomeLink;
			
			
			
		public WebElement getMenHeaderLink() {
			return MenHeaderLink;}

		public WebElement getTopWear() {		
			return TopWear;}

		public WebElement getAddToCart() {
			return AddToCart;
			}
		public WebElement getAddToCartKurta() {
			return AddToCartKurta;
			}
		public WebElement getBottomWear() {
				return bottomWear;}
		public WebElement getHomeLink() {
				return HomeLink;
			}

		public void AddingMenItemsToCart()
		{
			getMenHeaderLink().click();
			getTopWear().click();
			getAddToCart().click();
			getAddToCartKurta().click();
			getBottomWear().click();
			getHomeLink().click();
		}


}