package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class VoucherLink_Page extends Base_Page{
		public VoucherLink_Page(WebDriver driver) {
			super();
		}

		@FindBy(linkText="Voucher")
		private WebElement VoucherLink;

		public WebElement getVoucherLink() {
				return VoucherLink;
		}

		public void checkingVoucherLink()
		{
			getVoucherLink().click();
		}


	}
