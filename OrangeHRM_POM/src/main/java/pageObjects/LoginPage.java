package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    //Using By as a locator to identify the login fields
    private By username = By.id ("txtUsername");
    private By password = By.id ("txtPassword");
    private By loginButton  = By.id("btnLogin");
    private By companyLogo = By.id("divLogo");
    private By forgotPassword = By.linkText("Forgot your password?");
    private By loginPanel = By.xpath ("/html//div[@id='logInPanelHeading']");


    public void verifyCompanyLogo (){
        //find the company logo element and verify
        driver.findElement(companyLogo).isDisplayed();
    }

    public void verifyLoginPanel (){
        //find the loginPanel element and verify
        driver.findElement(loginPanel).getText();
    }

    public void verifyForgotPassword (){
        //find the loginPanel element and verify
        driver.findElement(forgotPassword).isDisplayed();
    }


    public void enterUsername (String uName){
        //Find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterPassword (String pwd) {
        //Find the password and enter the password
        driver.findElement(password).sendKeys(pwd);
    }

    public DashboardPage clickLoginButton (){
        //Find the loginbutton and click the element
        driver.findElement(loginButton).click ();
    return new DashboardPage (driver);
    }

}



