package framework.steps;

import framework.pages.userProfilePage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class userProfileSteps extends SeleniumUtilities {

    @And("Click on profile button on top right corner")
    public void clickOnProfileButton() {
        clickOnElement(userProfilePage.PROFILE_BUTTON);
    }

    @Then("Validate STATUS {string} USER TYPE {string} FULL NAME {string} USER NAME {string} AUTHORITIES {string}")
    public void validateFormData(String status, String userType, String fullName, String userName, String authorities) {
        String actualStatus = getElementText(userProfilePage.STATUS);
        String actualUserType = getElementText(userProfilePage.USER_TYPE);
        String actualFullName = getElementText(userProfilePage.FULL_NAME);
        String actualUserName = getElementText(userProfilePage.USER_NAME);
        String actualAuthorities = getElementText(userProfilePage.AUTHORITIES);

        Assert.assertEquals(status,actualStatus);
        Assert.assertEquals(userType,actualUserType);
        Assert.assertEquals(fullName,actualFullName);
        Assert.assertEquals(userName,actualUserName);
        Assert.assertEquals(authorities,actualAuthorities);

    }

    @When("click on Logout Button")
    public void clickOnLogoutButton() {
        clickOnElement(userProfilePage.LOGOUT_BUTTON);

    }
}
