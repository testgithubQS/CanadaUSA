package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FotterVerifyingLinks_Page {
public FotterVerifyingLinks_Page(WebDriver driver)
{
	super();
}

@FindBy(linkText="Contact Us")
private WebElement contactLink;

@FindBy(linkText="About Us")
private WebElement AboutUsLink;

@FindBy(linkText="Careers")
private WebElement CareersLink;

@FindBy(linkText="ShoppersStackShitories")
private WebElement SSstoriesLink;

@FindBy(linkText="Press")
private WebElement PressLink;

@FindBy(linkText="ShoppersStack wholesale")
private WebElement SSwholeSaleLink;

@FindBy(linkText="Corporate Information")
private WebElement CorporateInfoLink;

@FindBy(linkText="Payments")
private WebElement PaymentsLink;

@FindBy(linkText="Shipping")
private WebElement ShippingLink;

@FindBy(linkText="Cancellation & Returns")
private WebElement Cancel_ReturnsLink;

@FindBy(linkText="FAQ")
private WebElement FAQLink;

@FindBy(linkText="report Infringement")
private WebElement ReportLink;

@FindBy(linkText="Swagger Documentation")
private WebElement SwaggerDocumentLink;
@FindBy(linkText="Requirement Documentation")
private WebElement RequireDocLink;

@FindBy(linkText="Return Policy")
private WebElement ReturnPolicyLink;

@FindBy(linkText="Terms Of Use")
private WebElement TermsOfUseLink;

@FindBy(linkText="Security")
private WebElement SecurityLink;

@FindBy(linkText="Privacy")
private WebElement PrivacyLink;

@FindBy(linkText="Sitemap")
private WebElement SitemapLink;

@FindBy(linkText="EPR Compliance")
private WebElement EPRComplianceLink;

@FindBy(linkText="Facebook")
private WebElement FacebookLink;

@FindBy(linkText="Twitter")
private WebElement TwitterLink;

@FindBy(linkText="YouTube")
private WebElement YoutubeLink;

public WebElement getContactLink() {
	return contactLink;
}

public WebElement getAboutUsLink() {
	return AboutUsLink;
}

public WebElement getCareersLink() {
	return CareersLink;
}

public WebElement getSSstoriesLink() {
	return SSstoriesLink;
}

public WebElement getPressLink() {
	return PressLink;
}

public WebElement getSSwholeSaleLink() {
	return SSwholeSaleLink;
}

public WebElement getCorporateInfoLink() {
	return CorporateInfoLink;
}

public WebElement getPaymentsLink() {
	return PaymentsLink;
}

public WebElement getShippingLink() {
	return ShippingLink;
}

public WebElement getCancel_ReturnsLink() {
	return Cancel_ReturnsLink;
}

public WebElement getFAQLink() {
	return FAQLink;
}

public WebElement getReportLink() {
	return ReportLink;
}

public WebElement getSwaggerDocumentLink() {
	return SwaggerDocumentLink;
}

public WebElement getRequireDocLink() {
	return RequireDocLink;
}

public WebElement getReturnPolicyLink() {
	return ReturnPolicyLink;
}

public WebElement getTermsOfUseLink() {
	return TermsOfUseLink;
}

public WebElement getSecurityLink() {
	return SecurityLink;
}

public WebElement getPrivacyLink() {
	return PrivacyLink;
}

public WebElement getSitemapLink() {
	return SitemapLink;
}

public WebElement getEPRComplianceLink() {
	return EPRComplianceLink;
}

public WebElement getFacebookLink() {
	return FacebookLink;
}

public WebElement getTwitterLink() {
	return TwitterLink;
}

public WebElement getYoutubeLink() {
	return YoutubeLink;
}

public void VerifyfooterLinks()
{
	getContactLink().click();
	 getAboutUsLink().click();
	 getCareersLink().click();
	 getSSstoriesLink().click();
	 getPressLink().click();
	 getSSwholeSaleLink().click();
	 getCorporateInfoLink().click();
	 getPaymentsLink().click();
	 getShippingLink().click();
	 getCancel_ReturnsLink().click();
	 getFAQLink().click();
	 getReportLink().click();
	 getSwaggerDocumentLink().click();
	 getRequireDocLink().click();
	 getReturnPolicyLink().click();
	 getTermsOfUseLink().click();
	 getSecurityLink().click();
	 getPrivacyLink().click(); 
	 getSitemapLink().click();
	 getEPRComplianceLink().click();
	 getFacebookLink().click();
	 getTwitterLink().click();
	 getYoutubeLink().click();
}


}
