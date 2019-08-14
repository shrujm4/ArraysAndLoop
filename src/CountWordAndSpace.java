import java.util.Scanner;

//WAP to enter any String and count how many total number of words and total
//number of spaces in that sentence
public class CountWordAndSpace {

    public static void main(String[] args) {

        String text;
        int wordCount = 0;
        int space = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence to cound word and space: ");
        text = scan.nextLine();

        //For word & space count

        for(int i=0; i< text.length()-1;i++){

            if(text.charAt(i)==' ' && text.charAt(i+1)!=' '){
                wordCount++;


            }

            if (text.charAt(i) == ' ' && text.charAt(i+1)!= ' ') {

                    space++;


                }

            }
        System.out.print("Total number of words are: " + ( wordCount+1));
        System.out.println();
        System.out.println(" Total number of spaces are: " + space);
        }


    }


