package testScripts;

import org.testng.annotations.Test;

import ElementRepository.ArrowIcon_Page;
import Generic_Library.UtilityMethods;

public class CheckingArrowIcon_test extends BaseTest{

	@Test
	public void  checkArrows() 
	{
		ArrowIcon_Page ai = new ArrowIcon_Page(driver);
		ai.CheckingArrowFunction();
		UtilityMethods utilityMethods = new UtilityMethods();
		utilityMethods.getCurrentTime();
	}
	

}
