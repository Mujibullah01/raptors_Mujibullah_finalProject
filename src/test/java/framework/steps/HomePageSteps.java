package framework.steps;

import framework.pages.DashboardPage;
import framework.pages.HomePage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePageSteps extends SeleniumUtilities {

    @Given("Validate Home page title Tek insurance UI is exist")
    public void validateHomePageTitle() {
        String actualTitle = getElementText(HomePage.HOME_PAGE_TITLE);
        Assert.assertEquals("TEK Insurance App", actualTitle);
    }

    @Then("Validate create Primary Account Button is exist")
    public void validateHomeCreatePrimaryAccount() {
        String actualTitle = getElementText(HomePage.CREATE_PRIMARY_ACCOUNT);
        Assert.assertEquals("Create Primary Account", actualTitle);
    }

    @Given("Click on Create Primary Account Button")
    public void clickOnCreatePrimaryAccount() {
        clickOnElement(HomePage.CREATE_PRIMARY_ACCOUNT);
    }

    @Given("Click on Login Button")
    public void clickOnLogin() {
        clickOnElement(HomePage.LOGIN_BUTTON);
    }

    @Then("Validate Lets get you started text on Home Page")
    public void validateLetsGetYouStartedText() {
        boolean isLetsGetYouStartedTextDisplayed = isElementDisplayed(HomePage.LETS_GET_YOU_STARTED_TEXT);
        Assert.assertTrue("Lets get you started text should be displayed ",
                isLetsGetYouStartedTextDisplayed);
    }

    }

