package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingBeautyProducts_Page extends Base_Page{
public AddingBeautyProducts_Page(WebDriver driver) {
	super();
}

@FindBy(xpath="//a[@id='beautyProducts']")
private WebElement BeautyLink;

@FindBy(xpath="//*[contains(text(),'lipstick')]")
private WebElement LipstickLink;

@FindBy(linkText="LIP GLOSS")
private WebElement LipGlossLink;

@FindBy(linkText="LIP LINER")
private WebElement LipLinerLink;

@FindBy(linkText="MASCARA")
private WebElement MascaraLink;
@FindBy(xpath="//*[contains(text(),'maybelline')]")
private WebElement 	AddingMabelline;


@FindBy(linkText="EYELINER")
private WebElement EyelinerLink;

@FindBy(linkText="KAJAL")
private WebElement KajalLink;
@FindBy(xpath="//*[contains(text(),'lakmy')]")
private WebElement AddingLakmy;

@FindBy(linkText="EYESHADOW")
private WebElement EyeshadowLink;

@FindBy(linkText="FOUNDATION")
private WebElement FoundationLink;
@FindBy(xpath="//*[contains(text(),'lakme 9 to 5')]")
private WebElement AddFoundation;


@FindBy(linkText="PRIMER")
private WebElement PrimerLink;
@FindBy(xpath="//*[contains(text(),'swiss beauty')]")
private WebElement AddingPrimer;

@FindBy(linkText="CREAM")
private WebElement CreamLink;	
@FindBy(xpath="//*[contains(text(),'mamaearth')][1]")
private WebElement	AddingCream;


@FindBy(linkText="COMPACT")
private WebElement CompactLink;

		
@FindBy(xpath="NAIL POLISH")
private WebElement NailPolishLink;
@FindBy(xpath="//*[contains(text(),'lakme')]")
private WebElement AddingNailPolish;


public WebElement getBeautyLink() {
	return BeautyLink;
}
public WebElement getLipstickLink() {
	return LipstickLink;
}
public WebElement getLipGlossLink() {
	return LipGlossLink;
}
public WebElement getLipLinerLink() {
	return LipLinerLink;
}
public WebElement getMascaraLink() {
	return MascaraLink;
}
public WebElement getAddingMabelline() {
	return AddingMabelline;
}
public WebElement getEyelinerLink() {
	return EyelinerLink;
}
public WebElement getKajalLink() {
	return KajalLink;
}
public WebElement getAddingLakmy() {
	return AddingLakmy;
}
public WebElement getEyeshadowLink() {
	return EyeshadowLink;
}
public WebElement getFoundationLink() {
	return FoundationLink;
}
public WebElement getAddFoundation() {
	return AddFoundation;
}
public WebElement getPrimerLink() {
	return PrimerLink;
}
public WebElement getAddingPrimer() {
	return AddingPrimer;
}
public WebElement getCreamLink() {
	return CreamLink;
}
public WebElement getAddingCream() {
	return AddingCream;
}
public WebElement getCompactLink() {
	return CompactLink;
}
public WebElement getNailPolishLink() {
	return NailPolishLink;
}
public WebElement getAddingNailPolish() {
	return AddingNailPolish;
}

public void AddingBeautyItemsInCart()
{
	getBeautyLink().click();
	 getLipstickLink().click();
	 getLipGlossLink().click();
	 getLipLinerLink().click();
	 getMascaraLink().click();
	 getAddingMabelline().click();
	 getEyelinerLink().click();
	 getKajalLink().click();
	 getAddingLakmy().click();
	 getEyeshadowLink().click();
	 getFoundationLink().click();
	 getAddFoundation().click();
	 getPrimerLink().click();
	 getAddingPrimer().click();
	 getCreamLink() .click();
	 getAddingCream().click();
	 getCompactLink().click();
	 getNailPolishLink().click();
	 getAddingNailPolish().click();
	 
	 
	 
	 
	 
	 
}



}

