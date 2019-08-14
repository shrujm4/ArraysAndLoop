
//Write a Java program to test if an array contains a specific value.

//To check if array contains specific value we are going to use toCheckValue command

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class SpecificValue {


    public static void main(String[] args) {

        int a[] = {1, 4, 5, 7, 3, 9, 15}; //Array

        int num = 4;



//calculations
        boolean found = false;

        for (int n : a) {

            if (n == num) {

                found = true;
                break;
            }

        }

        if (found) {
//result to print list of array and number given
           String list = Arrays.toString(a);

            System.out.print("The number: " + num + " contains in the list: " + list);}
else{
                out.println("The number: " + num + "does not contain in an Array");
            }




    }

       }
