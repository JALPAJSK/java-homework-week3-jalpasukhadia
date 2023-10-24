package javaprogramme;

import java.util.stream.IntStream;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_ArrayValue{
    public static void main(String[] args) {
        //Define array
        int num[] = {10, 20, 30};

        //value to check for
        int toFind = 50;

        //IntStream foe check the target value
        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind +  "is not found. ");
    }
}





