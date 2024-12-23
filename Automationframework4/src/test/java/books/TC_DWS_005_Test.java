package books;

import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseCLass;
import genericutility.ListenerUtility;
import objectrepositary.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_005_Test extends BaseCLass {
   @Test
    public void clickOnBooks() {
	   test=extReport.createTest("clickOnBooks");
	   hp=new HomePage(driver);
	   hp.getBooksLink().click();
	   Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books");
	   test.log(Status.PASS, "Books page is displayed");
   }

}
