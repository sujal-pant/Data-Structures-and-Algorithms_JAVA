import java.util.Scanner;

public class Array2dday1 {

    static void twodimarray(int arr[]){

        /*
         *  Multi dimesional array - > array of array
         * diff no of element called jacked array
         *  syntax:
         * int aee [] [] = new int [row] [coluns (optional)]
         * int arr [] = {{1,2,3},{12,12,12,}}
         */
    }
    static void printarr(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i] + " " + arr[j]);

            }
            System.out.println();
        }

    }
    static void addtwomatices(int a [][],int [][ ]b, int r1 , int c1, int r2 , int c2){

        /* 
         * 2 3
         * 4 5
         * +
         * 1 2 
         * 3 4
         * 
         * => 3 5 
      *       7 9

        only matcices with same dimension is needed.r=r1 and c=c1 must be equal.
        SUM[i][j]= A[i][j]+B[i][j]
         */
        if(r1 != r2 || c1 !=c2){
            System.out.println("not possible");
            return;
        }
        int [][] sum = new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+ b[i][j];

            }
        }
        printarr(a);
    }
    static void multi(int a [][], int r1 , int c1 , int [][]b , int r2,int c2)
    {

        /*
         * Write a progra\ to display Multiplication of two \atrices entered by the user.
         *  column of 1st matrix = row of 2nd matrix
         * result matrix is equal to the r1*c2 dimensen
         * \
         * 
         */
        if(c1!=r2){
            System.out.println("soryy");
            return;
        }
        int mul [][] = new int [r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        //ITH ROW OF A * JTH   COL OF B
                        mul[i][j]+=(a[i][k]*b[k][j]);
                    }
                }
            }
            System.out.println("mult");
            printarr(mul);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 =sc.nextInt();
        int c1 = sc.nextInt();
        int a [][]= new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r2 =sc.nextInt();
        int c2 = sc.nextInt();
        int b [][]= new int [r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        // int arr [][] = new int [2][4];
        // arr[0][0]=[1];
       // int arr2[][]={{1,2,3},{21,12,32}};
    //    addtwomatices(a, b, r1, c1, r2, c2);
    multi(a, r1, c1, b, r2, c2);
        
        

    }
}
