package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertiseLink_Page extends Base_Page {
public AdvertiseLink_Page(WebDriver driver) {
	super();
}


@FindBy(linkText="Advertise")
private WebElement AdvertiseLink;


public WebElement getAdvertiseLink() {
	return AdvertiseLink;
}


public void CheckingAdvertiseLink()
{
	getAdvertiseLink().click();
}
}
