package javaprogramme;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_AvgOfArray {
    public static void main(String[] args) {
        //Define an array of numbers
        int[] numbers =  {10, 20, 30, 40, 50};

        //Find the average using java streams
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println("The average of the numbers is : "  + average);
    }
}
