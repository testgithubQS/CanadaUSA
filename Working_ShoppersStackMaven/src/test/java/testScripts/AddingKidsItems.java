package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingKidsItems {
	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.xpath("//a[@id='kids']")).click();	
		driver.findElement(By.linkText("T-SHIRTS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'us polo kids')]")).click();
		
		driver.findElement(By.linkText("SHIRTS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'us polo kids')]")).click();
		
		
		driver.findElement(By.linkText("SHIRTS")).click();
		driver.findElement(By.linkText("JEANS")).click();
		driver.findElement(By.linkText("CLOTHING SETS")).click();
		driver.findElement(By.linkText("ETHNIC WEAR")).click();
		driver.findElement(By.linkText("PARTY WEAR")).click();
		//GirlsKids
		
		driver.findElement(By.xpath("//a[@id='kids']")).click();
		driver.findElement(By.linkText("TOPS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'apple group')]")).click();
		driver.findElement(By.xpath("//a[@id='kids']")).click();
		driver.findElement(By.xpath("TSHIRTS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'niya')]")).click();
		driver.findElement(By.linkText("CLOTHING SETS")).click();
		
		driver.findElement(By.linkText("KURTA SETS")).click();
		driver.findElement(By.linkText("PARTY WEAR")).click();
		driver.findElement(By.linkText("DUNGAREEA & JUMPSUITS")).click();					
		driver.findElement(By.linkText("SKIRTS_SHORTS")).click();
		driver.findElement(By.linkText("JEANS")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Naughty Ninos Store')]")).click();

		
		
		
		
		
		
		
		
}
}