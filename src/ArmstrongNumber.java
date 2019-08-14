//WAP to input any number and check if it is Armstrong number or not

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int c = 0, a, temp;  //Declaration of variables
        int n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check if its Armstrong number or not: ");
        n = scan.nextInt(); //input parameters
//Calculations
        temp = n;
        while (n > 0) {

            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            System.out.println(" Entered number " + temp + " is Armstrong number ");
        } else {
            System.out.println("Enter number " + temp + " is not Armstrong number ");
        }

    }// Output as required
}