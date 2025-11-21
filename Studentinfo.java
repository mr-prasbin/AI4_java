import java.util.Scanner;   
/**
 * Write a description of class Studentinfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Studentinfo
{
   public static void main(String[]args)
   {
       Scanner std=new Scanner (System.in);
       System.out.println("Enter student name: ");//input student's name
       String stdName=std.nextLine();//store student's name
       System.out.println("Enter the student's age: ");//input student's age
       int stdAge=std.nextInt();//store student's age
       System.out.println("Enter the student's GPA: ");//input student's gpa
       float stdGpa=std.nextFloat();//store student's gpa
   }
}