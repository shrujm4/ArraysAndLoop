
//Write a Java program to reverse an array of integer values.


import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {
//Before reversal of an Array
        int [] a = {12, 22, 45, 56, 78, 99};
        System.out.println("Array before reverse: ");

        for(int i=0; i < a.length; i++){

            System.out.println(a[i] +" ");
        }

//calculations to show how system stores the numbers

        for (int i = 0, j = a.length - 1; i < j; i++, j--)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j]= temp;


        }

//Output for program
        System.out.println("Arrays after reverse: ");

        for(int i=0; i< a.length; i++) {

            System.out.println(a[i] + " , ");
        }

    }
}
