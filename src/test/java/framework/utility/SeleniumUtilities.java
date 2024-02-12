package framework.utility;

import framework.base.BaseSetup;
import framework.pages.CreateAccountPage;
import io.cucumber.java.en.And;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    private WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getElementText(By locator) {
        WebElement element = waitForVisibility(locator);
        return element.getText();
    }

    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();
    }

    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendText(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    public boolean isElementDisplayed(By locator) {
        return waitForVisibility(locator).isDisplayed();
    }


    public void SelectFromDropDownByIndex(By Locator ,  int Index){
        WebElement element = getWait().until(ExpectedConditions.visibilityOfElementLocated(Locator));
         Select select = new Select(element);
        select.selectByIndex(Index);
    }
    public List<WebElement> getElements(By locator){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public static class DateTimeUtility {

        public static String getCurrentDate(){
            LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York"))
                    .toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
            return formatter.format(now);
        }
        public static String getExpiredDate(){
            LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York")).plusDays(1)
                    .toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
            return formatter.format(now);
        }
    }

        }