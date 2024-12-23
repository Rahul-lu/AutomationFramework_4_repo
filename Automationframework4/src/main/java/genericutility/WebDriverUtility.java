package genericutility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 *@author Rahul
 */

public class WebDriverUtility {
	/**
	 * This method will switch the driver control to frame based on index passed
	 * @param driver
	 * @param index
	 */
public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
/**
 * This method will switch the driver control to frame based on name or id present iframe tag
 * @param driver
 * @param index
 */
  public void switchToFrame(WebDriver driver,String nameOrId) {
	  driver.switchTo().frame(nameOrId);
  }
  /**
	 * This method will switch the driver control to frame based on WebElement iframe 
	 * @param driver
	 * @param index
	 */
  public void switchtoFrame(WebDriver driver,WebElement element) {
	  driver.switchTo().frame(element);
  }
  public void rightClick(WebDriver driver) {
	  Actions act=new Actions(driver);
	  act.contextClick().perform();
  }
  public void mouseHover(WebDriver driver,WebElement element) {
	  Actions act=new Actions(driver);
	  act.moveToElement(element).perform();
  }
  public void doubleClick(WebDriver driver,WebElement element) {
	  Actions act=new Actions(driver);
	  act.doubleClick(element).perform();
  }
  public void dragAndDrop(WebDriver driver,WebElement element) {
	  Actions act=new Actions(driver);
	  act.dragAndDrop(element, element).perform();
  }
  public void selectByIndex(WebElement element,int index) {
	  Select ref=new Select(element);
	  ref.selectByIndex(index);
  }
  public void selectByValue(WebElement element,String value) {
	  Select ref=new Select(element);
	  ref.selectByValue(value);
  }
}
