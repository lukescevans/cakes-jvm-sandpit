package pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by lukescevans on 25/11/15.
 */
public class Hooks extends BasePage {

    @Before
    public void setup() {
        System.out.println("in BEFORE here");
        //this.driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        System.out.println("IN TEARDOWN");
        if (driver != null) {
            driver.close();
        }
    }
}
