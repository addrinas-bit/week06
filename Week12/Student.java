package Week12;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private String group;
    private long phoneNumber;
    
    public Student(String name, String group, long phoneNumber)
    {
        this.name= name;
        this.group= group;
        this.phoneNumber= phoneNumber;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setGroup(String group)
    {
        this.group=group;
    }
    public String getGroup()
    {
        return this.group;
    }
    
    public void setphoneNumber(long phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public long getphoneNumber()
    {
        return this.phoneNumber;
    }
    
    @Override
    public String toString()
    {
        return "name:"+ this.name+ "group:" + this.group+ "phoneNumber:"+ this.phoneNumber;
    }
}