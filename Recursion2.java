public class Recursion2 {

    static int findfact(int n){
        /*

        TIME COMPLEXITY OF RECURSIVE CODE /--> NO OF RECURSIVE CALL * TIME TAKEN IN 1 CALL
         * FIND THE FACTORIAL
         * 5!= 5*4*3*2*1
         * 
         * SUB PROBELM: F(5)=5*4*3*2*1
         * WHERE 4 IS THE FACT OF (4)I.E 4*3*2*1 
         * f(n)=n* f(n-1)
         * sub prob->f(n-1)
         * self work = [N*] f(n-1) --> recurrence relation realtion betn small and big problem
         * base case = f(0)=1..>
         * 
         * 
         */
        //base case //n==5
         if(n==0) return 1;
         //smaller probelm= recursive 
        //  int smallans= findfact(n-1);//factorial(4)=21
        //self work
        // int ans= n*smallans;

        //TIME COMPLEXITY = 


        return n * findfact(n-1);

        // TIME COMPLEXITY = 0(n)-->    
        // SPACE COMPLEXITY=0(N)
// STACK FRAME FOR N IS N SO 

  
    }
    static int fibonacci(int n){
        /*
         * 0 1 1 2 3 5 7 ... 
         * every number is sum of back 2 number
         * where 0 1 is constatnt  
         * f(n)current term = pre term f(n-1)+ pre pre termf(n-2)
         * 
         * sub problem: f(n-1) and f(n-2)
         * self work -> f(n-1)+f(n-2) //additon 
         * base case --> n=0 ans 0 and n=1 ans 1
         */
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findfact(4));
         
        System.out.println(fibonacci(3));
    }
}
