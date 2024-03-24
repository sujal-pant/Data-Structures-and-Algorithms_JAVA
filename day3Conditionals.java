import java.util.Scanner;

public class day3Conditionals {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("number is % by 2");
        } else {
            System.out.println("Sorrry not % by 2");
        }

        System.out.println("if else if statement");
        if (x <= 12) {
            System.out.println("he is a child");

        } else if (x > 12 && x < 18) {
            System.out.println("teenage");

        } else {
            System.out.println("adult");
        }

        System.out.println("Question: WAP to check value of divisible by 3 or 5");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b % 5 == 0 && b % 3 == 0) {
            System.out.println("yes it is ");
        } else {
            System.out.println("sorry");
        }

        System.out.println("switch case");
        Scanner n = new Scanner(System.in);
        int c = n.nextInt();
        switch (c) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            default:
                System.out.println("Sorry");
                break;
        }

    }
}
