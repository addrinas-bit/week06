package Week11;


/**
 * Write a description of class FarmApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FarmApp {

    public static void main(String[] args) {

        // Typical small-scale Nepali farm (mixed crops)
        Crop[] crops = new Crop[3];

        crops[0] = new Rice(1.2);   // 1.2 hectares
        crops[1] = new Wheat(0.8);
        crops[2] = new Maize(0.5);

        for (Crop c : crops) {
            c.displayCropInfo();

            if (c instanceof Transportable) {
                Transportable t = (Transportable) c;
                System.out.println("Transport Method: " + t.getTransportMethod());
                System.out.println("Transport Cost: NPR " + t.calculateTransportCost());
            }

            System.out.println("----------------------------------");
        }
    }
}