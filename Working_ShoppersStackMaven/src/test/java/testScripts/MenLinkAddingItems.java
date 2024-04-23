package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.MenLinkAddingItems_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenLinkAddingItems extends BaseTest {
	@Test
	public void Men_link()
	{
		MenLinkAddingItems_Page mn=new MenLinkAddingItems_Page(driver);
		
		mn.getMenHeaderLink().click();
		mn.getTopWear().click();
		mn.getAddToCart().click();
		mn.getAddToCartKurta().click();
		mn.getBottomWear().click();
		mn.getHomeLink().click();
		
	}
	}

	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("chitralatar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chitraravi10*");
		driver.findElement(By.id("Login")).click();//login
	
		driver.findElement(By.xpath("//a[@id='men']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'puma')][1]")).click();
	    driver.findElement(By.xpath("//button[@id='Add To Cart']")).click();//AddtoCart
	    driver.findElement(By.xpath("//div[@class='featuredProducts_cardFooter__B8KN4'][1]")).click();//festiveKurta
	    driver.findElement(By.partialLinkText("BottomWear")).click();
	    driver.findElement(By.linkText("Home")).click();
		
		
		//logout		
				driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();//Acc Setting
				driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'][6]")).click();//Logout
	*/
