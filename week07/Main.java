package week07;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        //objects creation
        Students st1= new Students("Addrina",100); //new= create object, students= constructors
        Students st2= new Students("Yashaswi",101);
        
        
        
        System.out.println(st1.getid());
        System.out.println(st1.getname());
        st1.study();
        
        
        
        System.out.println(st2.getid());
        System.out.println(st2.getname());
        st2.laugh();
        
        //invocation of instance method
        Calculatore calc= new Calculatore();
        calc.displayInfo();
        
        calc.add(10,20); //actual parameters
        calc.add(30,40);
        
        
        System.out.println("The fixed number is :"+ calc.getFixedNumber());
        int fixNum= calc.getFixedNumber();
        
        System.out.println("The Fixed number is:"+ fixNum);
        
        int multi= calc.multiply(10,20);
        int multi1= calc.multiply(30,40);
        
        System.out.println(Calculatore.square(10));
    }
}