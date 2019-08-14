//WAP to input any five digit number and then reverse the number

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {

        int n, reverse = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you like to reverse: ");

        n = scan.nextInt();

        while (n!=0){ //While loop to reverse the digits entered

            reverse = reverse* 10;
            reverse = reverse + n%10;
            n=n/10;
        }
        System.out.println("Reverse order is: " + reverse); //Reverse output prints

    }
}
