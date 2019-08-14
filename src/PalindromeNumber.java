//WAP to input any number and check if it is Palindrome or not

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num;
        int reversedInteger = 0;
        int remainder;
        int originalInteger;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you like to check for Palindrome number: ");
        num = scan.nextInt();

        originalInteger = num;

        //reversed number is stored in variable

        while (num !=0){

            remainder = num % 10;
            reversedInteger = reversedInteger*10 + remainder;
            num /= 10;
                    }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");


    }
}
