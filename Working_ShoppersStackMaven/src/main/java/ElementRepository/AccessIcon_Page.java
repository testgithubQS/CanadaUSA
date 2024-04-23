package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class AccessIcon_Page extends Base_Page  
	{	
   public AccessIcon_Page(WebDriver driver) 
   {
	   super();
   	}

   	@FindBy(xpath="//div[@class='chatbot-items']")
   	private WebElement ChatIconWorking;

	@FindBy(xpath="//p[@class='chat_with_bot'][1]")
	private WebElement ClickingDeliveryOption;

	@FindBy(xpath="//input[@id='chat_input']")
	private WebElement EnterValuesInChatBox;

	@FindBy(xpath="//span[@class='chat_send_arrow']")
	private WebElement ClickindOnSmallArrowButton;

	public WebElement getChatIconWorking() {
		return ChatIconWorking;
	}

	public WebElement getClickingDeliveryOption() {
		return ClickingDeliveryOption;
	}

	public WebElement getEnterValuesInChatBox() {
		return EnterValuesInChatBox;
	}

	public WebElement getClickindOnSmallArrowButton() {
		return ClickindOnSmallArrowButton;
	}
	
	
	public void Icon()
	{
		getChatIconWorking().click();
		getClickingDeliveryOption().click();
		getEnterValuesInChatBox().sendKeys("Hello");
		getClickindOnSmallArrowButton().click();
		
	}
	}

