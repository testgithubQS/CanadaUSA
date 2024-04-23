package testScripts;

import org.testng.annotations.Test;

import ElementRepository.ArrowIcon_Page;

public class ArrowIconTest extends BaseTest {
@Test
public void Arrows() {
	
	ArrowIcon_Page ai= new ArrowIcon_Page (driver);
	
	
	ai.getCheckingArrowWorks().click();
	
	
}
}
