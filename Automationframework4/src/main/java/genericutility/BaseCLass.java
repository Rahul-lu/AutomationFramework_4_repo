package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepositary.HomePage;
import objectrepositary.LoginPage;
import objectrepositary.WelcomePage;

public class BaseCLass {
       public static WebDriver driver;
       public static ExtentReports extReport;
       public static ExtentTest test;
       
       public JavaUtility jLib=new JavaUtility();
       public FileUtility flib=new FileUtility();
       
       public WelcomePage wp;
       public LoginPage lp;
       public HomePage hp;
       
       @BeforeSuite
       public void reportConfig() {
    	   ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/"+jLib.getSystemTime()+".html");
    	   extReport=new ExtentReports();
    	   extReport.attachReporter(spark);
       }
       @Parameters("Browser")
       @BeforeClass
       public void launchBrowser() throws IOException {
    	   WebDriver driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	   
    	   driver.get(flib.getDataFromProperty("url"));
       }
       
       @BeforeMethod
       public void login() throws IOException {
       wp=new WelcomePage(driver);
       wp.getLoginLink().click();
       lp=new LoginPage(driver);
       lp.getemailTextfield().sendKeys(flib.getDataFromProperty("email"));
       lp.passwordTextField().sendKeys(flib.getDataFromProperty("password"));
       lp.logInButton().click();
       }
       
       @AfterMethod
       public void logout() {
    	   hp=new HomePage(driver);
    	   hp.getLogoutLink().click();
       }
       
       @AfterClass
       public void closeBrowser() {
    	   driver.quit();
       }
       
       @AfterSuite
       public void reportBackup() {
    	   extReport.flush();
    	   
       }
}
