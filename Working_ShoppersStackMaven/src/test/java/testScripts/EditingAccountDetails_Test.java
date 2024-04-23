package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ElementRepository.EditingAccountDetails_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditingAccountDetails_Test extends BaseTest {
	@Test
	
	public void Edit() {
		EditingAccountDetails_page  ea =new EditingAccountDetails_page(driver);
		ea.getMyProfileSetting().click();
		ea.getEditProfile().click();
		ea.getFirstnameTextFieldEditProfile().sendKeys("firstName");;
		ea.getLastnameEditProfile().sendKeys("lastName");
		ea.getDOBTextField().sendKeys("DOB");
		ea.getChooseCountry() .click();
		ea.getChooseCountryOption().click();
		ea.getChooseStateOption().click();
		ea.getChoosecityOption().click();
		ea.getSubmittButton().click();
		ea.getMyAddress().sendKeys("address");
		ea.getEnterPinCodeTextfield().sendKeys("889958");
		 ea.getUpdateAddressButton().click();
		 ea.getMyWallet().click();
		 ea.getAddMoney().click();
		 ea.getUseCoupon().click();
		 ea.getUseCouponcode().sendKeys("ABC");
		 ea.getVerifyButton().click();
		 ea.getViewTransaction().click();
		 ea.getMyLikes().click();
		 ea.getMyLikesSelectCategory().click();

		
		
		
		
		
		
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
		driver.findElement(By.id("Email")).sendKeys("chitralatar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chitraravi10*");
		driver.findElement(By.id("Login")).click();//login
	
		driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")).click();//AccountSetting
		
		//My Profile
		driver.findElement(By.xpath("MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz")).click();//MyProfile
		driver.findElement(By.xpath("//*[contains(text(),'Edit Profile')]")).click();//EditProfile
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Chitra");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Lata");
		driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0'][1]")).sendKeys("9119119112");
		
		driver.findElement(By.xpath("//option[@id='Country']")).click();//Countrydropdown
		driver.findElement(By.xpath("//option[@id='Canada']")).click();//country
		driver.findElement(By.xpath("//select[@id='State']")).click();//state
		driver.findElement(By.xpath("//option[@id='Badami']")).click();//city
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();//submit
		//My Address
		driver.findElement(By.xpath("//div[@class='MuiGrid-root ediprofileDashNavlink css-rfnosa']")).click();//MyAddress
		driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("569562");//Edit Pincode
		driver.findElement(By.xpath("//button[@id='Update Address']")).click();
		
		//My Vallet
		driver.findElement(By.xpath("//div[@class='MuiGrid-root profileDashactive css-rfnosa']")).click();//MyWallet
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-7u9jyn'][1]")).click();//AddMoney
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-7u9jyn'][2]")).click();//UseCoupon
		driver.findElement(By.xpath("//input[@id='Coupon Code']")).sendKeys("123");//couponcodeTextField
		driver.findElement(By.xpath("//button[@name='Verify']")).click();//VerifyButton
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-7u9jyn'][3]")).click();//ViewTransaction
		
		//My Likes
		driver.findElement(By.xpath("//div[@class='MuiGrid-root profileDashactive css-rfnosa']")).click();
		driver.findElement(By.xpath("//select[@id='category']")).click();//Dropdown Women
		driver.findElement(By.id("searchBtn")).click();
		/*driver.findElement(By.xpath("//option[@id='beauty']")).click();//dropdownBeauty
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//div[@class='featuredProducts_cardFooter__B8KN4'][1]")).click();
		
		
		logout		
		driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();//Acc Setting
		driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'][6]")).click();//Logout
		*/

