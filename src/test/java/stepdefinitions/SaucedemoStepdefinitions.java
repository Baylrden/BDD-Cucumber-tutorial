package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SauceDemoPage;

public class SaucedemoStepdefinitions {

    SauceDemoPage sauceDemoPage = new SauceDemoPage();

    String ilkUrunIsmi;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String string) {

        sauceDemoPage.usernameBox.sendKeys(string);
    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String string) {

        sauceDemoPage.passwordBox.sendKeys(string);

    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        sauceDemoPage.loginButton.click();

    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {

        ilkUrunIsmi=  sauceDemoPage.ilkUrunText.getText();

        sauceDemoPage.ilkUrunText.click();

    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

        sauceDemoPage.addToCartButton.click();

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {

        sauceDemoPage.shoppingCartLink.click();

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

        Assert.assertEquals(ilkUrunIsmi,sauceDemoPage.sepettekiIsim.getText());

    }
}
