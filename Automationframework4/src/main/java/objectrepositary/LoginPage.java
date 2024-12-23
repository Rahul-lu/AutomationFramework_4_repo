package objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy (id = "Password")
	private WebElement passwordTextField;
	
	@FindBy (xpath = "Log in")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
     
	public WebElement getemailTextfield() {
		return emailTextField;
	}
		
		public WebElement passwordTextField() {
			return passwordTextField;
		}
	public WebElement logInButton() {
		return loginbutton;
}
}
