package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inout a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        //Check if the number is even or odd
        if (number % 2 == 0){
            System.out.println(number + " is an even number. ");
        }else{
            System.out.println(number + " is an odd number. ");
        }
        sc.close();
    }
}
