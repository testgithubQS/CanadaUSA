package testScripts;

import org.testng.annotations.Test;

import ElementRepository.CreateAdminLink_Page;

public class CreateAdminAccountTest extends BaseTest{
@Test

 public void  adminacc()
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
}
