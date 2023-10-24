package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program which input any number "between" 1 to 7 and it print The Days
   name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input a number between 1 and 7
        System.out.println("Enter a number (1 to 7): ");
        int dayNumber = sc.nextInt();


        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid week number");
               break;
        }
        sc.close();
    }
}