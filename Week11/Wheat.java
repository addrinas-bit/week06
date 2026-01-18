package Week11;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 2800;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 600000;
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 2.0;
    }

    @Override
    public String getTransportMethod() {
        return "Pickup Van (Rural highways)";
    }
}