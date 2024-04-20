import java.util.Scanner;

public class Recursion1 {

    /*
     * Recursion- A function calling it self with different parameter and a basecase
     * to terminate the infinite loop
     * 
     * In recursion , we solve a bigger problem by solving smallere sub program
     * 
     * Function--> Problems  (PI(N))
     * ->sub problem PI(n-1)
     * A finction call it self to solve its sup probelm
     * (HERE WE THINK AS A STACK AS WHERE WE KNOW THAT THE there is present of 
     * PD and function (as main) and it work on the principle of LAST IN FIRST OUT
     * (LIFO) )
     * 
     */
    /*
     * The recursion spell
     * 1. identify the smaller problem --> let recursion solve it 
     * 2.Self work --> do your work (1234)5
     * 3.Base case (identify) -> the smallest problem for which the answer is ovious
     * @NOTE:
     * Recusive work or recusrive work at first (identity first)
     */

     static void rec1 (int n){
        /* 
         * WAP to print all the natural number from 1 to n using recurion
         * 
         * PI(n)= PI(n-1)n--<
         * PI(5): pI(4)5
         * pI(4)= pi(3)4
         * ....
         * PI(1)=1
         * 
         */
        if(n==1){ //base case

            System.out.println(1);
            return;
        }
        rec1(n-1);//1,2,3,..(n-1) //samller problem or sub problem
        System.out.println(n);//n // self work
     }
     static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        /*
         * PD(5)= 5 [4 3 2 1] recusrion do it
         * PD(N)= n , n-1, , , , ,2,1
         * 1.SAMALLER PROBLEM-> PD(N-1)
         * 2. SELF WORK -> SOUT(N)
         * BASE CASE = N=1
         */
        System.out.println(n);
        print(n-1);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        
    }
}
