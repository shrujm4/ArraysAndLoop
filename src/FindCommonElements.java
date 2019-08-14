
//Write a Java program to find the common elements between two arrays (string
//values)
public class FindCommonElements {

    public static void main(String[] args) {

        //String Arrays for comparison
        String [] array1 = {"Ford", "Honda", "MG", "Range Rover", "Kia", "Mercedes",};
        String [] array2 = {"BMW", "MG", "Mitsubishi", "Farari", "Range Rover", "Honda"};

        for(int i=0; i < array1.length; i++){ //Outer loop

            for(int j =0; j<array2.length; j++){ //Inner loop

                if(array1[i] == array2[j]){ //Comparison between 2 arrays

                    System.out.println("The duplicate value in both array is: " + array1[i]);
                }
            }
        }


    }

}
