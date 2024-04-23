package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ElementRepository.CartLogo_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

     public class CartLogo extends BaseTest{
	@Test
 
	public void Cart()
	{
		CartLogo_Page  cp= new CartLogo_Page(driver);
		
		//cp.AddingDetailsToCart();
		Object utility_Methods;
		// utility_Methods).takeScreenshot(driver);
		
		//base_Page.getMenLink().click();
	//	utility_Methods.takeScreenshot(driver);
		
		/*cp.getCartLogo().click();
		cp.getContinueShoppingButton().click();
		cp.getBuyNowButton().click();
		cp.getAddNewAddressButton().click();
		cp.getRadioButtonHome().click();
		cp.getNameTextfield().sendKeys("Spider");
		cp.getHouseInfo().sendKeys("Bengaluru");
		cp.getStreetInfo().sendKeys("123AD");
		cp.getLandmarknfo().sendKeys("Gudi");
		cp.getChoosecountry().click();
		cp.getChooseState().click();
		cp.getChooseCity().click();
		cp.getPinCodeTextField().sendKeys("12345");
		cp.getPhoneNumberTexfield().sendKeys("1234567899");
		*/
		
		
		
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
		
		driver.findElement(By.xpath("//a[@id='cart']")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Continue Shopping')]")).click();//ContinueShopping
		driver.findElement(By.xpath("//button[@id='buynow_fl']")).click();//BuyNow
		driver.findElement(By.xpath("//*[contains(text(),'Add New Address')]")).click();
		driver.findElement(By.xpath("//input[@id='Home']")).click();
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Chitra");
		driver.findElement(By.xpath("//input[@id='House/Office Info']")).sendKeys(" South whiteField");
		driver.findElement(By.xpath("//input[@id='Street Info']")).sendKeys("1234A");
		driver.findElement(By.id("Landmark")).sendKeys("Dakota");
		
		driver.findElement(By.xpath("//select[@id='Country']")).click();
		
		WebElement sortByDropDown=driver.findElement(By.id("category"));
		Select select = new Select(sortByDropDown);
		List<WebElement> options = select.getOptions();
		for (int i= 0;  i<options.size();  i++)
		{
		   WebElement sortByDropDown1 = driver.findElement(By.id("category"));
		   Select select1 = new Select(sortByDropDown1);
		   select1.selectByIndex(i);
	}
		
		driver.findElement(By.xpath("//option[@id='USA']")).click();
		driver.findElement(By.xpath("//option[@id='Alaska']")).click();
		driver.findElement(By.xpath("//option[@id='Badger']")).click();
		
		driver.findElement(By.id("Pincode")).click();
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9119119112");
		driver.findElement(By.xpath("//button[@id='btnDisabled']")).click();
	
	*/
	

	
	
	


