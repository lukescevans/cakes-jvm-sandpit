package step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Person;

import static org.junit.Assert.assertTrue;

public class PersonStepdefs {
    public PersonStepdefs() {

    }

    public Person person;

    @Given("^I am born$")
        public void I_am_born ()throws Throwable {
            this.person = new Person();
        }

    @When("^my parents name me \"([^\"]*)\"$")
    public void my_parents_name_me (String name)throws Throwable {
        person.setName(name);
    }

    @Then("^I am called \"([^\"]*)\"$")
    public void I_am_called(String name) throws Throwable {
        assertTrue(person.getName().startsWith(name));
    }

    @And("^I am (\\d+) years old$")
    public void I_am_years_old(int age) throws Throwable {
        assertTrue(person.getAge() == age);
    }

    @When("^my parents name me \"([^\"]*)\" and I am (\\d+) years old$")
    public void my_parents_name_me_and_I_am_years_old(String name, int age) throws Throwable {
        person = new Person(name, age);
    }
}
