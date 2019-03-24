package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUI extends MainPageObject {

    private static final String
            MY_LISTS_LINK = "org.wikipedia:id/fragment_main_nav_tab_layout";

    public NavigationUI(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists()
    {
        this.waitForElementAndClick(
                By.id(MY_LISTS_LINK),
                "Cannot find navigation button to My lists",
                5
        );
    }
}
