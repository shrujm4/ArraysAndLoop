import java.util.Scanner;

//Write a program in Java to display n limit of natural numbers and their sum.
public class NaturalNumber {

    public static void main(String[] args) {

        int n, i, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = scan.nextInt();
        System.out.println("Entered natural number is " + n);
//calculation to determine n number of natural number
        for(i=1; i<=n; i++){

            System.out.println(i);
            sum += i;

        }
//output and sum
        System.out.println("The Sum of Natural Number upto " + n + " terms : " +sum);
    }
}
