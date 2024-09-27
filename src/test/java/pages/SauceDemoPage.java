package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {
    public SauceDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='user-name']")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='inventory_item_name '])[1]")
    public WebElement ilkUrunText;

    @FindBy(xpath = "//*[@id='add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    public WebElement sepettekiIsim;










}
