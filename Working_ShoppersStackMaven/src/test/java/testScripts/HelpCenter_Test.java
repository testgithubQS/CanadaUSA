package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ElementRepository.HelpCenterLink_Page;
import Generic_Library.JavaScriptUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelpCenter_Test extends BaseTest{
	@Test
	
	public void HelpCenter() {
		
		HelpCenterLink_Page hc= new HelpCenterLink_Page(driver);
		
		
		// JavaScriptUtility sc=new JavaScriptUtility(driver);
		hc.getCheckHelpCenter().click();
		JavaScriptUtility sc=new JavaScriptUtility(driver);
		hc.getDeliverOrderPage().click();
		hc.getOrderIdTextBar().sendKeys("ABC");
		hc.getClickDeliverButton().click();
		hc.getClickDebitCard().click();
		hc.getSelectIDHCbank().click();
		hc.getAddBalanceAmountTextField().sendKeys("100");
		hc.getAddBalanceSubmitButton().click();
		hc.getClickOnCreditCard().click();
		hc.getSelectBankDropdown().click();
		hc.getClickRegisterNetBanking_AddAmount().click();
		hc.getNetBankingAmountTextField().sendKeys("5632");
		hc.getClickingAvatarImages().click();
		hc.getDownloadBoyImg().click();
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
		
		//scrolling action
		/*WebElement scrollEle=driver.findElement(By.linkText("Help Center"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);js.executeScript("window.scrollBy(0,1000;");
		*/
		
		
		/*Actions action = new Actions(driver);
		WebElement HelpCenter =driver.findElement(By.partialLinkText("HelpCenter"));//i can see MUMBAI RESTAURANT  
		action.scrollToElement(HelpCenter).build().perform();
       
		
		
		 driver.findElement(By.linkText("Help Center")).click();//HelpCenter Link inbotttom
		 
		driver.findElement(By.xpath("//button[@id='simple-tab-1']")).click();//DeliverOrder Page
		driver.findElement(By.xpath("//input[@id=':r2:']")).click();//orderId Textfield
		
		driver.findElement(By.xpath("MuiButtonBase-root MuiButton-root "
				+ "MuiButton-contained MuiButton-containedPrimary"
				+ " MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s'[")).click();//click on Deliver button						
		
		//driver.findElement(By.xpath("//button[@id='simple-tab-2']")).click();//Debit card Page				
		driver.findElement(By.xpath("//form[@class='help_cardForm__DpZ9F MuiBox-root css-0']/select/option[2]")).click();
	   // driver.findElement(By.		
	    
	    */
	


