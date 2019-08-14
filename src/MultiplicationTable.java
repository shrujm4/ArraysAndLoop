//Write a program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        int j,n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you need to calculate the table: "); // input parameter
        n= scan.nextInt();


        //formula to form table
        for(j=1; j<=n; j++){

            System.out.println(n+ " X "+ j+ " = " +  n*j);//Result
        }

    }
}
