package framework.pages;

import org.openqa.selenium.By;

public class LoginPage {
   public static final By USER_NAME = By.id("username");
   public static final By PASSWORD = By.id("password");
   public static final By SIGN_IN = By.xpath("//button[@type='submit']");
   public static final By ERROR_MESSAGE = By.xpath("//div[@role='alert']");



}
