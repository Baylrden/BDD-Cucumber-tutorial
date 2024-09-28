package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonu.TestOtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestotomasyonStepdefinitions {

    TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();

    String satirdakiUrunIsmi;
    String satirdakiMinUrunSayisi;

    @Given("kullanici Testotomasyon sayfasina gider")
    public void kullanici_testotomasyon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

    }
    @When("phone icin arama yapar")
    public void phone_icin_arama_yapar() {

        testOtomasyonPage.aramakutusu.sendKeys("Phone"+ Keys.ENTER);


    }
    @Then("aradigi urunun bulundugunu test eder")
    public void aradigi_urunun_bulundugunu_test_eder() {

        Assert.assertFalse(testOtomasyonPage.guncelList.isEmpty());

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }

    @And("dress icin arama yapar")
    public void dressIcinAramaYapar() {
        testOtomasyonPage.aramakutusu.sendKeys("Dress"+ Keys.ENTER);
    }

    @And("java icin arama yapar")
    public void javaIcinAramaYapar() {
        testOtomasyonPage.aramakutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("aradigi urunun bulunmadigini test eder")
    public void aradigiUrununBulunmadiginiTestEder() {
        Assert.assertTrue(testOtomasyonPage.notFoundLabel.isDisplayed());
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakUrun) {
        testOtomasyonPage.aramakutusu.sendKeys(aranacakUrun+ Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }


    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String urlFromConfig) {
        Driver.getDriver().get(ConfigReader.getProperty(urlFromConfig));
    }
    @Then("account buttonuna basar")
    public void account_buttonuna_basar() {
        testOtomasyonPage.accountIcon.click();
    }
    @Then("email olarak {string} girer")
    public void email_olarak_girer(String emailFromConfig) {
        testOtomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty(emailFromConfig));
    }
    @Then("signIn buttonuna basar")
    public void sign_in_buttonuna_basar() {
        testOtomasyonPage.loginButonu.click();
    }
    @Then("basarili giris yapabildigini test eder")
    public void basarili_giris_yapabildigini_test_eder() {
        Assert.assertTrue(testOtomasyonPage.logoutButton.isDisplayed());
    }

    @And("password olarak {string} girer")
    public void passwordOlarakGirer(String passFromConfig) {
        testOtomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty(passFromConfig));
    }

    @Then("basarili giris yapilamadigini test eder")
    public void basarili_giris_yapilamadigini_test_eder() {
        Assert.assertTrue(testOtomasyonPage.loginButonu.isDisplayed());
    }

    @And("password olarak listeden {string} girer")
    public void passwordOlarakListedenGirer(String siradakiEmail) {
        testOtomasyonPage.emailKutusu.sendKeys(siradakiEmail);
    }

    @When("email olarak listeden {string} girer")
    public void emailOlarakListedenGirer(String siradakiPassword) {
        testOtomasyonPage.passwordKutusu.sendKeys(siradakiPassword);
    }


    @Then("urun excelindeki {string} daki urunun min. miktarini ve urun ismini kaydeder")
    public void urun_excelindeki_daki_urunun_min_miktarini_ve_urun_ismini_kaydeder(String istenenSatir) throws IOException {

        String dosyaYolu = "src/test/resources/stok.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sayfa2 = workbook.getSheet("Sayfa2");
         satirdakiUrunIsmi = sayfa2.getRow(Integer.parseInt(istenenSatir)-1).getCell(0).toString();
         satirdakiUrunIsmi = sayfa2.getRow(Integer.parseInt(istenenSatir)-1).getCell(1).toString();
    }
    @Then("urun ismini testotomasyonu sayfasinda aratir ve sonuc sayisini kaydeder")
    public void urun_ismini_testotomasyonu_sayfasinda_aratir_ve_sonuc_sayisini_kaydeder() {

    }
    @Then("bulunan urun sayisinin {string} da verilen min. miktardan fazla oldugunu test eder")
    public void bulunan_urun_sayisinin_da_verilen_min_miktardan_fazla_oldugunu_test_eder(String string) {

    }
}
