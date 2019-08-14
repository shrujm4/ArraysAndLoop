
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int fibLength;

        Scanner scan = new Scanner(System.in);//Object creation

        System.out.println("Enter the length: ");
        fibLength = scan.nextInt();

        int[] num = new int[fibLength];

        //initialized first element to 0
        num[0] = 0;
        //initialized second element to 1
        num[1] = 1;

        //New number should be the sum of the last two numbers of the series.

        for (int i = 2; i < fibLength; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
//Print Fibonacci Series
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < fibLength; i++) {
            System.out.print(num[i] + " ");

        }

    }
}