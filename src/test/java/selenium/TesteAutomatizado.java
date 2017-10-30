package selenium;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TesteAutomatizado {
 
    protected static String path;
 
    static {
        path = new File("").getAbsolutePath()+"/src/test/resources";
        System.setProperty("webdriver.chrome.driver", path+"/chromedriver.exe"); // Passo 19.1
    }
 
    public static final WebDriver driver = new ChromeDriver(DesiredCapabilities.chrome());
	
    @Test
    public void callSelenium() {
    	
        // acessa o site do google
        driver.get("http://www.google.com.br/");

        // digita no campo com nome "q" do google
        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");

        // submete o form
        campoDeTexto.submit();

    }
}