package objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
     @FindBy(linkText="Log out")
     private WebElement logOutLink;
     
     @FindBy(partialLinkText="Books")
     private WebElement booksLink;
     
     public HomePage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);	
	}
     public WebElement getLogoutLink() {
		return logOutLink;
     }
     public WebElement getBooksLink() {
 		return booksLink;
     }
}
