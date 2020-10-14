package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    //Create login object
    protected LoginPage loginPage;

    //Create a webDriver
    private WebDriver driver;


    @BeforeTest

    // import chromeDriver
    public void setUps() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //Instantiate webDriver object
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Launch the application URl and wait
        driver.get("https://opensource-demo.orangehrmlive.com/");
        // Global Waiting period
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Instantiate the login page after launching the browser - Handle
        loginPage = new LoginPage(driver);
    }

    @AfterTest

    public void closeBrowser() {
        driver.quit();
    }
}
