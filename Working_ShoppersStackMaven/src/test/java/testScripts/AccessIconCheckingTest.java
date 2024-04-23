package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.AccessIcon_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessIconCheckingTest extends BaseTest{
	@Test
	public void  Icon ()
	{
		AccessIcon_Page ac = new AccessIcon_Page(driver);
		
		ac.getChatIconWorking().click();
		ac.getClickingDeliveryOption().click();
		ac.getEnterValuesInChatBox().sendKeys("Hello");
		ac.getClickindOnSmallArrowButton().click();
		
		
		
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*     public static void main(String[] args) throws InterruptedException {
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
		
		
		driver.findElement(By.xpath("//div[@class='chatbot-items']")).click();//click On Icon
		
		driver.findElement(By.xpath("//p[@class='chat_with_bot'][1]")).click();//clickOn  1.Deliver Option
		driver.findElement(By.xpath("//input[@id='chat_input']")).sendKeys("Hello");//enter hello
		
		driver.findElement(By.xpath("//span[@class='chat_send_arrow']")).click();//small arrow button
*/
		