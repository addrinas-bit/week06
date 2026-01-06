package week08;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;

    // Constructor 
    ElectricityBill(String consumerName, int unitsConsumed)
    {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Setter
    void setunitsConsumed(int unitsConsumed)
    {
        if (unitsConsumed >= 0) 
        {
            this.unitsConsumed = unitsConsumed;
        }
    }

    // Getter 
    int getunitsConsumed()
    {
        return unitsConsumed;
    }
    
    void setconsumerName(String consumerName)
    {
        this.consumerName= consumerName;
    }
    
    String getconsumerName()
    {
        return consumerName;
    }
    
    // calculate electricity bill
    double calculateBill()
    {
        double billAmount;

        if (unitsConsumed <= 100) 
        {
            billAmount = unitsConsumed * 5;
        } else 
        {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 8);
        }

        return billAmount;
    }
}