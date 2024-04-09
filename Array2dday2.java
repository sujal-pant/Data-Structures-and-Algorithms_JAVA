import java.util.Scanner;

public class Array2dday2 {
    static void printarr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int arr[][], int r , int c){
        // it is applicable only for the square matrix
        int ans [][] = new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void transposebyinplace(int arr[][], int r, int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            
        }
    } 
    static void revarr(int arr[]){
        int i=0,j=arr.length-1;
        while (i<j) {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
            
        }
    }
    static void rotateamatixbyninty(int arr[][],int n){
        /*ITS FOR THE SQUARE MATRIX
         * 1 2 3 
         * 4 5 6 
         * 7 8 8
         * 
         * ans is : 
         * 7 4 1
         * 8 5 2 
         * 9 6 3
         *  ttansepose it first and then rev the each row
         */
        //transpose and reverse each row of transpose matrix

        transposebyinplace(arr, n, n);
        for(int i=0;i<n;i++){
            revarr(arr[i]);
        }

    }
    static int[][] pascletriangle(int n){
        /*
         *          given an integer n , return the first n rows of pascals triangle
         *  In pascle triangle , each number is the sum of the two number directly above it
         * for n =5
         * In every element 1 and last element is1 
         * p[i][j]= p[i-1][j]+p[i-1][j-1]
         * int every row, first and last elemnent =1
         * concept of jacked array (diff no of col)
         * ith row has (i+1) col
         */
        int ans [][] = new int [n][];
        for(int i=0;i<n;i++){
            ans[i]= new int [i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // int c= sc.nextInt();
        // int arr [][] = new int [r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         arr[i][j]=sc.nextInt();

        //     }
        // }
        // rotateamatixbyninty(arr, c);
        // printarr(arr);
        // transposebyinplace(arr, r, c);
        // printarr(arr);

    }
}
