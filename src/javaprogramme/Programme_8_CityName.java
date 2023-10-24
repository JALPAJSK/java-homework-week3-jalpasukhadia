package javaprogramme;

import java.util.Scanner;

/**
 * Input any alphabet from "A" to “F” and print their city name accordingly (use if else) is
  any other alphabet should be invalid entry
 */

public class Programme_8_CityName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Input an alphabet
        System.out.println("Enter an alphabet (A to F): ");
        char alphabet = sc.next().charAt(0);

        // Check and print city name
        if (alphabet == 'A'){
            System.out.println("City: Ahmedabad");
        }else if (alphabet == 'B'){
            System.out.println("City: Berlin");
        } else if (alphabet == 'C') {
            System.out.println("City: cairo");
        } else if (alphabet == 'd'){
            System.out.println("City: Delhi");
        } else if (alphabet == 'e') {
            System.out.println("City: Edinburgh");
        } else if (alphabet == 'f') {
            System.out.println("City: Florence");
        }else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    sc.close();
    }
}

