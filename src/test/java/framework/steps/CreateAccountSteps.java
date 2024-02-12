package framework.steps;

import framework.pages.CreateAccountPage;
import framework.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class CreateAccountSteps extends SeleniumUtilities {

    @Then("Validate Create Primary Account Holder is exist")
    public void validateCreatePrimaryAccountHolderIsDisplayed() {
        boolean isCreatePrimaryAccountHolderButtonDisplayed = isElementDisplayed(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER);
        Assert.assertTrue("Create Primary Account Holder text should be displayed " ,
                isCreatePrimaryAccountHolderButtonDisplayed );
    }

    @And("Select Gender {string}")
    public void SelectGender(String Gender){
        SelectFromDropDownByIndex(CreateAccountPage.GENDER_INPUT , 1);
    }

    @And("Select Title {string}")
    public void SelectTitle(String Title){
        SelectFromDropDownByIndex(CreateAccountPage.TITLE_INPUT , 1);
    }

    @And("Select Marital Status {string}")
    public void SelectMaritalStatus(String MaritalStatus) {
        SelectFromDropDownByIndex(CreateAccountPage.MARITAL_STATUS , 2);
    }

    @When("Fill Create Account form {string} {string} {string} {string} {string}")
    public void fillUpCreateAccountForm(String email, String FirstName, String EmploymentStatus , String lastName ,String DateOfBirth ) {
        String emailAddress;
        if (email.contains("random")) {
            String[] splitEmail = email.split("@");
            int randomNumber = (int) (Math.random() * 1000);
            emailAddress = splitEmail[0] + randomNumber + "@" + splitEmail[1];
        } else {
            emailAddress = email;
        }
        sendText(CreateAccountPage.EMAIL_INPUT, emailAddress);
        sendText(CreateAccountPage.FIRST_NAME_INPUT, FirstName);
        sendText(CreateAccountPage.EMPLOYMENT_STATUS, EmploymentStatus);
        sendText(CreateAccountPage.LAST_NAME, lastName);
        sendText(CreateAccountPage.DATE_OF_BIRTH, DateOfBirth);
    }

    @And("Click on Create Account Button")
    public void clickOnCreateAccountButton(){
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @Then("Validate {string} on Sign up Page shows as expected")
    public void validateEmailOnSignUpPage(String email){
        boolean isEmailEnabled =  isElementEnabled(CreateAccountPage.EMAIL);
        Assert.assertTrue(email, isEmailEnabled );

    }

    @Then("Validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualErrorMessageBeforeStringManipulation = getElementText(CreateAccountPage.ERROR_MESSAGE);
        String SubstringActualErrorMessageFirstPart = actualErrorMessageBeforeStringManipulation.substring(0,5);
        String SubstringActualErrorMessageSecondPart = actualErrorMessageBeforeStringManipulation.substring(6);
        String actualErrorMessage = SubstringActualErrorMessageFirstPart +" "+ SubstringActualErrorMessageSecondPart;

        Assert.assertEquals("Validate error message",expectedErrorMessage,actualErrorMessage);
    }





}






