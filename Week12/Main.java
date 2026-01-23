package Week12;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
    public static void main(String[] args) {

        BusCompany company = new BusCompany();

        Bus b1 = new Bus("BA-1234", "Red", "Kathmandu–Pokhara", "Ram", true, 600);
        Bus b2 = new Bus("BA-5678", "Green", "Kathmandu–Chitwan", "Sita", false, 450);
        Bus b3 = new Bus("BA-9999", "Blue", "Pokhara–Butwal", "Hari", true, 700);

        company.addBus(b1);
        company.addBus(b2);
        company.addBus(b3);

        System.out.println("All Buses:");
        company.displayAllBuses();

        System.out.println("Buses with rate > 500:");
        company.displayBusesWithRateMoreThan500();

        System.out.println("Red or Blue Buses:");
        company.displayRedOrBlueBuses();

        company.removeBus(5); // Invalid index example
    }
}

