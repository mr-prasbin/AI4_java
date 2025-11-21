package Week_3;
import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args)
    {
        Scanner sur = new Scanner(System.in);
        
        System.out.println("Enter your grade: ");
        int grade = sur.nextInt();
        
        String bigger=(grade>40)?"Pass":"Fail";
            System.out.println("The Student of this grade is "+bigger);
                
        
        
        
    }
}