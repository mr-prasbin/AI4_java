import java.util.Scanner;
/**
 * Write a description of class TernaryExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TernaryExample
{
   public static void main(String[]arg)
    {
        Scanner scale=new Scanner(System.in);
        System.out.println("Enter a number janab");
        int firstValue=scale.nextInt();
        System.out.println("Enter next number janab");
        int secondValue=scale.nextInt();
        
            int bigger=(firstValue>secondValue)?firstValue:secondValue;
            System.out.println("The greatest number between two of them is "+bigger);
            
                    
                    
                
    }
}