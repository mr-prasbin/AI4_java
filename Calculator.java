import java.util.Scanner;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner calc=new Scanner (System.in);
        System.out.println("Enter two numbers in my calculator: ");
        float calc_1=calc.nextFloat();
        float calc_2=calc.nextFloat();
        float calAdd=calc_1+calc_2;
        float calSub=calc_1-calc_2;
        float calMult=calc_1*calc_2;
        float calDiv=calc_1/calc_2;
        float calMod=calc_1%calc_2;
        System.out.println("Addition: "+calAdd);
        System.out.println("Subtraction: "+calSub);
        System.out.println("Multiplication: "+calMult);
        System.out.println("Division: "+calDiv);
        System.out.println("Modulus: "+calMod);
        float bigger=(calc_1>calc_2)?calc_1:calc_2;
            System.out.println("The greatest number between two of them is "+bigger);
    }
}