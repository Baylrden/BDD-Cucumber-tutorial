package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement signUpLinkElement;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createAccBtn;

    @FindBy(id = "id_gender1")
    public WebElement mrRadioButton;

    @FindBy(id = "last_name")
    public WebElement formSoyisimKutusu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedYazisi;


}
