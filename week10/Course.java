package week10;


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private int courseID;
    private String courseName;
    private double baseFee;
    
    public Course(int courseID, String courseName, double baseFee)
    {
        this.courseID= courseID;
        this.courseName= courseName;
        this.baseFee= baseFee;
    }
    
    public void setCourseID(int newID)
    {
        this.courseID= newID;
    }
    
    public int getCouseID()
    {
        return this.courseID;
    }
    
    public void setCourseName(String newName)
    {
        this.courseName= newName;
    }
    
    public String  getCourseName()
    {
        return this.courseName;
    }
    
    public void setBasefee(double Basefee)
    {
        this.baseFee= Basefee;
    }
    
    public double getbaseFee()
    {
        return this.baseFee;
    }

    protected double calculateFee()
    {
        return this.baseFee;
    }
    
    protected double calculateFee(double discountAmount)
    {
        return this.baseFee- discountAmount;
    }
    
    
    public void displayCourseDetails()
    {
        System.out.println("CourseID: "+ getCouseID());
        System.out.println("Course Name:"+ getCourseName());
        
        
        
    }
    
}