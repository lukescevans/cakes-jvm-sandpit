package support;

public class Belly {
    private int cukes;

    public Belly(int cukes) {
        this.cukes = cukes;
    }

    public void eat(int cukes) {
        this.cukes += cukes;
    }

    public int getCukes() {
        return cukes;
    }
}
