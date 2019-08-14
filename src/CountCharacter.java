//WAP to enter any String and count total number of &#39;a&#39; in that String.


import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you would like to count: ");
        String string = scan.next().toLowerCase();
        System.out.println("Enter a character for which you like to count in a string: ");
        char C = scan.next(".").toLowerCase().charAt(0); //This logic is to read only character
        int cn = 0;
for(char ar : string.toCharArray()){

    if(C == ar){

        cn++;
    }
}

        System.out.println(C + "Occurs: " + cn + " time in " + string);


    }
}
