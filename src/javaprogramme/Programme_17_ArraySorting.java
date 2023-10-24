package javaprogramme;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme_17_ArraySorting {
        public static void main(String[] args) {
                int[] n = {5, 2, 9,1,5, 6};
                Arrays.sort(n);
                System.out.println("Sorted Numeric Array:");

                //Sorting a string array
                String[] s = {"apple", "banana", "cherry", "date", "grape"};
                Arrays.sort(s);
                System.out.println("Sorted String Array: " + Arrays.toString(s));
        }



        }

