package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriberPage {

    public SubscriberPage (WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    //Using By to locate SubscriberPage elements
    private By SubscriberName = By.id("subscriber_name");
    private By SubscriberEmail = By.id("subscriber_email");
    private By subscribeButton = By.id ("btnSubscribe");
    private By DashboardPage = By.id("Dashboard");
    private By welcome = By.id("welcome");
    private By logoutButton = By.linkText("Logout");


    public void enterName (String sName){
        //Find the username element and enter the username
        driver.findElement(SubscriberName).sendKeys(sName);
    }
    public void enterEmail (String sPwd){
        //Find the email and enter the email
        driver.findElement(SubscriberEmail).sendKeys(sPwd);
    }

    public void clickSubscriberButton (){
        //Find the Subscriber Button and click the button
        driver.findElement(subscribeButton).click ();
    }
    public DashboardPage clickDashboardMenu(){
        driver.findElement(DashboardPage).click();
        return new DashboardPage(driver);
    }
    public void clickWelcome (){
        //Find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }

    public LoginPage clickLogout(){
        //Find the logout element an click on the logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
}
}