package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {
    public DatatablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newBtn;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createBtn;

    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement nameListElement;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;
}
