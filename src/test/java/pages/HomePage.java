package pages;

import org.openqa.selenium.By;

/**
 * Created by lukescevans on 22/11/15.
 */
public class HomePage extends BasePage {

    public HomePage() {
    }

    public void goToPage() {
        this.driver.get("http://www.gumtree.com");
    }

    public String getTitle() {
        return this.driver.getTitle().toLowerCase();
    }

    public void enterSearchTerm() {
        this.driver.findElement(By.id("header-search-q")).sendKeys("honda civic");
        System.out.println("wait");
    }


}
