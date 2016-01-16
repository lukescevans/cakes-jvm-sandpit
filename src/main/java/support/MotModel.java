package support;

/**
 * Created by lukescevans on 22/11/15.
 */
public class MotModel {
    private int motNumber;
    private boolean hasMot;

    public MotModel() {
        this.setMotNumber(0);
    }

    public int getMotNumber() {
        return motNumber;
    }

    public void setMotNumber(int motNumber) {
        this.motNumber = motNumber;
    }

    public boolean getHasMot() {
        return hasMot;
    }

    public void setHasMot(boolean hasMot) {
        this.hasMot = hasMot;
    }

    public void failMot() {
        this.hasMot = false;
    }

    public void passMot() {
        this.hasMot = true;
    }
}
