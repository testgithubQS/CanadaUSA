package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.AddingBeautyProducts_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingBeautyProducts_Test  extends BaseTest {
@Test
public void BeautyLink() 
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

}


