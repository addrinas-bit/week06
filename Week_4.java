import java.util.Scanner;

/**
 * Write a description of class Week_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week_4
{
    public static void main(String[] args){
    //Q-1
    int num=20;
    if(num > 40) 
    {
     System.out.println("Students is passed");
    }
    else
     {
         System.out.println("Students is failed");
    }
    //Q-2
    int n =3;
    if(n %2==0)
    {
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
     }
    //Q-3
    int numb= 23;
    if(numb> 0) {
        System.out.println("Number is positive");
    }
        else if(numb<0){
            System.out.println("Number is negative");
        }
            else {
                System.out.println("Number is zero");
            }
    //Qby-4
    int no= 15;
    if(no% 5==0)
    {
        if(no% 5==0)
        {
            System.out.println("Divisible by both");
        }
        else
        {
            System.out.println("Divisible by 3");
        }
    }
    else
    {
        if(no %5==0)
        {
            System.out.println("Only divisible by 5");
        }
        else
        {
            System.out.println("Not divisible by both");
        }
    }
     //Q-5
     int number= 35;
     if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println( "divisible by BOTH 3 and 5.");
            } else {
                System.out.println( " divisible by 3 but NOT by 5.");
            }
        } else {
            System.out.println( " NOT divisible by 3 and 5 together.");
        }
    //Q-6
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter marked price: ");
     float mp= scan.nextFloat();
     
     System.out.println("Enter a category(A/B/C/D): ");
     char category = scan.next().charAt(0);
     
     float discount =0;
     if(category =='A')
     {
         discount = 60;
     }
     else if(category == 'B')
     {  
         discount = 40;
     }
     else if(category == 'C')
     {
        discount = 20;
     }
     else if(category == 'D') {
         discount = 10;
     }
     else
     {
      System.out.println("Enter a category, please choose from (A/B/C/D");
    } 
     float sp= mp-(mp*discount)/100;
     
     System.out.println(" Discount percentage: " + discount +"%");
     System.out.println("Final selling price= " + sp);
      //Q-7
       System.out.println("Enter marked price: ");
      float markp = scan.nextFloat() ;
      System.out.println("Choose a category (A/B/C/D): ") ;
      char categ = scan.next(). charAt (0) ;
      double dis = 0;
      float sellp =0;
      switch (category) {
      case 'A':
      sp = mp- (mp*60) /100;
      break;
      case 'B':
      sp = mp-(mp*40) / 100;
      break;
      case 'C':
      sp = mp-(mp*20) / 100;
      break;
      case 'D' :
      sp = mp- (mp*10) /100;
      break;
       
      default:
          System.out.println("Please choose a category from(A/B/C/D)");
    }
    System.out.println("Final amount: " + sp);
     
    
      //Q-8
      System.out.println("Enter GPA: ");
      double gpa = scan.nextDouble () ;
      
      if(gpa<1.2)
      {
          System.out.println("Fail");
      }
      else if (gpa>= 1.2 && gpa <2)
      {
        System. out.println("D grade");
      }
      else if (gpa>=2 && gpa<2.2)
      {
          System.out.println("C grade");
      }
      else if (gpa >=2.2 && gpa <3)
      {
          System.out.println("B grade");
      }
      else if (gpa >=3 && gpa <4)
      {
          System.out.println("A grade");
      }
      else if (gpa == 4)
      { 
          System.out.println("A+ grade");
      }
      else
      {
          System.out.println("Invalid");
      }
      //Q-9 
      System.out.println("Enter GPA: ");
      double GPA= scan.nextDouble();
      
      System.out.println("Enter attendence(inpercentage)");
      int attend = scan.nextInt();
      
      System.out.println("Enter attitude score:");
      int attitude = scan.nextInt();
      
      if(gpa>=3.2)
      {
          if(attend>80)
          {
              if(attitude < 5)
              {
                  System.out.println("Is Eligible");
              }
          }
     }
     else
     {
         System.out.println("Not Eligible");
     }
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     } 
    
       
      
      
    
        
        
      
          
          
    
    
    
    
    
    
    
    
    
    
    
     
     
    
     
    
    
    

    
        
       
         
         
         
         
         
         
        
    

    
    
    
     








