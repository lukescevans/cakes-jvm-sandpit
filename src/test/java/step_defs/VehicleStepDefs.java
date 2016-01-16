package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import support.Belly;
import support.MotModel;
import support.VehicleModel;

import static junit.framework.Assert.*;

/**
 * Created by lukescevans on 21/11/15.
 */
public class VehicleStepDefs {
    public VehicleModel vehicleModel;
    public MotModel motModel;

    @Given("^a new vehicle is created$")
    public void a_new_vehicle_is_created() throws Throwable {
        vehicleModel = new VehicleModel();
    }

    @When("^I fill up the tank$")
    public void I_fill_up_the_tank() throws Throwable {
        vehicleModel.setIsFull(true);
    }

    @Then("^the vehicles tank is full$")
    public void the_vehicles_tank_is_full() throws Throwable {

        assertTrue(this.vehicleModel.getIsFull());
    }

    @And("^there is no fuel in the tank$")
    public void there_is_no_fuel_in_the_tank() throws Throwable {

        assertFalse(this.vehicleModel.getIsFull());
    }

    @When("^I accelerate (\\d+)mph$")
    public void I_accelerate_mph(int speed) throws Throwable {
        vehicleModel.setCurrentSpeed(speed);
    }

    @Then("^the vehicles speed is (\\d+)mph$")
    public void the_vehicles_speed_is_mph(int speed) throws Throwable {
        assertEquals(vehicleModel.getCurrentSpeed(), speed);
    }

    @When("^I decelerate (\\d+)mph$")
    public void I_decelerate_mph(int speed) throws Throwable {
        int current = vehicleModel.getCurrentSpeed();

        int newSpeed = current - speed;

        vehicleModel.setCurrentSpeed(newSpeed);
    }
}
