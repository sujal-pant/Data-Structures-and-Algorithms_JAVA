import java.util.Scanner;
public class day3whileloop {
    
    public static void main(String[] args) {
        
        /* loops in java 
         * simply made for doing the things repetatively
         * TYPE OF LOOPS
         * WHILE FOR DO-WHILE -LOOPS
         * 
         */
        System.out.println("while loop on java");
        /*syntax: while(contition){
            code
        }
         */
        // question 1 : WAP TO PRINT OF N NATURAL NUMBER 

        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int num =1 ;
        while (num <= x) {
            System.out.println(num);
            num++;
            
        }

        // QUESTION 2 WAP TO FIND THE SUM OF THE NUMBER

        Scanner a = new Scanner(System.in);
        int v = a.nextInt();
        int sum = 0;
        int number = 1;
        while (number <= v) {
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}
