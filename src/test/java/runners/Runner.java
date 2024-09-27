package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)

public class Runner {
    // Bos bir class-tir.
    // ama kullandigi notasyonlar sayesinde projenin build edilmesini
    // ve feature dosyalarinin toplu olarak calistirilmasini saglar
}
