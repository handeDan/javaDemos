import java.util.Scanner;

public class Main {
    //Factorial calculator
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for n: ");
        int n = input.nextInt();

        System.out.print("Enter value for r: ");
        int r = input.nextInt();

        if (n < r || n < 0 || r < 0) {
            System.out.println("Invalid input. Ensure that n >= r and both are non-negative.");
        } else {
            //combination: C(n,r) = n! / (r! * (n-r)!)
            int combination = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + combination);
        }

        input.close();
    }
}
