package framework.pages;

import org.openqa.selenium.By;

public class HomePage {

    public static final By HOME_PAGE_TITLE = By.xpath("//h2[text()='TEK Insurance App']");
    public static final By CREATE_PRIMARY_ACCOUNT = By.linkText("Create Primary Account");
    public static final By LOGIN_BUTTON = By.linkText("Login");
    public static final By LETS_GET_YOU_STARTED_TEXT = By.xpath("//h2[contains (text(), 'Lets get you started')]");
}
