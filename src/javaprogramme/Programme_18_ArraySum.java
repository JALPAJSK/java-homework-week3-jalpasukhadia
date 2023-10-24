package javaprogramme;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18_ArraySum {
    public static void main(String[] args) {

        //Create an array of integers
        int a[]  = {10, 20, 30, 40, 50};

        //Initialize a variable to store the sum
        int sum = Arrays.stream(a).sum();
        System.out.println("The sum of the number is: " + sum);
    }
}
