
import java.util.Scanner;
/**
 * This program will ask user for a city and then display information about the input. This is part of Lab2 Part2.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 2/11/2025
 */
public class ProgChal12
{
    public static void main(String[] args){
        String city;
        String cityUpper, cityLower;
        char cityFirst;
        int cityChars;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your favorite city: ");
        city = keyboard.nextLine();
        cityChars = city.length();
        cityUpper = city.toUpperCase();
        cityLower = city.toLowerCase();
        cityFirst = city.charAt(0);
        
        System.out.println("Your favorite city has: " + cityChars + " characters");
        System.out.println("In upper case: " + cityUpper);
        System.out.println("In lower case: " + cityLower);
        System.out.println("The first character is: " + cityFirst);
        
        
        
    }
}
