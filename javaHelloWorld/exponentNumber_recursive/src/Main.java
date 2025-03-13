import java.util.Scanner;

public class Main {
    public static int exponent(int base, int exp) {
        if (exp == 0) {
            return 1; // Her sayının 0. kuvveti 1'dir.
        }
        return base * exponent(base, exp - 1); // Recursive çağrı
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        int result = exponent(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);

        input.close();
    }
}
