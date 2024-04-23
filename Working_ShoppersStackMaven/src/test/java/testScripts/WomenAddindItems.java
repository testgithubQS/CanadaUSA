package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.WomenAddingItems_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WomenAddindItems extends BaseTest{
	@Test
	public void womenLink() {
		 WomenAddingItems_Page wl=new  WomenAddingItems_Page(driver);
		 
		 wl.getWOMENLink().click();
		 wl.getSUB_KurtaSuits().click();
		 wl.getSUBEthnicWear().click();
		 wl.getSUBSaree().click();
		 wl.getSUBLengas().click();
		 wl. getSUBdress().click();
		 wl.getSUBtops().click();
		 wl.getSUBtops1() .click();
		 wl.getSUB_Shirts().click();
		 wl.getSUBjeans().click();
		 wl.getSUBshirt().click();
		 wl.getSUBShorts_skirts().click();
		 wl.getSUBjSuits().click();
		 wl.getSUBsweaters().click();
		 wl. getSUBjackets_coats().click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
}

	/*public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chitralatar@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Chitraravi10*");
		driver.findElement(By.id("Login")).click();	
		
		driver.findElement(By.xpath("//a[@id='women']")).click();
		driver.findElement(By.linkText("KURTAS & SUITS")).click();
		
		driver.findElement(By.linkText("ETHNIC WEAR")).click();
		driver.findElement(By.linkText("PARTY WEAR")).click();
		
		driver.findElement(By.linkText("SAREES")).click();
		driver.findElement(By.xpath("//*[contains(text(),'SAREE')]")).click();
		
		driver.findElement(By.linkText("LEHENGA CHOLIS")).click();
		driver.findElement(By.linkText("DRESSES")).click();
		
		driver.findElement(By.linkText("TOPS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'FOREVER 21  Casual Regular Sleeves ...')]")).click();
		
		driver.findElement(By.linkText("TSHIRTS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'FOREVER 21  Casual Regular Sleeves ...')]")).click();
		
		driver.findElement(By.linkText("JEANS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'kotty")).click();
		
		driver.findElement(By.linkText("SHIRT")).click();
		driver.findElement(By.xpath("//*[contains(text(),'selvia')]")).click();
				
		driver.findElement(By.linkText("SHORTS & SKIRTS")).click();
	
		driver.findElement(By.linkText("JUMPSUITS")).click();
		
		driver.findElement(By.linkText("SWEATERS")).click();
		
		driver.findElement(By.linkText("JACKETS & COATS")).click();
		
	*/	
		
	
