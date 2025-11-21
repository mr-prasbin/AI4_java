import java.util.Scanner;

/**
 * Write a description of class UserInputEg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputEg
{
    public static void main(String[]arg)
    {   
        Scanner scale=new Scanner(System.in);
        System.out.println("Enter a number janab");
        int firstValue=scale.nextInt();
        System.out.println("Enter next number janab");
        int secondValue=scale.nextInt();
        
        int add=firstValue+secondValue;
        System.out.println("The sum of two value is "+add);
        
        
    
    }
}