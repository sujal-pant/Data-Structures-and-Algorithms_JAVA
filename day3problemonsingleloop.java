import java.util.Scanner;

public class day3problemonsingleloop {

    public static void main(String[] args) {
        // count the number of digit for a given number n
        /*
         * n= 12345
         * if we divide by 10 then 12345/10 = 1234
         * again 1234/10=123
         * 123/10=12
         * 12/10=1
         * 1/10=0
         * 0/10=0 --> the situation where it repete
         * 
         * lOGIC : DIVIDE BY 10 UNTIL N >0 AND COUNT THE NUMBER OF DIVISIONS
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {

            n = n / 10;
            count++;
        }
        System.out.print(count);
        System.out.println("end of qn 1");

        /*
         * FIND THE SUM OF DIGITS IN A GIVEN SERIES
         * LIKE : 765 --> 7+6+5--> 18
         * ANS = 7+6 =13+5--> ANS
         * IF WE DO :
         * 765 % 10 =5
         * 76 % 10 = 6
         * 7 % 1- = 7
         * 
         * NOTE :
         * (ANY NUMBER ) % 10 = LAST DIGIT OF THE NUMBER
         */
        Scanner i = new Scanner (System.in);
        int m = i.nextInt();
        int sumofdigit=0;
        while (m >0) {
            sumofdigit +=m %10;
            m=m/10;
            
        }
        System.out.println(sumofdigit);
        System.out.println("End of question 3");

        /*
         *  Reverse the digits of numbes
         * 2346--> 6432
         * we cando it as :
         * 0 *10 +6-->6
         * 6*10+4=> 64
         * 64*10+3=>643
         * 643*10+2=>6432
         * ans * 10 + n%10;
         * n=n/10
         */
        Scanner e = new Scanner(System.in);
        int w = e.nextInt();
        int ans =0;
        while (w >0) 
        {
            ans = ans *10 + w%10;
            w =w/10;
        }
        System.out.println(ans);
        System.out.println("End of question 3");
        /*
         * find the sum of the series
         * S=1-2+3-4..n
         * ans += odd
         * ans -= even
         */
        Scanner y = new Scanner(System.in);
        int q = y.nextInt();
        int as= 0;
        for (int z=0;z<=q;z++){
            if (z % 2==0){
                as-=z;
            }
            else{
                as+=z;
            }
            System.out.println(as);
        }
        System.out.println("end of this qn");
        System.out.println("next qn factorial");
        /*n=5
         * 1,2,3,4,5 show it all
         * 1,2,6,24,120
         */
        Scanner s = new Scanner (System.in);
        int d = s.nextInt();
        int fact =1 ;
        for(int g=1;g<=d;g++){
            fact = fact*g;
            System.out.println(fact);
            System.out.println("end of this question");
            /*
             * given 2 number a and b . find a raise to the power b
             * a=2,b=5
             * b times the loop
             */
            Scanner h = new Scanner(System.in);
            int f = h.nextInt();
            int u = h.nextInt();
            int r=0;
            for (int a =0;a<=u;a++){
                r *=u;

            } 
            System.out.println(r);
        }

    }
}