package testScripts;

import org.testng.annotations.Test;

import ElementRepository.AddingElectronicsItems_Page;

public class AddingElectronics_Test extends BaseTest {

	@Test
	public void ElectronicLink() {
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

}
