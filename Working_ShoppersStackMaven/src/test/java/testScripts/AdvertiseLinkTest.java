package testScripts;

import org.testng.annotations.Test;

import ElementRepository.AdvertiseLink_Page;

public class AdvertiseLinkTest extends BaseTest
{
@Test

public void AdLink() {
	
	AdvertiseLink_Page adl = new AdvertiseLink_Page(driver);
	
	adl.getAdvertiseLink().click();
	
}
}
