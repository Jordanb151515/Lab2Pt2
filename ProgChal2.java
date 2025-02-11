
import java.util.Scanner; //used to scan user input data
/**
 * This program will ask the user for their full name and then display their name and initials. Part of Lab2 Part2.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/11/2025
 */
public class ProgChal2
{
    public static void main(String[] args){
       String firstName, middleName, lastName;
       char firstInit, middleInit, lastInit;
       
       //create scanner object to read use input
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter your first name: ");
       firstName = keyboard.nextLine();
       firstInit = firstName.charAt(0);
       System.out.print("Enter your middle name: ");
       middleName = keyboard.nextLine();
       middleInit = middleName.charAt(0);
       System.out.print("Enter your last name: ");
       lastName = keyboard.nextLine();
       lastInit = lastName.charAt(0);
       
       //print full name
       System.out.println("Your name is: " + firstName + ' ' + middleName + ' '+ 
                          lastName);
       System.out.println("My initials are: " + firstInit +
                          middleInit + lastInit);
    }
    
}
