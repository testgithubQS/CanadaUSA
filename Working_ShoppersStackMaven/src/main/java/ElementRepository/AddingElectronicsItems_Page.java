package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingElectronicsItems_Page {
	public AddingElectronicsItems_Page(WebDriver driver) {
		
		super();
	}
		@FindBy(xpath="//a[@id='electronics']")
		private WebElement EctronicsLink;
		

		@FindBy(xpath="//*[contains(text(),'canon camera')]")
		private WebElement AddCanonCamera;
		
		@FindBy(xpath="//button[@id='Add To Cart']")
		private WebElement AddToCartButton;
		
		@FindBy(xpath="//*[contains(text(),'USB CABLE & ACCESSORIES')]")
		private WebElement AddingUSBaccessories;
		
		@FindBy(xpath="//*[contains(test(),'oral b')]")
		private WebElement AddingOralBToCart;
		
		@FindBy(xpath="//*[contains(text(),'WATCH')]")
		private WebElement WatchLink;
		
		@FindBy(xpath="//*[contains(text(),'noise')]")
		private WebElement AddingNoiseWatchToCart;
		
		@FindBy(xpath="//*[contains(text(),'COMPUTER HARD DRIVE')]")
		private WebElement ComputerHardDriveLink;
		
		@FindBy(xpath="//*[contains(text(),'HEADPHONES')]")
		private WebElement HeadPhonesLink;
		
		@FindBy(xpath="//*[contains(text(),'LAPTOP')]")
		private WebElement LaptopLink;
		
		@FindBy(xpath="//*[contains(text(),'american tourister')]")
		private WebElement AddingLaptopbag;
		
		@FindBy(xpath="//*[contains(text(),'MOBILES;)]")
		private WebElement MobileLink;
		
		@FindBy(xpath="//*[contains(text(),'POWER BANK')]")
		private WebElement PowerBankLink;

		public WebElement getElectronicsLink() {
			return EctronicsLink;
		}

		public WebElement getAddCanonCamera() {
			return AddCanonCamera;
		}
		public WebElement getAddToCartButton() {
			return AddToCartButton;
		}
		public WebElement getAddingUSBaccessories() {
			return AddingUSBaccessories;
		}
		public WebElement getAddingOralBToCart() {
			return AddingOralBToCart;
		}

		public WebElement getWatchLink() {
			return WatchLink;}

		public WebElement getAddingNoiseWatchToCart() {
			return AddingNoiseWatchToCart;
		}

		public WebElement getComputerHardDriveLink() {
			return ComputerHardDriveLink;
		}
		public WebElement getHeadPhonesLink() {
			return HeadPhonesLink;
		}
		
		public WebElement getLaptopLink() {
			return LaptopLink;
		}
		public WebElement getAddingLaptopbag() {
			return AddingLaptopbag;
		}

		public WebElement getMobileLink() {
			return MobileLink;
		}

		public WebElement getPowerBankLink() {
			return PowerBankLink;
		}

		public void AddingElectricItems() {
			getElectronicsLink().click();
			 getAddCanonCamera().click();	
			 getAddToCartButton().click();
			 getAddingUSBaccessories().click();
			 getAddingOralBToCart().click();
			 getWatchLink().click();
			 getAddingNoiseWatchToCart();
			 getComputerHardDriveLink().click(); 
			 getHeadPhonesLink().click();
			 getLaptopLink().click();
			 getAddingLaptopbag().click();
			 getMobileLink().click();
			 getPowerBankLink().click();
		}
		
		
		
}


