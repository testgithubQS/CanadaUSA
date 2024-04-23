package testScripts;

import org.testng.annotations.Test;

import ElementRepository.AccessIcon_Page;
import ElementRepository.AddingBeautyProducts_Page;
import ElementRepository.AddingElectronicsItems_Page;
import ElementRepository.AdvertiseLink_Page;
import ElementRepository.ArrowIcon_Page;
import ElementRepository.AutoSlideImages_Page;
import ElementRepository.CartLogo_Page;
import ElementRepository.CategoryImages_Page;
import ElementRepository.CreateAccount_Page;
import ElementRepository.CreateAdminLink_Page;
import ElementRepository.DropDownPage;
import ElementRepository.EditingAccountDetails_page;
import ElementRepository.FotterVerifyingLinks_Page;
import ElementRepository.HelpCenterLink_Page;
import ElementRepository.HomeLink_Page;
import ElementRepository.KidsAddingItems_Page;
import ElementRepository.MenLinkAddingItems_Page;
import ElementRepository.VoucherLink_Page;
import ElementRepository.WomenAddingItems_Page;
import Generic_Library.JavaScriptUtility;

public class ExecutableFileForPomPages extends BaseTest{

	@Test(priority=1)
	
	public void demo() throws InterruptedException
	{
		CreateAccount_Page CrtPg=new CreateAccount_Page(driver);
		CrtPg.getLoginButton().click();
		CrtPg.getEmailTextField().sendKeys("chitralatar@gmail.com");
		CrtPg.getPasswordTextField().sendKeys("Chitraravi10*");
		CrtPg.getLog_in().click();
		CrtPg.getLogout().click();
		
	}
	@Test(priority=2)

			public void Drop()throws InterruptedException
	{
				
		       DropDownPage DD=new DropDownPage(driver);
		       DD.getDropDownButton().click();
		       DD.getMenDropdown().click();
		       DD.getSearchButton().click();
		       
		       DD.getWomenDropdown().click();
		       DD.getSearchButton().click();
		       
		       DD.getKidsDropDown().click();
		       DD.getSearchButton().click();
		       DD.getKidsAllensollyshirt().click();
		       DD.getElephantToy().click();
			
				DD.getElectronicsDropDown().click();
				DD.getSearchButton().click();
				
				DD.getBeautyDropDown().click();
				DD.getSearchButton().click();
			
				DD.getSearchTextfield().sendKeys("Women");
				DD.getSearchButton().click();
				DD.getWomenRegularFitShirt().click();
			
			}
	
	@Test(priority=3)
	public void Cart()throws InterruptedException
	{
		CartLogo_Page  cp= new CartLogo_Page(driver);
		
		cp.getCartLogo().click();
		cp.getContinueShoppingButton().click();
		cp.getBuyNowButton().click();
		cp.getAddNewAddressButton().click();
		cp.getRadioButtonHome().click();
		cp.getNameTextfield().sendKeys("Spider");
		cp.getHouseInfo().sendKeys("Bengaluru");
		cp.getStreetInfo().sendKeys("123AD");
		cp.getLandmarknfo().sendKeys("Gudi");
		cp.getChoosecountry().click();
		cp.getChooseState().click();
		cp.getChooseCity().click();
		cp.getPinCodeTextField().sendKeys("12345");
		cp.getPhoneNumberTexfield().sendKeys("1234567899");
		//Utility_Methods.takeScreenshot(driver);
	}
	
	@Test(priority=4)
	public void Edit()throws InterruptedException
	{
		EditingAccountDetails_page  ea =new EditingAccountDetails_page(driver);
		ea.getMyProfileSetting().click();
		ea.getEditProfile().click();
		ea.getFirstnameTextFieldEditProfile().sendKeys("firstName");;
		ea.getLastnameEditProfile().sendKeys("lastName");
		ea.getDOBTextField().sendKeys("DOB");
		ea.getChooseCountry() .click();
		ea.getChooseCountryOption().click();
		ea.getChooseStateOption().click();
		ea.getChoosecityOption().click();
		ea.getSubmittButton().click();
		ea.getMyAddress().sendKeys("address");
		ea.getEnterPinCodeTextfield().sendKeys("889958");
		 ea.getUpdateAddressButton().click();
		 ea.getMyWallet().click();
		 ea.getAddMoney().click();
		 ea.getUseCoupon().click();
		 ea.getUseCouponcode().sendKeys("ABC");
		 ea.getVerifyButton().click();
		 ea.getViewTransaction().click();
		 ea.getMyLikes().click();
		 ea.getMyLikesSelectCategory().click();

		
	}
	
	@Test (priority=5)
	public void Men_link()throws InterruptedException
	{
		MenLinkAddingItems_Page mn=new MenLinkAddingItems_Page(driver);
		
		mn.getMenHeaderLink().click();
		mn.getTopWear().click();
		mn.getAddToCart().click();
		mn.getAddToCartKurta().click();
		mn.getBottomWear().click();
		mn.getHomeLink().click();
	}
	
	@Test(priority=6)
	public void womenLink()throws InterruptedException
	{
		 WomenAddingItems_Page wl=new  WomenAddingItems_Page(driver);
		 
		 wl.getWOMENLink().click();
		 wl.getSUB_KurtaSuits().click();
		 wl.getSUBEthnicWear().click();
		 wl.getSUBSaree().click();
		 wl.getSUBLengas().click();
		 wl. getSUBdress().click();
		 wl.getSUBtops().click();
		 wl.getSUBtops1() .click();
		 wl.getSUB_Shirts().click();
		 wl.getSUBjeans().click();
		 wl.getSUBshirt().click();
		 wl.getSUBShorts_skirts().click();
		 wl.getSUBjSuits().click();
		 wl.getSUBsweaters().click();
		 wl. getSUBjackets_coats().click();
	}
	
	@Test(priority=7)
	public void KidsLink() throws InterruptedException
	{
		
		KidsAddingItems_Page kl = new KidsAddingItems_Page(driver);
		
		kl.getKidsLink().click();
		kl.getBoysTshirt().click();
		kl.getBoysPoloTshirt().click();
		kl.getBoysShirt().click();
		kl.getBoysJeans().click();
		kl.getBoysClothingSets().click();
		kl.getBoysEthnicWear().click();
		kl.getBoysPartyWear().click();
		kl.getGirlsClothing().click();
		kl.getGirlsKurtaSets().click();
		kl.getGirlsPartyWear().click();
		kl.getGirlsJumpsuits().click();
		kl.getGirlsSkirt_Shorts().click();
		kl.getGirlsJeans().click();
		kl.getGirlsJeggins().click();
	}
	

	@Test(priority=8)
	public void ElectronicLink()throws InterruptedException
	{
		AddingElectronicsItems_Page el = new AddingElectronicsItems_Page(driver);
		el.getElectronicsLink().click();
		el.getAddCanonCamera().click();	
		 el.getAddToCartButton().click();
		 el.getAddingUSBaccessories().click();
		 el.getAddingOralBToCart().click();
		 el.getWatchLink().click();
		 el.getAddingNoiseWatchToCart();
		 el.getComputerHardDriveLink().click(); 
		 el.getHeadPhonesLink().click();
		 el.getLaptopLink().click();
		 el.getAddingLaptopbag().click();
		 el.getMobileLink().click();
		 el.getPowerBankLink().click();
	}
	
	@Test(priority=9)
	public void BeautyLink() throws InterruptedException
	{
		AddingBeautyProducts_Page bl=new AddingBeautyProducts_Page(driver);
		
		bl.getBeautyLink().click();
		bl.getLipstickLink().click();
		 bl.getLipGlossLink().click();
		 bl.getLipLinerLink().click();
		 bl.getMascaraLink().click();
		 bl.getAddingMabelline().click();
		 bl.getEyelinerLink().click();
		 bl.getKajalLink().click();
		 bl.getAddingLakmy().click();
		 bl.getEyeshadowLink().click();
		 bl.getFoundationLink().click();
		 bl.getAddFoundation().click();
		 bl.getPrimerLink().click();
		 bl.getAddingPrimer().click();
		 bl.getCreamLink() .click();
		 bl.getAddingCream().click();
		 bl.getCompactLink().click();
		 bl.getNailPolishLink().click();
		 bl.getAddingNailPolish().click();
	}
	
	
	@Test(priority=10)
	public void Home() throws InterruptedException
	{
		
		HomeLink_Page hl=new HomeLink_Page (driver);
		
		hl.getKidsImgClickable().click();
		hl.getHomeLinkWorking().click();
		hl.getClickingSantoor().click();
		hl.getAddToCart().click();
		
		
	}
	
	@Test(priority=11)

	public void SlideImg() throws InterruptedException{
		
		AutoSlideImages_Page sl= new AutoSlideImages_Page(driver);
		
		sl.getAdidasClickable().click();
		

	}
	
	@Test(priority=12)
	public void  Icon ()throws InterruptedException
	{
		AccessIcon_Page ac = new AccessIcon_Page(driver);
		
		ac.getChatIconWorking().click();
		ac.getClickingDeliveryOption().click();
		ac.getEnterValuesInChatBox().sendKeys("Hello");
		ac.getClickindOnSmallArrowButton().click();
		
	}
	
	
	@Test(priority=13)
	public void CategoryImg()throws InterruptedException
	{
		
		 CategoryImages_Page ci=new  CategoryImages_Page(driver);
		 
		 	ci.getKidImageLink().click();
			ci.getHomeLinkWorking().click();
			ci.getMenImageLink().click();
			ci.getWomenImageLinK().click();
			ci.getElectronicImageLink().click();
			ci.getBeautyImageLink().click();
	}
	
	@Test(priority=14)
	public void Arrows() throws InterruptedException
	{
		ArrowIcon_Page ai= new ArrowIcon_Page (driver);
		ai.getCheckingArrowWorks().click();
		
	}
	
	@Test(priority=15)
	public void fotterLinks()throws InterruptedException
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
	
	@Test(priority=16)

	 public void  adminacc()throws InterruptedException
	 {
		CreateAdminLink_Page adml=new CreateAdminLink_Page(driver);
		
		adml.getCreatingAdminAcc().click(); 
		adml.getEnterFisrtNameTextField().sendKeys("Firstname");
		adml.getEnterLastNameTextField().sendKeys("Lastname");
		adml.getGenderFemaleButton().click();
		adml.getPhoneNbrTextfield().sendKeys("2323659852");
		adml.getEnterEmailTextField().sendKeys("Engineer@yahoo.com");
		adml.getPasswordTextField().sendKeys("Password12!");
		adml.getEnterConfirmPassword().sendKeys("Password12!");
		adml.getSelectCountry().click(); 
		adml.getSelectCountryIndia().click();
		adml.getSelectState().click();
		adml. getSelectAssamState().click();
		adml.getSelectCity().click();
		adml.getSelectDhubhuri().click();
		adml.getClickRegisterbutton().click(); 
	 }
	
	@Test(priority=17)

	public void AdLink()throws InterruptedException
	{
		
		AdvertiseLink_Page adl = new AdvertiseLink_Page(driver);
		
		adl.getAdvertiseLink().click();
		
	}
	
	@Test(priority=18)
	   public void voucher() throws InterruptedException{
		   
		   VoucherLink_Page vl =new  VoucherLink_Page(driver);
		   
		   
		   JavaScriptUtility sc=new JavaScriptUtility(driver);
		   vl.getVoucherLink().click();
	}
		@Test(priority=19)
	
		public void HelpCenter()throws InterruptedException {
		
		HelpCenterLink_Page hc= new HelpCenterLink_Page(driver);
		
		
		// JavaScriptUtility sc=new JavaScriptUtility(driver);
		hc.getCheckHelpCenter().click();
		JavaScriptUtility sc=new JavaScriptUtility(driver);
		hc.getDeliverOrderPage().click();
		hc.getOrderIdTextBar().sendKeys("ABC");
		hc.getClickDeliverButton().click();
		hc.getClickDebitCard().click();
		hc.getSelectIDHCbank().click();
		hc.getAddBalanceAmountTextField().sendKeys("100");
		hc.getAddBalanceSubmitButton().click();
		hc.getClickOnCreditCard().click();
		hc.getSelectBankDropdown().click();
		JavaScriptUtility sc1=new JavaScriptUtility(driver);
		hc.getClickRegisterNetBanking_AddAmount().click();
		hc.getNetBankingAmountTextField().sendKeys("5632");
		hc.getClickingAvatarImages().click();
		hc.getDownloadBoyImg().click();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

