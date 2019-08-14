//Write a Java program to find the duplicate values of an array of integer values.

public class FindDuplicateValue {

    public static void main(String[] args) {

        int arr[] = {1, 4, 6, 7, 9, 56, 4, 7}; //Array list
//formula to find duplicate value
        for(int i =0; i<arr.length-1; i++){ //system checks if array contains different value or same

            for(int j = i+1; j<arr.length; j++){ //This loop to find matching values

                if((arr[i] == arr[j]) && (i!=j)){

                    System.out.println("Duplicate element is: " + arr[j]); // Printing the duplicate values
                }
            }
        }


    }


}
