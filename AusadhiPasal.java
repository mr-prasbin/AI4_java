import java.util.Scanner;
/**
 * Write a description of class AusadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AusadhiPasal
{
    public static void main(String[]args)
    {   //System used by the wholesaler to the pharmacist
        Scanner ausadhi=new Scanner (System.in);
        System.out.println("Enter the name of medicine you need(one at a time)");
        String medName=ausadhi.nextLine();
        System.out.println("Enter the quantity of medicine you need(one at a time)");
        int medQuantity=ausadhi.nextInt();
        System.out.println("The price of your medicine per tablet is: NPR.25.07");
        System.out.println("\n");
        
        //System used by the pharmacist to the customers
        Scanner pasal=new Scanner(System.in);
        System.out.println("Enter the name of medicine you need(one at a time)");
        String medCustomer=pasal.nextLine();
        System.out.println("Enter the quantity of medicine you need(one at a time)");
        int medCustomer_12=pasal.nextInt();
        System.out.println("The price of your medicine per tablet is: NPR.30");
        float total=medCustomer_12*(30);
        System.out.println("Your total will be: "+total);
        int remainStock=medQuantity-medCustomer_12;
        System.out.println("You have remaining stocks: "+remainStock);
        
        //Remaining
        
    }
}