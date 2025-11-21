package Week_3;
import java.util.Scanner;
/**
 * Write a description of class TimeConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeConverter
{
    public static void main(String[] args)
    {   
        Scanner timer=new Scanner(System.in);
        System.out.println("Enter the seconds:");
        int seconds=timer.nextInt();
        int totalSec_hr= 3600;
        int totalSec_min=60;
        
        
        int hours = seconds/totalSec_hr;
        int minutes = seconds/totalSec_min;
        int seconds_1 = seconds % totalSec_hr;
        int secondsRemain = seconds_1 % totalSec_hr;
        
        System.out.println("The breakdown of the seconds provided are: "+"\n"+"Hours:"+hours+"\n"+"Minutes:"+minutes+"\n"+"Seconds:"+secondsRemain);
        
        }
}