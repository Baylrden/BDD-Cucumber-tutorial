package pages.TestOtomasyonu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestOtomasyonuAddRemove {
    public TestOtomasyonuAddRemove() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2")
    public WebElement header;

    @FindBy(xpath = "//title")
    public WebElement sayfaTitle;

    @FindBy(xpath = "//*[text()='Electronics Products']")
    public WebElement electronicsLinki;

    @FindBy(xpath = "//*[@class='product-box mb-2 pb-1']")
    public List<WebElement> urunList;


}
