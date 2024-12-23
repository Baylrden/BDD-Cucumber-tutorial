package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationStepdefinitions {

    AutomationPage automationPage = new AutomationPage();

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {

        automationPage.signUpLinkElement.click();

    }
    @Given("user Create an account bolumune email adresi girer")
    public void user_create_an_account_bolumune_email_adresi_girer() {

        automationPage.nameBox.sendKeys("John");
        automationPage.emailBox.sendKeys("email@gmail.com");

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {

        automationPage.signUpButton.click();

    }
    @Given("user kisisel bilgileriniv e iletisim bilgilerini girer")
    public void user_kisisel_bilgileriniv_e_iletisim_bilgilerini_girer() {

        Actions actions = new Actions(Driver.getDriver());

        actions.click(automationPage.mrRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("183644")
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("April")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Ali")
                .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(10);

        actions .click(automationPage.formSoyisimKutusu)
                .sendKeys("Kaygisiz")
                .sendKeys(Keys.TAB)
                .sendKeys("Yildiz holding")
                .sendKeys(Keys.TAB)
                .sendKeys("star street")
                .sendKeys(Keys.TAB)
                .sendKeys("yildiz mah")
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("75001")
                .sendKeys(Keys.TAB)
                .sendKeys("+1123124543").perform();

        ReusableMethods.bekle(10);

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        automationPage.createAccBtn.click();

    }
    @Then("hesap olustugunu test eder")
    public void hesap_olustugunu_test_eder() {
        Assert.assertTrue(automationPage.accountCreatedYazisi.isDisplayed());
    }
}
