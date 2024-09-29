package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks {


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Ekran görüntüsü al
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File src = ts.getScreenshotAs(OutputType.FILE);

            // Proje dizinini al ve target klasörünün altına kaydetmek için path oluştur
            String projectPath = System.getProperty("user.dir"); // Proje ana dizini
            String screenshotName = scenario.getName().replaceAll(" ", "_"); // Dosya adı
            File target = new File(projectPath + "/target/screenshots/" + screenshotName + ".png");

            // Eğer 'screenshots' klasörü yoksa oluştur
            if (!target.getParentFile().exists()) {
                target.getParentFile().mkdirs();
            }

            try {
                // Dosyayı kaydet
                FileUtils.copyFile(src, target);
                System.out.println("Screenshot saved at: " + target.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Driver.quitDriver();
    }
}
