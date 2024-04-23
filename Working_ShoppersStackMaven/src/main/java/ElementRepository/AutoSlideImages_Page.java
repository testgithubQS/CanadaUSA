package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoSlideImages_Page extends Base_Page {
public AutoSlideImages_Page(WebDriver driver) {
	super();
}

@FindBy(xpath="//*[contains(text(),'ADIDAS')][1]")
private WebElement AdidasClickable;

public WebElement getAdidasClickable() {
	return AdidasClickable;
}

public void AutoslideClickable()
{
	getAdidasClickable().click();
}

}
