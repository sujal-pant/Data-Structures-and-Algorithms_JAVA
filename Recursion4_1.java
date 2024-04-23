import java.util.Scanner;

public class Recursion4_1 {

    static int findgcd(int x, int y){

        /*
         * Given two numbers x and y . find the greatest common diviser of x and y 
         * using the recursion
         * 
         * Constrains:
         * 0<=x , y,=1e6
         * INPUT= X=4 AND Y = 9
         * OUTPUT:1
         * 
         * hcf and gcd is same and we learn about the lcm too
         * let say we have given number 
         * x=24->1,2,3,4,6,8,12,24
         * y=15=1,3,5,15
         * 
         * common divisers= 1,3
         * GCD : 3
         * 
         */
        /*
         *              BRUTE FORCE APPROACH
         *    12 and 16 
         * 12 starting form 12 divide the both numbers 
         * 
         * 
         * gcd(x,y)<=min(x,y)
         *  
         */
        while (x%y !=0) {
            int rem = x%y;
            x=y;
            y=rem;

            
        }
        return y;
    }
    static int EUCLIDSALGO(int x,int y){
        /*EUCLIDSALGO says
         * gcd (x,y)= gcd(y,x%y)
         * gcd(x,0)=x
         * 
         */
        if(y==0) return x;
        return EUCLIDSALGO(y,x%y);



         
    }
    static void lcm(int x){
        /*
         * LCM * GCD = X*Y
         * lcm = (x*y)/gcd
         */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y=sc.nextInt();
        System.out.println(findgcd(x, y));
        System.out.println(EUCLIDSALGO(x, y));
        
    }
  
}
