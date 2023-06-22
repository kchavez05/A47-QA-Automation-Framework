import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest {

    @Test
    public void RegistrationTest() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        //Open Chrome
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to Koel App
        String url = "https://qa.koel.app/";
        driver.get(url);

        //Find Registration CTA and select
        driver.findElement(By.id("hel"));

        //Verify URL
        Assert.assertEquals(driver.getCurrentUrl(), url);

        driver.quit();
    }

}
