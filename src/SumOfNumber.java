
//WAP to input any five digit number and then find sum of each digit

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
//variable declaration
        int num;
        int rem = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number you like to calculate sum: ");
        num = scan.nextInt();
//calculation to produce sum of entered number
        while(num>0){

            rem = num%10; //devides entered number with 10 and stores remainder in rem
            num = num/10; // number again devided by 10
            sum = sum + rem; // adds each number and produces the sum
        }

        System.out.println("The sum of number entered is: " + sum); //output of sum



    }
}
