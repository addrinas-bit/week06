package week07;


/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students
{
    //attributes
    
    //instance variable
    private String name;
    private int id;
    //constructor
    public Students(String name, int id)
    {
        this.name= name;
        this.id= id;
    }
    
    //behaviour or methods
    void study()
    {
        System.out.println(name + "is studying.");
    }
    void laugh()
    {
        System.out.println(name + "is laughing.");
    }
    //setter and getter
    public void setname(String name)
    {
        this.name= name;
    }
    public String getname()
    {
      return this.name;
    }
    public void setid(int id)
    {
        this.id= id;
    }
    public int getid()
    {
      return this.id=id;
    }
    
        
    }
