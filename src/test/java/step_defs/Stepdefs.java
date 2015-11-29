package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import support.Belly;

import static junit.framework.Assert.assertTrue;

public class Stepdefs {
    PersonStepdefs p;
    Belly belly;

    public Stepdefs(PersonStepdefs personStepdefs) {
        p = personStepdefs;
    }

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly(cukes);
    }

    @Given("^I should have (\\d+) cukes in my belly$")
    public void I_should_have_cukes_in_my_belly(int cukes) throws Throwable {
        assertTrue(belly.getCukes() == cukes);
    }

    @When("^I eat (\\d+) cukes$")
    public void I_eat_cukes(int cukesEaten) throws Throwable {
        belly.eat(cukesEaten);
    }

}
