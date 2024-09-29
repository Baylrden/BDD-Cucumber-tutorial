package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatatablesPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class DataTablesStepdefinitions {

    DatatablesPage datatablesPage = new DatatablesPage();

    Faker faker = new Faker();

    String isim;

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        datatablesPage.newBtn.click();
    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions = new Actions(Driver.getDriver());

        isim = faker.name().firstName();

        actions.sendKeys(isim)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().profession())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("-")
                .sendKeys(Keys.TAB)
                .sendKeys("2024-02-10")
                .sendKeys(Keys.TAB)
                .sendKeys("40000")
                .perform();

        ReusableMethods.bekle(2);



    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

        datatablesPage.createBtn.click();

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {

        datatablesPage.searchBox.sendKeys(isim);

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

        String expectedName = isim;
        String actualName = datatablesPage.nameListElement.getText();

        Assert.assertTrue(actualName.contains(expectedName));

    }

}
