import java.util.Scanner;

public class Array2dday4 {
    /*
     *          PATTERN: PREFIX SUMS IN 2D ARRAYS
     *  Given a matrix 'a' of the dimensions n * m, and two coordinates (l1, r1)
     *  and (l2, r2). Return the sum of the rectangle from (l1, r1)
     *  to (l2, r2).
     * 
     *  NOTE:
     *  1. l2 >= l1, r2 >= r1
     *  2. 0 <= l1, l2 < n (number of rows)
     *  3. 0 <= r1, r2 < m (number of columns)
     */
    static int bruteForce(int arr[][], int l1, int l2, int r1, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    static void prefixforsum(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        //calculate horizontally for cal of prrix
        for(int j=0;j<c;j++){//fixing columns
            for(int i=1;i<r;i++){
                arr[i][j]+= arr[i-1][j];
            } 
        }

    }
    static int precal(int arr[][],int l1, int l2, int r1, int r2){
        /*
         * Method -2 :PRE-CALCULATION the horizontal sum for each 
         * row in the matrix\
         * 
         */
        int sum =0;
        prefixforsum(arr);
        for(int i=l1;i<=l2;i++){
            //r1 to r2 sum for row i
            if(r1>=1)
            sum+= arr[i][r2]-arr[i][r1-1];
            else sum+=arr[i][r2];
        }
        return sum;


    }
    static int optmized (int arr[][],int l1, int l2, int r1, int r2){

        int ans =0;
        prefixforsum(arr);
        int sum =0,up=0, left=0, leftup=0;
        sum=arr[l2][r2];
        if(r1>=1)
        left=arr[l2][r1-1];
        if(l1>=1)
        up=arr[l1-1][r2];
        if(r1>=1 && r1>=1)
        leftup=arr[l1-1][r1-1];


        ans=sum- up - left +leftup;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the boundary coordinates:");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        // int result = bruteForce(arr, l1, l2, r1, r2);
        System.out.println("Sum of elements within the specified submatrix: " + optmized(arr, l1, l2, r1, r2));
    //     precal(arr, l1, l2, r1, r2);
    // //    System.out.println(bruteForce(arr, l1, l2, r1, r2));
    }
}
