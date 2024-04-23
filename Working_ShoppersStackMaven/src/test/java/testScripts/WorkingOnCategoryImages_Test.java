package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.CategoryImages_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

		public class WorkingOnCategoryImages_Test extends BaseTest {
		@Test
		public void CategoryImg() {
			
			 CategoryImages_Page ci=new  CategoryImages_Page(driver);
			 
			 	ci.getKidImageLink().click();
				ci.getHomeLinkWorking().click();
				ci.getMenImageLink().click();
				ci.getWomenImageLinK().click();
				ci.getElectronicImageLink().click();
				ci.getBeautyImageLink().click();
				
	
}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		/*  WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://shoppersstack.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("loginBtn")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chitralatar@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Chitraravi10*");
			driver.findElement(By.id("Login")).click();
			
			//WRITE code for scroll and element is visible
			
			
			driver.findElement(By.xpath("//a[@id='kidsProd']")).click();
			driver.findElement(By.xpath("//a[@id='mensProd']")).click();
			driver.findElement(By.xpath("//a[@id='womensProd']")).click();
			driver.findElement(By.xpath("//a[@id='electronic'sProd]")).click();
			driver.findElement(By.xpath("//a[@id='beautyProd']")).click();
			driver.findElement(By.linkText("Home")).click();		
	*/


