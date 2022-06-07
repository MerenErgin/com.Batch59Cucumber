package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@java",
        dryRun = false
)

public class Runner {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class body'sinde hic bir sey olmaz
    Runner class'imizi onemli yapan iki adet annotaion  vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

    features: Runner dosyasinin feature dosyalarini nerede bulacagini tarif eder
    glue: step definitions dosyalarini nerede bulacagini gosterir
    tags: o an hangi tagi calistirmak istiyorsak onu belli eder

    dryRun: Iki secenek var;
    dryRun=false: testleri calistirir
    dryRun=true: testleri calistirmadan sadece eksik adimlari yazar
     */
}
