package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.CreateAccount_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountTest extends BaseTest{
	@Test

	 public void LogingInToTheAccount() {
		CreateAccount_Page cap= new CreateAccount_Page(driver);
		cap.getEmailTextField().sendKeys("chitralatar@gmail.com");
		cap.getLoginButton().click();
		cap.getLog_in().click();
		cap.getPasswordTextField().sendKeys("Chitraravi10*");
	}
	
}
	
	
	
		/*driver.findElement(By.id("loginBtn")).click();
	
		driver.findElement(By.id("Create Account")).click();
		WebElement firstName = driver.findElement(By.id("First Name"));
		firstName.sendKeys("Automation");
		WebElement lastName = driver.findElement(By.id("Last Name"));lastName.sendKeys("Engineer");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.name("Phone Number")).sendKeys("9119119111");
		driver.findElement(By.id("Email Address")).sendKeys("chitralatar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chitraravi10*");
		driver.findElement(By.id("Confirm Password")).sendKeys("Chitraravi10*");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("chitralatar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chitraravi10*");
		driver.findElement(By.id("Login")).click();//login
		driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();//Acc Setting
		driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'][6]")).click();
		*/
		
	

