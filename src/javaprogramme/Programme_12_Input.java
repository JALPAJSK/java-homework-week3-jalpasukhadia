package javaprogramme;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input a value
        System.out.println("Enter a value: ");
        char input = sc.next().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("Input is a number");
        }else if (Character.isLetter(input)){
            System.out.println("Input is an alphabet");
        }else{
            System.out.println("Input is a symbol");
        }
        sc.close();
    }
}