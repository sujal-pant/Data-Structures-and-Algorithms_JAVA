import java.util.Scanner;

public class Arrayday4 {

    public static void printarr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void twopointer(int arr[]) {
        /*
         * PATTERN: TWO POINTERS
         * qn; Sort an array consisting of only 0s and 1s
         * like an arr is : 1 0 0 1 0 1 1 0 >n=9
         * 5zero are in front and last in 1
         * 
         */
        int n = arr.length;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }

        // count the number of zero
        // 0 to zero-1 , zero to zeroes to n-1:1
    }

    static void twosumbyone(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 0) {
                j++;
            }

        }
    }

    static int[] sorthaha(int arr[]){
            /* 
             * Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
            all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies
        the condition.
             */
            int i = 0, j = arr.length-1;
    while(i < j) {
    if(arr[i] % 2 == 1 && arr[j] % 2 == 0)  
    {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
    }   
    if(arr[i] % 2 == 0) i++;
    if(arr[j] % 2 == 1) j--;
    }
    return arr;
}
static int[] haha(int arr[]){
    /* 
     * Given an integer array ‘a’ sorted in non-decreasing order, return an array of the squares of each
        number sorted in non-decreasing order.
     */
    int i=0, j=arr.length-1;
    int ans [] = new int [arr.length];
    int k=0;
    while (i<j) {
        if(Math.abs(arr[i])>Math.abs(arr[j])){
            ans[k++]= arr[i]* arr[i];
            i++;
            
        }
        else{
            ans[k++]=arr[j]*arr[j];
            j--;

        }
        
    }
    return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[]= haha(arr);
        printarr(ans);
        

    }
}
