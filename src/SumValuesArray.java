//Write a Java program to sum values of an array.
//User can enter any number to get value added up to the lenght
import java.util.Scanner;

public class SumValuesArray {

    public static void main(String[] args) {
//variable declaration
        int num;
        int sum = 0;
        int rem = 0;
//User input object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number for which you require Sum: ");

        num = scan.nextInt();
//Using while loop user can find sum for entered digit
         while(num>0){ //if number is greater than 0 then system follows below calcukations

             //using modulus finds remainder of the numbeer
             rem = num% 10;
             //sum of remainder and sum
             sum = sum + rem;
             //new num value divided by 10 which gives total sum after look ends
             num = num /10;


         }
        System.out.println("The sum of number is: " + sum);


        System.out.println();
        System.out.println("Second Method to print sum of entered number");
        System.out.println();
        System.out.println();
        System.out.println();

        int a[] = new int [num];
        int i;
        for(i=0; i<num; i++) {

            a[i] = scan.nextInt();

            sum = sum + a[i];

        }
            System.out.println("The sum of entered number" + " :: " + sum);


    }



}
