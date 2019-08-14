public class DoWhileLoop {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j]);

            }
            System.out.println();

        }
    }
}
