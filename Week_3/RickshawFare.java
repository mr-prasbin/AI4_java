package Week_3;

import java.util.Scanner;
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
     public static void main(String[] args)
    {   
        Scanner console=new Scanner(System.in);
        System.out.println("Enter the kilometer:");
        int km=console.nextInt();
        System.out.println("Enter the time:");
        int seconds=console.nextInt();
        
        System.out.println("Are you a local or travller:");
        String ans=console.nextLine();
        
        }   
}