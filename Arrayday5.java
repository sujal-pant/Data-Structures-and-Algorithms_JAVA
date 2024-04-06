import java.util.Scanner;

public class Arrayday5 {
    static void printme(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static int[] prefixsum(int arr[]){

        /* 
         * PATTERN : PREFIX SUM
         *      given a array of int return the prefix sum / running sum in the same 
         * array withoout creating an new array
         * 
         * a -  2 1 3 4 5 
         * index 2 prefix sum is equal to is 6 add (index 0 to 2)
         * pref[1]=a[0]
         * pref[1]=a[0]+a[1]
         * pref[2]=a[0]+a[1]+a[1]
         * pref[3]=a[0]+a[1]+a[2]+a[3]
         * pref[4]=a[0]+a[1]+a[2]+a[3]+a[4]
         * pref[4]=pref[3]+a[4]
         * for any i > =1 
         * pre[i]=pref[i-1]+a[i]
         * prefix sum = pref=
         * Running sum array =
         */
        
        
        for(int i=1;i<arr.length;i++){
            arr[i]= arr[i-1] + arr[i];
        }
        return arr;
        //here we are making new array

    }
    static int[] nonewarr(int arr[]){ 
    
        for(int i=1;i<=arr.length;i++){
            arr[i]= arr[i-1] + arr[i];
        }
        return arr;
    }
    static void qnonnpre(int arr[],int l , int r){

        /*  Given an array of integers of size n . Answer q quaries where you need to 
        print the sum of vakues in a given range of indices from  l to r (both included)

        Note:   the values of l and r in quary follws 1 based indexing
         * 
         * a= 2 4 1 3 6
         * 
         * here the index is starting form 1 
         * now we have a prefix sum arr which:
         * pref= 2 6 7 10 16 21
         * 
         * now if i need l=3 and r=5
         * then ,
         * SUM = pref[r]-pref[l-1] 
         */

       
    }
    static int sumofarr(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean subarr(int arr[]){
        /* Check if we can partition the array into two sub array with equal sum. More 
        formally check that the prefix sum of a part of array is equal to the suffix sum of rest of 
        the array

        a = 5 3 2 6 3 1 
        we can index->  012 and 345
        prefix sum =
        suffix Sum = total sum - prefix sum
         * 
         * 
         * 
         */
        int total = sumofarr(arr);
        int presum=0;
        for(int i=0;i<arr.length;i++){
            presum += arr[i];
            int suffsum = total- presum;
            if(suffsum==presum){
                return true;

            }

        }
        return false;

       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr [] = new int [x];
        for(int i=0;i<arr.length;i++){//code changed for qn
            arr[i]=sc.nextInt();
        }
       System.out.println(subarr(arr));
        // int [] ans = prefixsum(arr);
        // System.out.println("enter the num of q");
        // // int q =sc.nextInt();
        // while ( q-- >0) {
        //     System.out.println("enter l");
        //     int l = sc.nextInt();
        //     System.out.println("Enter r");
        //     int r= sc.nextInt();
        //     int answer = ans[r]-ans[l-1];
        //     System.out.println("sum is "+ answer);


            
        }
        

        

    }

