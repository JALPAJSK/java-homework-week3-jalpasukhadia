package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input sales details
        System.out.print("Enter Sales ID: ");
        int salesId = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter Seller's Name: £");
        String sellerName = sc.nextLine();
        System.out.print("Enter Sales Amount: £");
        double SalesAmount = sc.nextDouble();
        System.out.print("Enter Basic Salary: £");
        double basicSalary = sc.nextDouble();

        //sales commission
        double commission = 0.0;
      //  if (salesAmount >= 50000){
        //    salesCommission = 0.35 * salesAmount;
        }

    }


