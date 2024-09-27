package pages.TestOtomasyonu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestOtomasyonPage {

    public TestOtomasyonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /*
    Page class'lari locate yapmak ve
    varsa login islemi gibi calistigimiz sayfaya ozel fonksiyonlara ait
    basit methodlar olusturmak icin kullanilir.

    Page class'larinin en buyuk yeniligi
    sriver.findElement() veya elements methodlari yerine
    @FindBy notasyonu kullanmasidir.
     */

    @FindBy(id = "global-search")
    public WebElement aramakutusu;

    @FindBy(xpath = "(//img[@src='https://testotomasyonu.com/frontend/images/account.png'])[1]")
    public WebElement accountIcon;

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "submitlogin")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@class=' heading-sm mb-4']")
    public List<WebElement> urunlerList;

    @FindBy(xpath = "//*[@class=' heading-sm mb-4']")
    public WebElement ilkUrunHeader;

    @FindBy(xpath = "//*[@class='add-to-cart']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "(//span[@class='menu-icon-text'])[3]")
    public WebElement sepetIcon;

    @FindBy(xpath = "//*[@class='product-title text-center']")
    public WebElement sepetteUrunIsmi;

    @FindBy(xpath = "//*[@class='product-box my-2  py-1']")
    public List<WebElement> guncelList;

    @FindBy(xpath = "//*[@class='notfoundtxt mt-5']")
    public WebElement notFoundLabel;

}
