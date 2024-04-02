import java.util.Arrays;
import java.util.Scanner;
public class Arrayday2QUE {
    
  static int countthe(int arr [],int x){

    /*
     * FIND THE OCCURRENCES OF THE ELEMENT X
     */
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            count++;
        }
    }
    return count;
  }
  static boolean isSorted(int arr[]){

    /*
    this qn is in increasing order
     * Sorted mean : 1 5 6 7-->sorted
     * 1 5 5 5 7 8 -> sorted
     * 5 8 9 3 --> not sorted
     * every element above it is greater then the pre-element
     * 1 5 6 7
     * if i =5
     * then i-1 elemnt is 1
     * if (ith element < (i-1)th element )
     * comparion is done by 2nd element
     * 
     */
    boolean cheack = true;
    for(int i=1;i<arr.length;i++){
        /*
         * if i=0 then i-1 = -1
         * arr[0] ,arr[-1]-- so out of bound
         */
        if(arr[i] < arr[i-1]){
            cheack=false;
            break;


        }
    }
    return cheack;
  }
        static int lastocc(int arr[], int x){
            /*FIND THE LAST OCCURANCE OF ELEMENT X 
             * arr1-> 5 5 5 3 5 4 x=5
             * indexs on which 5 is prensent-> 0,2,4 LAST IS 4
             * LOGIC :
             * Lastindex=-1
             * x=5
             * when we see 5 update it to the current index
             * 
            */
            int counter =-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    counter =i;
                }
            }
            return counter;



        }
        static int[] smallestAndLargestElement(int arr[]){
            /*
             * given array is 5 8 1 3 6 2
             * smallest value is 1
             * largest value is 8 
             * return must be [1,8]--> 2 size of array
             * logic :
             * sort the array:
             * 1 2 3 5 6 8 
             * the smallest is 0th index and the biggest is last 
             * using the array.sort() method
             */
            Arrays.sort(arr);
           int ans []= {arr[0], arr[arr.length-1]};
           return ans;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        //System.out.println("enter the number to find the occurrences");
        //int x = sc.nextInt();
       //System.out.println(countthe(arr, x));
    //    System.out.println(lastocc(arr, x));
           // System.out.println(isSorted(arr));    
           int ans []= smallestAndLargestElement(arr); 
           System.out.println("smallest"+ans[0]);
           System.out.println("largest"+ans[1]);

    }   
}
