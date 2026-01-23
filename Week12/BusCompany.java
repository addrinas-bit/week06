package Week12;
import java.util.ArrayList;


/**
 * Write a description of class BusCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusCompany
{

    // ArrayList that stores ONLY Bus objects
    private ArrayList<Bus> buses = new ArrayList<>();

    // Method to add new Bus object
    public void addBus(Bus bus) {
        buses.add(bus);
    }

    // Method to remove Bus object by index
    public void removeBus(int index) {
        if (index >= 0 && index < buses.size()) {
            buses.remove(index);
            System.out.println("Bus removed successfully.");
        } else {
            System.out.println("Error: Invalid index!");
        }
    }

    // Method to display all Bus objects
    public void displayAllBuses() {
        for (Bus bus : buses) {
            bus.displayDescription();
        }
    }

    // Method to display Bus objects with rate more than 500
    public void displayBusesWithRateMoreThan500() {
        for (Bus bus : buses) {
            if (bus.rate > 500) {
                bus.displayDescription();
            }
        }
    }

    // Method to display Bus objects whose color is red or blue
    public void displayRedOrBlueBuses() {
        for (Bus bus : buses) {
            if (bus.color.equalsIgnoreCase("red") ||
                bus.color.equalsIgnoreCase("blue")) {
                bus.displayDescription();
            }
        }
    }
}

