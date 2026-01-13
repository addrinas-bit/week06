package week10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int id;
    private String name;
    
    
    public Person(int id, String name)
    {
       this.id= id;
       this.name= name;
    }
    
    public void setid(int newID)
    {
        this.id= newID;
    }
    
    public int getid()
    {
        return this.id;
    }
    
    public void setname(String Name)
    {
        this.name= Name;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public double calculateSalary()
    {
        return 0.0;
    }
    
    @Override
    public String toString()
    {
        return "Person Details"+ "Student id:" +this.id+ "Student name:" + this.name;
    }
}