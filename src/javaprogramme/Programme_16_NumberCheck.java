package javaprogramme;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Programme_16_NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input a number
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        //Check if the number is positive, negative,or zero
        if (number > 0){
            System.out.println("POSITIVE");
        } else if (number< 0) {
            System.out.println("NEGATIVE");
        }else {
            System.out.println("ZERO");
        }
        sc.close();
    }
}