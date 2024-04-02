import java.util.Arrays;
import java.util.Scanner;
public class Arrayday2 {
    static void printarr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public void userinput(){
        /*
         * taking the user input in the array
         */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of arr");
        // int x = sc.nextInt();
        int arr [] = new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();

        // }
        System.out.println("ORGININAL ARRAY");
        printarr(arr);
        //trying to copy arr to arr2
        //assignment operator
        // clone method
        // int[] arr_2= arr.clone();
        //copyof method 
        int arr_2[]= Arrays.copyOf(arr, 2);
        System.out.println("COPIED ARRAY");
 
        printarr(arr_2);
        //changes in some values in arrys 2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original arry after change in arr 2");
        printarr(arr);

        System.out.println("copied array after changing to arr");
        printarr(arr_2);

    }
    static void changearr(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public void array(){
        int arr [] = new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        changearr(arr);
        printarr(arr);
    }
    public static void main(String[] args) {
        Arrayday2 obj = new Arrayday2();
        obj.userinput();

    }
}
