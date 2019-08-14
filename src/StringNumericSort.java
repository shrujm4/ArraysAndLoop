
//Write a Java program to sort a numeric array and a string array.
//the program has fixed int and string arrays. no input allowed.

import java.util.Arrays;

public class StringNumericSort { // Class to arrays

    public static void main(String[] args) { // Main method to define formula

        int a[] = {35 , 50, 10, 3, 5, 47, 65}; // Numerical arrays in random order

        String b[] = {"Aberdeen","Stock Port","Tonbridge","wales","London","Manchester","Buxton"};//String arrays in random order

        //formula to print numerical values as per the arrays.
        System.out.println("The Original numerical Array is: " + Arrays.toString(a));

        // function to sort the arrays
        Arrays.sort(a);
//out put for arrays in sorted order - by default it is ascending order
        System.out.println("The sorted numerical Array is: " + Arrays.toString(a));
        System.out.println();
//formula to print string values as per the arrays.
        System.out.println("The original string Array is: " + Arrays.toString(b));
        // function to sort the arrays
        Arrays.sort(b);
//out put for arrays in sorted order - by default it is ascending order
        System.out.println("The sorted string Array is: " + Arrays.toString(b));


    }


}
