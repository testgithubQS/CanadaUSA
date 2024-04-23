package testScripts;

import org.testng.annotations.Test;

import ElementRepository.FotterVerifyingLinks_Page;

public class SS_FotterTest  extends BaseTest{

	@Test
	public void fotterLinks()
	{
		FotterVerifyingLinks_Page fl=new FotterVerifyingLinks_Page(driver);
		
		fl.getContactLink().click();
		 fl.getAboutUsLink().click();
		 fl.getCareersLink().click();
		 fl.getSSstoriesLink().click();
		 fl.getPressLink().click();
		 fl.getSSwholeSaleLink().click();
		 fl.getCorporateInfoLink().click();
		 fl.getPaymentsLink().click();
		 fl.getShippingLink().click();
		 fl.getCancel_ReturnsLink().click();
		 fl.getFAQLink().click();
		 fl.getReportLink().click();
		 fl.getSwaggerDocumentLink().click();
		 fl.getRequireDocLink().click();
		 fl.getReturnPolicyLink().click();
		 fl.getTermsOfUseLink().click();
		 fl.getSecurityLink().click();
		 fl.getPrivacyLink().click(); 
		 fl.getSitemapLink().click();
		 fl.getEPRComplianceLink().click();
		 fl.getFacebookLink().click();
		 fl.getTwitterLink().click();
		 fl.getYoutubeLink().click();
	}
}
