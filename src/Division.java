//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5
//separately

import java.util.Arrays;

public class Division {

    public static void division1(){ //sub methods

        int i=1;
//calculations
        while(i<=100){
            i++;

            if(i%3==0){

                System.out.println(i);}}}


    public static void division2 (){
               int i=1;
//Calculations
                while(i<=100){
                    i++;

                    if(i%5==0){

                        System.out.println(i);}
            }}

    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3: ");
        Division.division1();
        System.out.println("Numbers divisible by 5: ");
        Division.division2();


                }

//*object creation in main method in order to execute them */





}
