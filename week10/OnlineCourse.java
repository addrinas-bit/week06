package week10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineCourse extends Course
{
    private double platformFee;
    
    public OnlineCourse(int courseID, String courseName, double baseFee, double platformFee)
    {
        super(courseID, courseName, baseFee);
        this.platformFee= platformFee;
        
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getbaseFee() + this.platformFee;
    }
    
    public void displayCourseDetails()
    {
        super.displayCourseDetails();
        System.out.println("Total Fee for this Online course:"+ this.calculateFee());
    }
}