package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;
 
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.Fluent;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class IndexIntegrationTest extends FluentTest {
    private static final String URL_PAGE = "http://localhost:8080/selenium";
    private static final long TIME_WAIT = 10;
 
    protected static String path;
 
    static {
        path = new File("").getAbsolutePath()+"/src/test/resources";
        System.setProperty("webdriver.chrome.driver", path+"/chromedriver.exe"); // Passo 19.1
    }
 
    public static final WebDriver driver = new ChromeDriver(DesiredCapabilities.chrome());
 
    @Override
    public WebDriver getDefaultDriver() {
        return driver;
    }
 
    @Test
    public void deveTestarOIndex() {
        goTo(URL_PAGE); // Passo 19.2
        isPresent("#name"); // Passo 19.3
        fill("#name").with("Fabio Henrique Gonzales Barbosa"); // Passo 19.4
        click("#button"); // Passo 19.5
        getDefaultDriver().switchTo().alert().accept(); // Passo 19.6
    }
 
    private Fluent isPresent(String seletor){
         return await().atMost(TIME_WAIT, TimeUnit.SECONDS).until(seletor).isPresent();
    }
 
}