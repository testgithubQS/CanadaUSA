package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryImages_Page extends Base_Page
{
public CategoryImages_Page(WebDriver driver) {
	super();
	
}

@FindBy(xpath="//a[@id='kidsProd']")
private WebElement KidImageLink;
@FindBy(linkText="Home")
private WebElement HomeLinkWorking;

@FindBy(xpath="//a[@id='mensProd']")
private WebElement MenImageLink;

@FindBy(xpath="//a[@id='womensProd']")
private WebElement 	WomenImageLinK;	

@FindBy(xpath="//a[@id='electronic'sProd']")
private WebElement 	ElectronicImageLink;	
		
@FindBy(xpath="//a[@id='beautyProd']")
private WebElement BeautyImageLink;

public WebElement getKidImageLink() {
	return KidImageLink;
}
public WebElement getHomeLinkWorking() {
	return HomeLinkWorking;
}
public WebElement getMenImageLink() {
	return MenImageLink;
}
public WebElement getWomenImageLinK() {
	return WomenImageLinK;
}
public WebElement getElectronicImageLink() {
	return ElectronicImageLink;
}
public WebElement getBeautyImageLink() {
	return BeautyImageLink;
}

public void ImageCategoryLink()
{
	getKidImageLink().click();
	getHomeLinkWorking().click();
	getMenImageLink().click();
	getWomenImageLinK().click();
	getElectronicImageLink().click();
	getBeautyImageLink().click();
	
}


}
