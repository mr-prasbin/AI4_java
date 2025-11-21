package Week_3;
import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args)
    {
        Scanner sir = new Scanner(System.in);
        
        System.out.println("Give me a number boss: ");
        int num_1 = sir.nextInt();
        System.out.println("Give me another number boss: ");
        int num_2 = sir.nextInt();
        boolean isGreater=(num_1>num_2);
        boolean equals=(num_1==num_2);
        boolean isSmaller=(num_1<num_2);
        boolean notEquals=(num_1!=num_2);
        System.out.println(num_1+">"+num_2+":"+isGreater+"\n"+num_1+"="+num_2+":"+equals+"\n"+num_1+"<"+num_2+":"+isSmaller+"\n"+num_1+"!="+num_2+":"+notEquals);
    
    
    }
}