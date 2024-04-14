import java.util.Scanner;

public class Array2dday3 {
    static void printarr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Add a newline after each row
        }
    }

    static void sprialOrder(int arr[][], int r, int c) {
          /*
         * Given a positive integer n , generate an n * n matrix filed with
         * element form 1 to n^2 in the spiral order
         */
        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
        int tol = 0;

        while (tol < r * c) {

            // top row --> left col to right col
            for (int j = leftcol; j <= rightcol && tol < r*c; j++) {
                System.out.print(arr[toprow][j] + " ");
                tol++;
            }
            toprow++;

            // right col --> toprow to bottomrow
            for (int i = toprow; i <= bottomrow && tol < r*c; i++) {
                System.out.print(arr[i][rightcol] + " ");
                tol++;
            }
            rightcol--;

            // bottom row--> right col to left col
            for (int j = rightcol; j >= leftcol && tol < r*c ; j--) {
                System.out.print(arr[bottomrow][j] + " ");
                tol++;
            }
            bottomrow--;

            // left col -> bottom row to top row
            for (int i = bottomrow; i >= toprow && tol < r*c; i--) {
                System.out.print(arr[i][leftcol] + " ");
                tol++;
            }
            leftcol++;
        }
    } 
    static int[][] spiral(int n) {
        int arr[][] = new int[n][n];
        int toprow = 0, bottomrow = n - 1, leftcol = 0, rightcol = n - 1;
        int curr = 1;

        while (curr <= n * n) {

            // top row --> left col to right col
            for (int j = leftcol; j <= rightcol && curr <= n * n; j++) {
                arr[toprow][j] = curr;
                curr++;
            }
            toprow++;

            // right col --> toprow to bottomrow
            for (int i = toprow; i <= bottomrow && curr <= n * n; i++) {
                arr[i][rightcol] = curr;
                curr++;
            }
            rightcol--;

            // bottom row--> right col to left col
            for (int j = rightcol; j >= leftcol && curr <= n * n; j--) {
                arr[bottomrow][j] = curr;
                curr++;
            }
            bottomrow--;

            // left col -> bottom row to top row
            for (int i = bottomrow; i >= toprow && curr <= n * n; i--) {
                arr[i][leftcol] = curr;
                curr++;
            }
            leftcol++;
        }
        return arr;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        // int c = sc.nextInt();
        // int arr[][] = new int[r][c];
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
            int ans [][]= spiral(n);
            printarr(ans);


    }
}
