package framework.pages;

import org.openqa.selenium.By;

public class planPage {
    public static final By PLANS_BUTTON = By.linkText("Plans");
    public static final By All_ROWS= By.xpath("//tbody/tr[@class='css-0']");
    public static final By DATE_CREATED = By.xpath("//table//tr[1]//td[4][@class='css-132p0l1']");
    public static final By DATE_EXPIRE = By.xpath("//table//tr[1]//td[5][@class='css-132p0l1']");
}
