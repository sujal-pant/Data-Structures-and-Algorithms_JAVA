public class Recursion3 {
    static int findthesum(int n){
        /*
         * Given an integer n , find out the sum of its 
         * digits using recursion
         * n can be as => 5 1 3 => 9 must be the ans 
         * 
         * 1.sub problem-?
         *   1 2 3 4 
         * if we find the sum of 1 2 3 and add 4 then ans can be found
         * if we have d digits then we can calculate d-1 (123) and add the 
         *  n then we can get the ans 
         *  Recursively (d-1) digits sum-> small ans
         * ans = sum + last digits
         * we can extract the last digits by n%10 provided it a integer division
         * we can see if number is 12345
         * then if we do 12345/10-->we get 1234
         * f(n)=f(n/10)
         * f(1234)=f(123)--> sum of digits all excpet the last 
         * now we left
         * 
         * f(n)=f(n/10)+f(n%10);
         * base case: for single digit number we know directly its the same ans
         * if(n>=0 and an<=9){
         * return n
         * }
         */
        if(n>=0 && n<=9){
            return n;
        }
        return findthesum(n/10)+(n%10);
    }
    static int countthenumber(int n){
        if(n >=0 && n<=9){
            return 1;
        }
        return countthenumber(n/10)+1;
    }
    static int power(int p, int q){
        /*
         * For given two number p and q , find the values of 
         * p^q using a recursion function
         * in iteration:
         * ans =1
         * for(int i=1 to q){
         * ans*=q
         * }
         *  p^q= p*p*p*p*..... >q times
         * p^q = p^q-1*p [a^q+a^p = (a)^q+p]
         * so , p^q = p^q-1 * p [p(q-1)+1]
         * 
         * recursive work = > p^q-1 
         * f(p,q)=p^q=>= f(p,q-1) * p --> recurrence relation
         * 
         * p can be any thing  but if we have q =0 all the ans is 0
        

         f(p,q)=f(p,q-1)*p , q>0
         else
         f(p,q)=1 , q=0
        
        
         */
        if(q==0) return 1;
        //recursive work
        ;
        return power(p,q-1)*p;

        /*
         * time complexity: 
         * NO of call is based on q
         * tc -> o(q)
         * time taken is c
         * so , TC->O(q,c)
         * so tc -> o(q)
         * and space com us -> O(q)
         *  
         */


    }
    static int powp(int p, int q){
        if(q==0) return 1;
        int smallpow= powp(p, q/2);
        if(q %2 ==0){
            return smallpow * smallpow;
        }
    
        return smallpow * smallpow * p;

        //TC --> o(logq)
        
    }
    public static void main(String[] args) {
        
        System.out.println(powp(5,4));
        

    }
}
