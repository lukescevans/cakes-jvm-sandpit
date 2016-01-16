package support;

import java.util.IllformedLocaleException;

/**
 * Created by lukescevans on 21/11/15.
 */
public class VehicleModel {
    private String make;
    private String model;
    private boolean isFull;
    private int currentSpeed;
    private boolean isBroken;
    private MotModel motModel;

    public VehicleModel() {
        this.isFull = false;
        this.currentSpeed = 0;
        this.isBroken = false;
        this.motModel = new MotModel();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) throws Exception {
        if (currentSpeed < 0) throw new Exception("Current speed can't be less than 0 mph nugget");
        this.currentSpeed = currentSpeed;
    }

    public int changeCurrentSpeed(int speed) {
        int calculatedSpeed = this.currentSpeed += speed;

        if (calculatedSpeed >= 0) {
            this.currentSpeed += speed;
        }
        else
        {
            this.currentSpeed = 0;
        }

        return this.currentSpeed;
    }

    public void accelerate(int mph) {
        this.currentSpeed = + mph;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public MotModel getMotModel() {
        return motModel;
    }

    public void setMotModel(MotModel motModel) {
        this.motModel = motModel;
    }


}
