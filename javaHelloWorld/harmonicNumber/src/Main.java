import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = scanner.nextInt();

        double harmonicSum = 0.0;

        // Harmonical serie:
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println("the number of " + n + " 's harmonical serie is: " + harmonicSum);

        scanner.close();
    }
}