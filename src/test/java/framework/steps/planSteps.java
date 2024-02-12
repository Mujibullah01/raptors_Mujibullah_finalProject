package framework.steps;

import framework.pages.DashboardPage;
import framework.pages.planPage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class planSteps extends SeleniumUtilities {

    @And("Click on Plans Button")
    public void clickOnPlansButton() {
        clickOnElement(planPage.PLANS_BUTTON);
    }

    @When("Validate all four rows")
    public void VerifyThePresenceOfFourRows() {
        List<WebElement> rows = getDriver().findElements(planPage.All_ROWS);
        assertEquals(4, rows.size());
        for (WebElement row : rows) {
            assertTrue(row.isDisplayed());
        }
    }

    @Then("Validate create date is today's date")
    public void validateCreateDate() {

        List<WebElement> elements = getElements(planPage.DATE_CREATED);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = DateTimeUtility.getCurrentDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }
    }
    @Then("Validate expire date is day after")
    public void validateExpireDate() {

        List<WebElement> elements = getElements(planPage.DATE_EXPIRE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = DateTimeUtility.getExpiredDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }

    }


}
