package framework.steps;

import framework.pages.DashboardPage;
import framework.pages.accountPage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class accountSteps extends SeleniumUtilities {

    @And("Click on Accounts Button")
    public void clickOnAccountsButton(){
        clickOnElement(accountPage.ACCOUNTS_BUTTON);
    }

    @And("Verify the presence of all 5 rows")
    public void VerifyThePresenceOfAllFiveRows() {
        List<WebElement> rows = getDriver().findElements(accountPage.All_ROWS);
        assertEquals(5, rows.size());
        for (WebElement row : rows) {
            assertTrue(row.isDisplayed());
        }
    }

    @Then("all five rows should be present")
    public void allFiveRowsShouldBePresent() {
        List<WebElement> rows = getDriver().findElements(accountPage.All_ROWS);
        assertEquals("Expected exactly 5 rows", 5, rows.size());
        for (WebElement row : rows) {
            assertTrue("Row is not displayed", row.isDisplayed());
        }
    }

    @Then("Select Show {string} from page per show dropdown")
    public void clickPagerPerShow(String Num) {
        WebElement element= getDriver().findElement(accountPage.PageShow);
        Select select= new Select(element);
        select.selectByVisibleText(Num);
    }

    @Then("Verify the presence of all {string} per page")
    public void verifyThePresenceOfAllPerPage(String visibleRows) {
        int expectedRowCount = Integer.parseInt(visibleRows);
        List<WebElement> rows = getDriver().findElements(accountPage.All_ROWS);
        assertEquals("Unexpected number of rows", expectedRowCount, rows.size());
    }
}
