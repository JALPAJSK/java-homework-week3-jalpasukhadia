package javaprogramme;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class Programme_9_CityNameSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input an alphabet
        System.out.println("Enter an alphabet (A to F): ");
        char alphabet = sc.next().charAt(0);

        // Use a switch statement to determine and print the city name
        switch (alphabet) {
            case 'A':
                System.out.println("City: Amsterdam");
                break;
            case 'B':
                System.out.println("City: Berlin");
                break;
            case 'C':
                System.out.println("City: Cairo");
                break;
            case 'D':
                System.out.println("City: Dorset");
                break;
            case 'E':
                System.out.println("City: Edinburgh");
                break;
            case 'F':
                System.out.println("City: Florence");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    }

}


