package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.apache.poi.ss.formula.eval.ConcatEval;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUniversity;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebuniversityStepdefinitions {

    WebUniversity webUniversity = new WebUniversity();

    @Given("Login portal a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webUniversity.loginPortal);

    }
    @Given("Login portal a tiklar")
    public void login_portal_a_tiklar() {

        webUniversity.loginPortal.click();

    }
    @Then("acilan ikinci window'a gecer")
    public void acilan_ikinci_window_a_gecer() {

        ReusableMethods.titleIleWindowDegistir("WebDriver | Login Portal",Driver.getDriver());

    }
    @Then("username ve password kutularina fake degerler yazdirir")
    public void username_ve_password_kutularina_fake_degerler_yazdirir() {

        Faker faker = new Faker();

        webUniversity.usernameKutusu.sendKeys(faker.name().username());
        webUniversity.passwordKutusu.sendKeys(faker.internet().password());

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {

        webUniversity.loginButonu.click();

    }
    @Then("popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String string) {

       String actualText = Driver.getDriver().switchTo().alert().getText();
       String expectedText = "validation failed";

       Assert.assertEquals(expectedText,actualText);


    }
    @Then("Ok diyerek popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

        Driver.getDriver().switchTo().alert().accept();

    }
    @When("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {

        ReusableMethods.titleIleWindowDegistir("WebDriverUniversity.com",Driver.getDriver());

    }
    @Then("Ilk sayfaya geri dondugunu test eder")
    public void ilk_sayfaya_geri_dondugunu_test_eder() {

        String expectedUrl = ConfigReader.getProperty("webUniUrl");
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

    }

}
