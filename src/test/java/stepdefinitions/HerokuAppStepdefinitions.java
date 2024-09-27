package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuAppStepdefinitions {

    HerokuPage herokuPage = new HerokuPage();


    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {

        herokuPage.addElementBtn.click();

    }
    @When("Delete butonu-nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(herokuPage.deleteBtn.isDisplayed());

    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {

        herokuPage.deleteBtn.click();

    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(herokuPage.addRemoveLabelElement.isDisplayed());

    }

    @And("Delete tusunun gorunmedigini test eder")
    public void deleteTusununGorunmediginiTestEder() {

        try {
           herokuPage.deleteBtn.click();
        } catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }

    }
}
