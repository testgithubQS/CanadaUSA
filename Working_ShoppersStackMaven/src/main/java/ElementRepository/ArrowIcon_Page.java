package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrowIcon_Page extends Base_Page{
public ArrowIcon_Page(WebDriver driver) {
	super();
}

@FindBy(xpath="//button[@aria-label='Go to next page']]")
private WebElement CheckingArrowWorks;

public WebElement getCheckingArrowWorks() {
	return CheckingArrowWorks;
}

public void CheckingArrowFunction()
{
	getCheckingArrowWorks().click();
}




}
