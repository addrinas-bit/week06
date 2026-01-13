package week10;


/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students
{
    private int rollNo;
private String name;
private double marks;

// Constructor
public Students(int rollNo, String name, double marks) {
this.rollNo = rollNo;
this.name = name;
this.marks = marks;
}

// Getters and Setters
public int getRollNo() {
return rollNo;
}

public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getMarks() {
return marks;
}

public void setMarks(double marks) {
this.marks = marks;
}

// Method to be overridden
public String calculateResult() {
return marks >= 40 ? "Pass" : "Fail";
}

// toString()
@Override
public String toString() {
return "Roll No: " + rollNo +
", Name: " + name +
", Marks: " + marks;
}
}