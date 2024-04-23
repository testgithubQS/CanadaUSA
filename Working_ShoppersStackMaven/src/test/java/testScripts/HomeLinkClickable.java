package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.HomeLink_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeLinkClickable extends BaseTest{

	@Test
	public void Home() {
		
		HomeLink_Page hl=new HomeLink_Page (driver);
		
		hl.getKidsImgClickable().click();
		hl.getHomeLinkWorking().click();
		hl.getClickingSantoor().click();
		hl.getAddToCart().click();
		
		
	}

}
