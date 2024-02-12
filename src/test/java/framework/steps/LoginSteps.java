package framework.steps;

import framework.pages.CreateAccountPage;
import framework.pages.LoginPage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginSteps extends SeleniumUtilities {

    @When("Enter UserName Value {string} and Password value {string}")
    public void loginUserName(String userName , String password){
        sendText(LoginPage.USER_NAME , userName);
        sendText(LoginPage.PASSWORD , password);
    }

    @And("Click on Sign In Button")
    public void clickOnSignInButton(){
        clickOnElement(LoginPage.SIGN_IN);
    }

    @Then("Validate login error message {string}")
    public void displayErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        String actualErrorMessage1 = actualErrorMessage.substring(0,5);
        String actualErrorMessage2= actualErrorMessage.substring(6);
        String actualErrorMessage3 = actualErrorMessage1 + " " + actualErrorMessage2;
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage3);


    }

}
