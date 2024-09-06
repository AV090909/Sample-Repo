package sampleFramework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.get(prop.getProperty("browser"));

    }
    public void loadProperties() throws IOException {
        FileInputStream file = new FileInputStream("C:/Hybrid/sample_project/src/main/java/sampleFramework/config/ConfigProperties.properties");
        prop= new Properties();
        prop.load(file);
    }
}
