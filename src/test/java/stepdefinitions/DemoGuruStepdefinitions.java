package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DemoGuruPage;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuruStepdefinitions {

    DemoGuruPage demoGuruPage = new DemoGuruPage();

    @Given("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {

        List<String> companyIsimleriList = ReusableMethods.stringListeCevir(demoGuruPage.companyElementleriList);

        System.out.println(companyIsimleriList);


    }
    @Given("Listede {int}'den fazla sirket oldugunu test eder")
    public void listede_den_fazla_sirket_oldugunu_test_eder(Integer int1) {

        Assert.assertTrue(demoGuruPage.companyElementleriList.size()>int1);

    }
}
