import java.util.Scanner;
/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]args)
    {
        Scanner water=new Scanner (System.in);
        System.out.println("Write the water level brother! ");
        double waterLevel=water.nextDouble();
        String check=(waterLevel>1000)?"WARNING!: Water level has reached 1000L or more":"Status: Normal";
            System.out.println(check);
    }
}