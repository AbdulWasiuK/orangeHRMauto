package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By to locate dashboardPage elements
    private final By welcome = By.id("welcome");
    private final By logoutButton = By.linkText("Logout");
    private final By subscriberButton = By.id("Subscriber_link");
    private final By companyBrand = By.xpath("//*[@id=\"branding\"]/a[1]/img");
    private final By dashboardText = By.xpath("//*[@id=\"content\"]/div/div[1]/h1");


    public void clickWelcome() {
        //Find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }

    public LoginPage clickLogout() {
        //find the logout element and click on the logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);

    }



    public void verifycompanyBrand(){
        driver.findElement(companyBrand).isDisplayed();

    }
    public void verifydashboardText (){
        driver.findElement(dashboardText).getText();

    }
}