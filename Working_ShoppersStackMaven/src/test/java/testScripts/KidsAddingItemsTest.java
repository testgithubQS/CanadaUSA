package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.KidsAddingItems_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KidsAddingItemsTest extends BaseTest {

	@Test
	public void KidsLink() {
		
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

}
