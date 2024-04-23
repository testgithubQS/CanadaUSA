package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsAddingItems_Page {
	public KidsAddingItems_Page(WebDriver driver) {

		super();
	}

	@FindBy(id="kids")
	private WebElement KidsLink;
	@FindBy(linkText="T-SHIRTS")
	private  WebElement  BoysTshirt;
	@FindBy(xpath="//*[contains(text(),'us polo kids')]")
	private  WebElement  BoysPoloTshirt;
	@FindBy(linkText="SHIRTS")
	private  WebElement BoysShirt ;
	@FindBy(linkText="JEANS")
	private  WebElement  BoysJeans;
	@FindBy(linkText="CLOTHING SETS")
	private  WebElement  BoysClothingSets;
	@FindBy(linkText="ETHNIC WEAR")
	private  WebElement  BoysEthnicWear ;
	@FindBy(linkText="PARTY WEAR")
	private  WebElement  BoysPartyWear;
	@FindBy(xpath="//*[contains(text(),'GIRLS CLOTHING")
	private WebElement GirlsClothing;
	@FindBy(xpath="//*[contains(text(),'KURTA SETS')]")
	private WebElement GirlsKurtaSets;
	@FindBy(xpath="//*[contains(text(),'PARTY WEAR')]")
	private WebElement GirlsPartyWear;
	@FindBy(xpath="//*[contains(text(),'DUNGAREES & JUMPSUITS;)]")
	private WebElement GirlsJumpsuits;
	@FindBy(xpath="//*[contains(text(),'SKIRTS & SHORTS')]")
	private WebElement GirlsSkirt_Shorts;
	@FindBy(xpath="//*[contains(text(),'Jeans')]")
	private WebElement GirlsJeans; 
	@FindBy(xpath="//*[contains(text(),'Naughty Ninos Store ')]")
	private WebElement GirlsJeggins;
	
	
	public WebElement getKidsLink() {
		return KidsLink;
	}
	public WebElement getBoysTshirt() {
		return BoysTshirt;
	}
	public WebElement getBoysPoloTshirt() {
		return BoysPoloTshirt;
	}
	public WebElement getBoysShirt() {
		return BoysShirt;
	}
	public WebElement getBoysJeans() {
		return BoysJeans;
	}
	public WebElement getBoysClothingSets() {
		return BoysClothingSets;
	}
	public WebElement getBoysEthnicWear() {
		return BoysEthnicWear;
	}
	public WebElement getBoysPartyWear() {
		return BoysPartyWear;
	}
	public WebElement getGirlsClothing() {
		return GirlsClothing;
	}
	public WebElement getGirlsKurtaSets() {
		return GirlsKurtaSets;
	}
	public WebElement getGirlsPartyWear() {
		return GirlsPartyWear;
	}
	public WebElement getGirlsJumpsuits() {
		return GirlsJumpsuits;
	}
	public WebElement getGirlsSkirt_Shorts() {
		return GirlsSkirt_Shorts;
	}
	public WebElement getGirlsJeans() {
		return GirlsJeans;
	}
	public WebElement getGirlsJeggins() {
		return GirlsJeggins;
	}
		
	public void KidsAddingItemsToCart () {
		getKidsLink().click();
		getBoysTshirt().click();
		getBoysPoloTshirt().click();
		getBoysShirt().click();
		getBoysJeans().click();
		getBoysClothingSets().click();
		getBoysEthnicWear().click();
		 getBoysPartyWear().click();
		 getGirlsClothing().click();
		 getGirlsKurtaSets().click();
		 getGirlsPartyWear().click();
		 getGirlsJumpsuits().click();
		 getGirlsSkirt_Shorts().click();
		 getGirlsJeans().click();
		 getGirlsJeggins().click();
		 
		 
	}
	
	
	
}
