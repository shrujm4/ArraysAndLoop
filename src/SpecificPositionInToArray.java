import java.util.Scanner;

public class SpecificPositionInToArray {

    public static void main(String[] args) {

        int len, p, ele;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of an Array: ");
        len = scan.nextInt();

        int a[] = new int[len+1];
        System.out.println("Enter " +len+ " elements: ");

        for(int i=0; i<len; i++)
        {
            a[i] = scan.nextInt(); //determines result
        }

        System.out.println("Enter the element which you wnat to insert: "); //position where number to be added
        ele = scan.nextInt();
        a[len] = ele;
        System.out.println("After inserting: ");
//Loop to print output
        for(int i=0; i<len; i++)
        {
            System.out.println(a[i] + ",");
        }

        System.out.println(a[len]);

    }
}
