package framework.base;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class BaseSetup {
    private static WebDriver driver;

    public void setupBrowser() {
        Properties configs = readProperties();
        String browserType = configs.getProperty("browser");
        boolean isHeadless = Boolean.parseBoolean(configs.getProperty("browser.isHeadless"));

        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = setupChrome(isHeadless);
                break;
            case "edge":
                driver = setupEdge(isHeadless);
                break;
            default:
                throw new RuntimeException("Wrong browser type, failing test");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = configs.getProperty("insurance.url");
        driver.get(url);
    }

    private WebDriver setupChrome(boolean isHeadless) {
        ChromeOptions options = new ChromeOptions();
        if (isHeadless) options.addArguments("--headless");
        return new ChromeDriver(options);
    }

    private WebDriver setupEdge(boolean isHeadless) {
        EdgeOptions options = new EdgeOptions();
        if (isHeadless) options.addArguments("--headless");
        return new EdgeDriver(options);
    }

    private Properties readProperties() {
        String propertyFilePath = System.getProperty("user.dir") + "/src/test/resources/configs/dev-env.properties";
        Properties properties = new Properties();

        try (FileInputStream inputStream = new FileInputStream(propertyFilePath)) {
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Cannot read property file");
        }

        return properties;
    }

    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
