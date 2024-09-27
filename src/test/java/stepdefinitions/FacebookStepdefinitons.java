package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.Driver;

public class FacebookStepdefinitons {

    FacebookPage facebookPage = new FacebookPage();

    @Given("facebook'da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {
        facebookPage.signUpButton.click();
    }
    @When("Faker class'indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {

        Faker faker = new Faker();
        String fakeMail = faker.internet().emailAddress();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeMail)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("2003")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .perform();
    }
    @Then("facebook kayit ol butonuna basar")
    public void facebook_kayit_ol_butonuna_basar() {
        facebookPage.formSubmitButton.click();
    }
}
