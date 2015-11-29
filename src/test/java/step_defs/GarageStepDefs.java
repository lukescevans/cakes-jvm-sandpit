package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.VehicleModel;

import static junit.framework.Assert.assertTrue;

/**
 * Created by lukescevans on 21/11/15.
 */
public class GarageStepDefs {
    public VehicleModel vehicleModel;
    public GarageStepDefs(VehicleStepDefs vehicleStepDefs) {
        this.vehicleModel = vehicleStepDefs.vehicleModel;
    }

    @When("^the engine warning light comes on$")
    public void the_engine_warning_light_comes_on() throws Throwable {
        this.vehicleModel.setIsBroken(true);
    }

    @Then("^the vehicle is broken down$")
    public void the_vehicle_is_broken_down() throws Throwable {
        assertTrue(vehicleModel.getIsBroken());
        this.vehicleModel.setCurrentSpeed(0);
    }
}
