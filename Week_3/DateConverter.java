package Week_3;

import java.util.Scanner;
/**
 * Write a description of class DateConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DateConverter
{
    public static void main(String[] args)
    {   
        Scanner date=new Scanner(System.in);
        System.out.println("Enter the days:");
        int days=date.nextInt();
        
        
        
        int years = days/365;
        int months = days/30;
        int days_1 = days % 365;
        int daysTotal = days_1 % 365;
        
        System.out.println("The breakdown of the days provided are: "+"\n"+"Years:"+years+"\n"+"Months:"+months+"\n"+"Days:"+daysTotal);
        
        }
}