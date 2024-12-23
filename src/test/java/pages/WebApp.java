package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebApp {
    public WebApp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement signInButton;

    @FindBy(id = "user_login")
    public WebElement usernameKutusu;

    @FindBy(id = "user_password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@name='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='dropdown-toggle'])[2]")
    public WebElement confirmLogin;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBanking;

    @FindBy(id = "pay_bills_link")
    public WebElement payBills;

    @FindBy(xpath = "//*[text()='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;






}
