package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ElementRepository.DropDownPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class all_Dropdown extends BaseTest{
	@Test
	
	public void Drop() {
		
       DropDownPage DD=new DropDownPage(driver);
       DD.getDropDownButton().click();
       DD.getMenDropdown().click();
       DD.getSearchButton().click();
       
       DD.getWomenDropdown().click();
       DD.getSearchButton().click();
       
       DD.getKidsDropDown().click();
       DD.getSearchButton().click();
       DD.getKidsAllensollyshirt().click();
       DD.getElephantToy().click();
	
		DD.getElectronicsDropDown().click();
		DD.getSearchButton().click();
		
		DD.getBeautyDropDown().click();
		DD.getSearchButton().click();
	
		DD.getSearchTextfield().sendKeys("Women");
		DD.getSearchButton().click();
		DD.getWomenRegularFitShirt().click();
	
	
	
	
	
	
	
	
	
	}
}
	/*WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://shoppersstack.com/");
	//Thread.sleep(2000);
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys("chitralatar@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Chitraravi10*");
	//driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).click();//login
	driver.findElement(By.id("Login")).click();//login
	
	driver.findElement(By.xpath("//select[@id='category']")).click();
	
	
	//driver.findElement(By.xpath("//select[@id=driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/legend")).click();
	//	Thread.sleep(1000);
				
			WebElement sortByDropDown=driver.findElement(By.id("category"));
			Select select = new Select(sortByDropDown);
			List<WebElement> options = select.getOptions();
			for (int i= 0;  i<options.size();  i++)
			{
			   WebElement sortByDropDown1 = driver.findElement(By.id("category"));
			   Select select1 = new Select(sortByDropDown1);
			   select1.selectByIndex(i);
		}
			
	driver.findElement(By.xpath("//option[@id='men']")).click();
	driver.findElement(By.id("searchBtn")).click();
	
	driver.findElement(By.xpath("//option[@id=women']")).click();
	driver.findElement(By.id("searchBtn")).click();
	
	driver.findElement(By.xpath("//option[@id='kids']")).click();
	driver.findElement(By.id("searchBtn")).click();
	
	//driver.findElement(By.xpath("//*contains(text)(),'Mi Arcus Elephant Soft Toy')]")).click();
	driver.findElement(By.xpath("//*[contains(text(),'allen solly')]")).click();
	driver.findElement(By.id("Add To Cart")).click();
	driver.findElement(By.xpath("//*[contains(text(),'mi arcus')]")).click();
	driver.findElement(By.id("Add To Cart")).click();
	
	//search-button ---->    driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.xpath("//option[@id='electronics']")).click();
	driver.findElement(By.id("searchBtn")).click();
	
	driver.findElement(By.xpath("//option[@id='beauty']")).click();
	driver.findElement(By.id("searchBtn")).click();
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("women");
	driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.id("Add To Cart")).click();
	
	driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();//Acc Setting
	driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'][6]")).click();
	*/
	
	


