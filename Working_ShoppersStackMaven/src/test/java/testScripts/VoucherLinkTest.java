package testScripts;

import org.testng.annotations.Test;

import ElementRepository.VoucherLink_Page;
import Generic_Library.JavaScriptUtility;

public class VoucherLinkTest  extends BaseTest{
   @Test
   public void voucher() {
	   
	   VoucherLink_Page vl =new  VoucherLink_Page(driver);
	   
	   
	   JavaScriptUtility sc=new JavaScriptUtility(driver);
	   vl.getVoucherLink().click();
	  
   
   
   }
}
