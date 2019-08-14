//Write a Java program to test the equality of two arrays.

import java.util.Arrays;
import java.util.List;

public class EqualityOfArray {

    public static void main(String[] args) {

//3 arrays with numbers has been defined
        int [] arr1 = {1, 5, 7, 9};
        int [] arr2 = {1, 5, 7, 9};
        int [] arr3 = {1, 2, 7, 9};




        System.out.println("Array 1: " +Arrays.toString(arr1) + " Array 2: " + Arrays.toString(arr2) );//prints array as list
        System.out.println("Is Array 1 equals to Array 2: " + Arrays.equals(arr1,arr2));//checks equality between two arrays
        System.out.println();//For line break
        System.out.println("Array 1: " +Arrays.toString(arr1) + " Array 3: " + Arrays.toString(arr3) );//prints array as list
        System.out.println("Is Array 1 equals to Array 3: " + Arrays.equals(arr1, arr3)); //checks equality between two arrays

    }

}
