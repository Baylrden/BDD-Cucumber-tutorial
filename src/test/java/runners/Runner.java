package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/rapor.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@rapor",
        dryRun = false
)
public class Runner {
    // Bos bir class-tir.
    // ama kullandigi notasyonlar sayesinde projenin build edilmesini
    // ve feature dosyalarinin toplu olarak calistirilmasini saglar
    // command for run: mvn clean verify
}