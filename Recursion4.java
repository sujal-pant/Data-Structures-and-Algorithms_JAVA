import java.util.Scanner;

public class Recursion4 {
    static void printkmultiple(int n , int k ){
        /*
         * Given a number num and a value k . print the k mutiples of the num
         * examples:
         * 1. constaints: k>0
         * intput 1 : 12, k=5
         * output = 12 24 36 48 60
         * 
         * Input 2: num=3 and k=8
         * output : 3 6 9 12 15 18 21 24
         * 
         * Big problem ; f(n,k)--> prints first k multiples on n 
         * small problem: f(n,k-1)
         * self work ; n*k
         * base case = if k=0 return method end hunxa and if k = 1 then just return n ;
         * 
         */
        if(k==1){

        System.out.println(n);
        return;
        }
        printkmultiple(n, k-1);

        //self work
        System.out.println(n*k);


        // time compelixty: O(k)
    }
    static int findthesum(int n){
        /* 
         * find the sum 1+2+3++...n-1
         * if(n==0) return 0
         * f(n)= f(n-1)+n ,n>0
         * 0 ,n=0
         * 
         */
        if(n==0) return 0;
        return findthesum(n-1)+n;

    }
    static int findthesumofnatural(int n ){
        /*
         * Given a number n . find the sum of natural number till n but with alternative signs
         * that mean s if n =5 then we have to return 1-2+3-4+5=3 AS our ans 
         * the given constraints:
         *  0<=n<1e6
         * Input 1 =10
         * ans -5
         * intput 2 : ans 3
         * all even number are substracted and all odd numbers are added
         * if we take an exaples as :
         * odd (ma add in last n)
         * n=5
         * f(n)=[1-2+3-4]+5 
         * f(n)=f(n-1)+n
         * n=6
         * f(n)=[1-2+3-4+5]-6 
         * f(n)=f(n-1)-n
         * 
         * 
         * f(n)= f(n-1)+n , n is odd
         * f(n)=f(n-1)-n , n is even
         * base case : if n==0 return 0
         * 
         * 
         */
        if(n==0) return 0;
        if(n%2==0){
            return findthesum(n-1)+n;
        }
        else{
            return findthesum(n-1)-n;
        }
        //time complexity is O(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt(); 

        printkmultiple(n, k);
        
    }
}
