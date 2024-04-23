package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS16WebSiteLink_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shoppersstack.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://shoppersstack.com/");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		driver.get("https://www.google.com/");
		
		
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("ShoppersStack Private Limited, "
				+ "Gopalan Coworks, "+ "Kathreguppe, Banashankari 3rd Stage, Bangalore, 560029, Karnataka, India");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().window(parentWindow);
		*/
		
		
	}

}
