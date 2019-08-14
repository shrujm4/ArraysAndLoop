//Display right angle triangle of @ using nested for loops

public class RightTriangle {
    public static void main(String[] args) {



        for (int row = 1; row <= 5; ++row) {// for loop to determine
            for (int col = 1; col <= row; ++col) {
                System.out.print("@"); //prints pattern as right triangle
            }

            System.out.println();
        }

    }
}
