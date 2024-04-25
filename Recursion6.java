import java.util.ArrayList;

public class Recursion6 {
    //LINEAR SEARCH - RECURSION
    static boolean find(int n, int idx ,int arr[], int tar){
    //BASE CASE
    if(idx >= n) return false;
    //self work
    if(arr[idx]==tar) return true;
    //recursion
    return find(n, idx+1, arr, tar);
    }

    static int search(int n, int idx, int arr[], int tar) {
        /*\
         * SAME QN AS ABOVE BUT HERE WE ARE RETURING THE INDEX OF THE ELEMENT
         */
        if (idx >= n) return -1;
        //self work
        if (arr[idx] == tar) return idx;
        //recursion
        return search(n, idx + 1, arr, tar);
    
    }
    static void ret(int n , int idx, int arr[], int tar){
        /*
         * Given an array arr of ;ize N and a target value tgtM The ta;k i; to find all the indi@e; of the given
        target value in the array
        Input arr = {1, 2, 9, 2, 2, 9}, tgt = 2
        Output 1 3 4
        Element 2 i; pre;ent at indi@e; 1, 3, 4 (0 ba;ed indexingd  
        Input arr[] = {8, 8, 8}, tgt = 8
        Output 0 1 2
         */
        if(idx >=n ) return;
        if(arr[idx]==tar){
            System.out.println(idx);
        }
        ret(n, idx+1, arr, tar);
    }
    
    //ARRAY LIST

    static ArrayList<Integer> allindes(int n , int idx , int arr[], int tar){
    // Base case: if idx exceeds the array size, return an empty list
    if (idx >= n) {
        return new ArrayList<Integer>();
    }

    // Self work
    ArrayList<Integer> ans = new ArrayList<>();
    if (arr[idx] == tar) {
        ans.add(idx);
    }

    // Recursive work
    ArrayList<Integer> smallAns = allindes(n, idx + 1, arr, tar);
    ans.addAll(smallAns);
    return ans;

    }
    public static void main(String[] args) {
        int arr[]= {4,2,4,4,5,4};
        int tar= 4;
        int n =arr.length;
        ArrayList <Integer> ans = allindes(n, 0, arr, tar);
        for(Integer i: ans){
            System.out.println(i);
        }
        // System.out.println(search(n, 0, arr, tar));\
        // ret(n, 0, arr, tar);
        // if(find(n, 0, arr, tar)){
        //     System.out.println("yes");
           
        // }
        // else{
        //     System.out.println("no");
        // }
    }
}
