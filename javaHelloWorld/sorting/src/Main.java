import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("a : ");
        a = input.nextInt();
        System.out.println("b : ");
        b = input.nextInt();
        System.out.println("c : ");
        c = input.nextInt();


        //sorting as ">":
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        }

        if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        }

        if (c > a && c > b) {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }

        //sorting as "<":
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }

        if (b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        }

        if (c < a && c < b) {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}