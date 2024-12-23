package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseCLass;
import objectrepositary.HomePage;

public class TC_DWS_006_Test extends BaseCLass {
   @Test
    public void clickOnBooks() {
	   test=extReport.createTest("clickOnComputers");
	   hp=new HomePage(driver);
	   hp.getBooksLink().click();
	   Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Home page is not displayed");
	   test.log(Status.PASS, "Computer page is displayed");
   }

}
