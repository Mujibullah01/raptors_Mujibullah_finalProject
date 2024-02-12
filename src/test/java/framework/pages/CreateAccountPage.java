package framework.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {

    public static final By CREATE_PRIMARY_ACCOUNT_HOLDER = By.xpath("//h2[contains(text(), 'Create Primary Account Holder')]");
    public static final By EMAIL_INPUT = By.id("email");
    public static final By FIRST_NAME_INPUT = By.id("firstName");
    public static final By GENDER_INPUT = By.xpath("//select[@id='gender']");
    public static final By EMPLOYMENT_STATUS = By.id("employmentStatus");
    public static final By TITLE_INPUT = By.xpath("//select[@id='title']");
    public static final By LAST_NAME = By.id("lastName");
    public static final By MARITAL_STATUS = By.xpath("//select[@id='maritalStatus']");
    public static final By DATE_OF_BIRTH = By.id("dateOfBirth");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//button[@type='submit']");
    public static final By EMAIL = By.xpath("//*[contains(text(), '@gmail.com')]");
    public static final By ERROR_MESSAGE = By.xpath("//div[@role='alert']");

}
