package allbrowserSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;


public class FirstCodeSetup {
    public WebDriver driver;

    //@Test
    //public void SafariBrowser() {
      //  WebDriver driver = new SafariDriver();
        //driver.get("http://automationpractice.com/index.php");
        //driver.quit();

    @BeforeTest

    public void chromebrowser() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        //driver.quit();
    }
    //@Test
    //public void Firefoxbrowser() {
      //  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
        //WebDriver driver = new FirefoxDriver();
        //driver.get("http://automationpractice.com/index.php");
       // driver.quit();
    }
    //@Test
    //public void ChromeBrowserWithWebManager(){
      //  WebDriverManager.chromedriver().setup();
        //WebDriver driver =new ChromeDriver();
       // driver.get("http://automationpractice.com/index.php");
        //driver.quit();








