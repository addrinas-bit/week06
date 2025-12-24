package week06;
import java.util.Scanner;


/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(String[] args){
        int[] num= {10,20,30,40,50};
        int sum= 0;
        int highest= num[0];
        int lowest= num[0];
         for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
            
            if(num[i] > highest)
            {
                highest= num[i];
            
            }
            if(num[i]< lowest){
              lowest= num[i];
            
            }
            
            sum= sum+num[i];
        
          }
          System.out.println(sum);
          System.out.println("highest:"+ highest);
          System.out.println("lowest:"+ lowest);
           
          
          int avg= sum/(num.length);
          System.out.println(avg);
          
          
          Scanner sc = new Scanner(System.in);
          int len= sc.nextInt();

          
          int[] scores= new int[len];
          
         for(int i=0; i< scores.length; i++){
            
            scores[i]= sc.nextInt();
        
         }
         
         for(int i=0; i< scores.length; i++){
             System.out.println(scores[i]);
            
        }
        
         
          
          
          
          
          
          
          
          
          
          
          
          
        
         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}