package pages;

//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import step_defs.BaseStepDefs;

import static junit.framework.Assert.assertTrue;

/**
 * Created by lukescevans on 22/11/15.
 */
public class BasePage {
    public WebDriver driver;

    public BasePage() {
        this.driver = new FirefoxDriver();
        this.driver.get("http://www.google.com/");
    }

    public void assertPageTitle(String needle) {
        assertTrue(this.driver.getTitle().toLowerCase().contains(needle.toLowerCase()));
    }

    public void goTo() {
        this.driver.get("http://www.gumtree.com");
    }
}
