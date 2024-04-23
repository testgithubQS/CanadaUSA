package testScripts;

import org.testng.annotations.Test;

import ElementRepository.AutoSlideImages_Page;

public class AutoSlideImg_Test extends BaseTest{
@Test

public void SlideImg() {
	
	AutoSlideImages_Page sl= new AutoSlideImages_Page(driver);
	
	sl.getAdidasClickable().click();
	

	}

}
