public class Recursion5 {

    /*
     * RECURSION ON ARRAYS
     * 
     */
    static int findthemaxvaleue(int arr[], int idx){
        /*
         * find the max value of the array
         * say if we have an array as:
         * [3,10,3,2,5]
         * 
         * Bigger problem:
         * f(arr,idx)--> if idx initilly 0 
         * it present as max value in the array starting form index
         * 
         * if we take an example as:
         *  3 [10 3 2 5] recursion will do it work and bring the max element as 10 and 
         * we can compare 10 and the current element which is 3 and give the result
            Big probelm: 
            f(arr,idx)
            recursive work is 
            f(Arr,idx +1)--> max from1 to n-1

            self work is comparing the small ans and arrp[idx]

            base case :
            idx = (n-1) to find the single elememt exist 
            returm arr[idx]
         */
        if(idx==arr.length-1) return arr[idx];
        //idx+1 to end of the arr find the max
        int smallans= findthemaxvaleue(arr, idx+1);

        //selfworl and final ans
       return Math.max(arr[idx],smallans);


    }
    static void printvalueinarr(int arr[], int idx){
        /*
         * Given an array print all its values in recursion
         * arr= {5,4,2,3}
         * f(Arr,Idx)=
         * Idx is represing the current index which we are currently pointing
         * 
         * Recursion will print all index expect 0th index
         * here
         * f(arr,idx) this function will print all the element fromn idx
         * if we take idx as 0 it will print from 0 to n-1
         * 
         * so here we can say that f(arr,idx) is our big problem
         * 
         * recursion will print from f(arr,x+1) //it will print element form 1 to n-1
         * self work is sout n 
         *      
         * 
         * 
         * Big problem :
         *  f(arr,idx) for a given arry arr, print all elements starting form idx
         * 2.small work 
         *  f(arr,idx+1)
         * 3.self work 
         *  sount(n)
         * 4.Base case
         * empty array : return
         * as:
         * if(idx ==n) return
         * 
         */
        //base case
        if(idx==arr.length) return;
        //self work
        System.out.println(arr[idx]);
        //recursive work 
        printvalueinarr(arr, idx+1);

    }
    static int findthesum(int arr[], int idx){
        if(idx==arr.length) return 0;
        //recursion 
        int smallans= findthesum(arr, idx+1);
        //self worl
        return smallans + arr[idx];

    }
   
    public static void main(String[] args) {
        int arr []={1,2,3};
        // findthemaxvaleue(arr, 0);
        // System.out.println(findthemaxvaleue(arr, 0));
        System.out.println(findthesum(arr, 0));


    }
}
