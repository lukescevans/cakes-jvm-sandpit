package step_defs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

/**
 * Created by lukescevans on 21/11/15.
 */
public class BaseStepDefs {
    public static WebDriver driver;
    public static final String HOME= "http://www.bbc.co.uk/";
}
