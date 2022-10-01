package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features ="src/test/resources/features",
        glue="stepDefinitions",
        tags="@a101",
        dryRun = false
)

public class TestRunner {
    /*
    Bir framework de bir tek Runner classi yeterli olabilir
    Runner classinda class bodysinde hic bir sey olmaz
    Runner classimizi onemli yapan 2 adet annotaion vardir
    @RunWith (Cucumber.class) notasyonu Runner classina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework umuzde Junit kullanmayi tercih ediyoruz

    features: Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue: stepDefinitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun=true; yazdigimizda TEstimizi calistirmadan sadece eksik adimlari bize verir
    dryRun=false yazdigimizda testlerimizi calistirir
     */

}