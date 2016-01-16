package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Belly;
import support.MotModel;
import support.VehicleModel;

import static junit.framework.Assert.*;

/**
 * Created by lukescevans on 21/11/15.
 */
public class MotStepDefs {
    VehicleStepDefs vehicleStepDefs;

    public MotStepDefs(VehicleStepDefs vehicleStepDefs) {
        this.vehicleStepDefs = vehicleStepDefs;
    }

    @When("^my car passes the MOT$")
    public void my_car_passes_the_MOT() throws Throwable {
        this.vehicleStepDefs.vehicleModel.getMotModel().setMotNumber(12345);
    }

    @Then("^I get an MOT Number$")
    public void I_get_an_MOT_Number() throws Throwable {

        assertNotNull(vehicleStepDefs.vehicleModel.getMotModel().getMotNumber());
    }

    @When("^my car fails the MOT$")
    public void myCarFailsTheMOT() throws Throwable {
        this.vehicleStepDefs.vehicleModel.getMotModel().setMotNumber(0);
    }

    @Then("^I get do not get an MOT Number$")
    public void iGetDoNotGetAnMOTNumber() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(false, vehicleStepDefs.vehicleModel.getMotModel().getHasMot());

    }
}
