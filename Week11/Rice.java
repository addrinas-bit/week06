package Week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable {

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 3500; // kg per hectare
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 1200000; // high water usage
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 2.5; // NPR per kg
    }

    @Override
    public String getTransportMethod() {
        return "Tractor / Mini Truck (Terai rural roads)";
    }
}


