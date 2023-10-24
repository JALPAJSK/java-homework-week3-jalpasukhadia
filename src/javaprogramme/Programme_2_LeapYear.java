package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        //Closing the scanner object
        sc.close();

        //check if it's a leap year
        boolean isLeapYear = false;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeapYear = true;
        }

        //Display the result
        if(isLeapYear){
            System.out.println(year + " is a leap year. ");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}