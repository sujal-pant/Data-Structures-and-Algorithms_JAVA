import java.util.Scanner;
public class Arrayday3_1 {
    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swapme(int a, int b){
        /* 
         * given 2 integer a and b swap the 2 values using sums and difference methods
         * 
         * a=9
         * b=3
         * a =a+b;
         * a= 12
         * b=a-b;
         * 12-3
         * b=9
         * a=a-b;
         * a=12-9
         * a=3
         * so swappec
         * a=a+b;
         * b=a-b;
         * a=a-b;
         * 
         * 
         */

    }
    static int[] revarr(int arr[]){

        /* 
         * 1 2 3 4 5 is a array--> 5 4 3 2 1
         * ans[] = index[4to1 ]
         * ans[i++]=arr[j--]
         */
        int j=0;
        int n =arr.length;
        int ans []= new int[n]; 
        //travese the array in reverse direction
        /*
         * ans[]-->length is 5 orginal is also 5
         * j=0;
         * postfix increment as :
         * j++ first the j=0 then nxt time j=1 
         * so for loop :
         * is 4 >0? yes ans[0]=4
         * is 3> 0? yes ans[1]=3
         * so on..!
         * ans[0]=5 as 
         */
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];

        }
        return ans;


    }
    static void swapinarr(int arr[] ,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void inplacerev(int arr[]){
        /* INPLACE ARRAY WHERE NEW ARRAY IS NOT CREATED */
        /*
         * let us take 2 pointer
         * 1 2 3 4 5 
         * where i = 0 -->1 [i++]
         * where j =n-1-->6  [j--]
         * swap(arr,i,j)
         */
        int i=0 ,j=arr.length-1;
        while (i<j) {
            swapinarr(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] roatatebyk(int arr[], int k ){
        /* 
         * Rotate the given arr by 'k' step where k is a non negative intiger 
         * note: k can be greater then n aswell
         * 1 2 3 4 5 
         * 5 1 2 3 4
         * 4 5 1 2 3
         * 3 4 5 1 2 
         * 2 3 4 5 1
         * 1 2 3 4 5
         * if we rotate it k =6 is 1 
         * k=7 
         * k%n--> n is the length
         * 
         * k=5
         * arr 1234567
         * ans 3456712
         * 
         * arr->(n-k) to (n-1)
         * arr-> [0 to n-k-1]
         */
        int n = arr.length;
        k=k%n;
        int ans [] = new int[n];
        int j=0;
        /*
         * the first part of the array is nothing then the
         * say we have 1 2 3 4 5 6 7 
         * k=5
         * ans arr is 3 4 5 6 7 1 2
         * here the index of the firt is 2 to 6 which is (n-k)
         * 
         */
        for(int i=n-k;i< n;i++){
            ans[j++]=arr[i];
        }
        //left part is n-k-1 steps 
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;

    }

     static void checkinarray(int arr[]){
        /* 
         * Check if the elements in the array is present on the array or not?
         *   Note: value of all the elements in the array is less then 10 to the power 5
         * 
         * say example:
         *       arr = 5 6 5 400 560 1000 400
         * q is the number of queary--5 number of ask 
         *   5-> 5 , yes other no for 5 times
         * 
         * CONCEPT OF freauency array : which have value 10^5+1
         *  freq --> 0 0 0 0 0 0 0 00 0 
         *  index --> 0 1  2  3 4 5
         * 
         * what to do is that for the main arr when we find the element / number 
         *  inrement the value of feq like 1 if it repetead once or 2 for 2time repetation.
         */

     }
     static int[] makefreqarr(int arr[] ){
        int[] freq = new int [100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i++]];
        }
        return freq;
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int x = sc.nextInt();
        int arr [] = new int [x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] freq = makefreqarr(arr);
        System.out.println("enter the number of quaries");
         int k=sc.nextInt();
         while (q>0) {
            System.out.println("enter number to be searched");
            int x = sc.nextInt();
            if(freq[x]> 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
            
         }
    
       
    }
}
