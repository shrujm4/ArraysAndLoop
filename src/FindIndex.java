
//Write a Java program to find the index of an array element.

import java.util.Scanner;

public class FindIndex{

        public static int Index(int a[], int input){

            //formula to determine return type
        if(a == null) return -1;

        int len = a.length;
        int i =0;

        //use of while loop to run the array
        while(i<len){

            if(a[i] == input) return i;
            else i=i+1;
                    }
return -1;


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number you like to find position from the list: 3, 56, 2, 67, 45, 26, 78, 99, 89, 60, 33, 27" +" :");
        int input = scan.nextInt();
        int a[] = {3, 56, 2, 67, 45, 26, 78, 99, 89, 60, 33, 27}; //Array list

        System.out.println("The Index of the number " + input+ " is :" + Index(a, input)); //output to check the index position

    }



}
