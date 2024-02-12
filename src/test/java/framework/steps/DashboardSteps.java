package framework.steps;

import framework.pages.DashboardPage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class DashboardSteps extends SeleniumUtilities {

    @Then("Validate user navigate to Customer Service Portal")
    public void validateCustomerServicePortalIsDisplayed() {
        boolean isCustomerServicePortalIsDisplayed = isElementDisplayed(DashboardPage.CUSTOMER_SERVICE_PORTAL);
        assertTrue("Customer Service Portal text should be displayed ",
                isCustomerServicePortalIsDisplayed);
    }

    }


