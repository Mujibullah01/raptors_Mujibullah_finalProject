package framework.pages;

import org.openqa.selenium.By;

public class userProfilePage {

    public static final By PROFILE_BUTTON = By.xpath("//button[@aria-label = 'profile']");
    public static final By STATUS = By.xpath("//span[contains(text(), 'Active')]");
    public static final By USER_TYPE = By.xpath("//p[contains(text(), 'CSR')]");
    public static final By FULL_NAME = By.xpath("//p[contains(text(), 'Supervisor')]");
    public static final By USER_NAME = By.xpath("//p[contains(text(), 'supervisor')]");
    public static final By AUTHORITIES = By.xpath("//LI[contains(text(), 'admin')]");
    public static final By LOGOUT_BUTTON = By.xpath("//button[contains(text(), 'Logout')]");
}
