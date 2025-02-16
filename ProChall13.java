
import java.util.Scanner;

/**
 * ProChal13 class does the following: asks user for meal amount then calculates tax, tip, and final amount. Part of Lab2 Part2.
 * 
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/16/2025
 */

public class ProChall13
{  
    public static void main (String[] args){
        //double vars for meal, total, taxAmount, tipAmount
        double mealPrice, taxAmount, tipAmount, mealTotal;
        final double TAX = 0.0675;
        final double TIP = 0.20;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter meal amount: $");
        mealPrice = keyboard.nextDouble();
        taxAmount = mealPrice * TAX;
        tipAmount = (mealPrice + taxAmount) * TIP;
        mealTotal = (mealPrice + taxAmount + tipAmount);
        
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);  
        //// $%,.2f is a place holder for $ then puts a , 
        //// after 3 places (as needed) and rounds to 2 decimal places
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);  
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", mealTotal);
    }
}
