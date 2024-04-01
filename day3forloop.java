import java.util.Scanner;
public class day3forloop {
    public static void main(String[] args) {
        /*
        syntax:
        for(init statement ; condition;final-expression){

        } */
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        for (int i=0;i<=x;i++) {
            System.out.println(i);
        }       
    }
}
