import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a limit: ");
        int limit = input.nextInt();

        System.out.println("Powers of 4 up to " + limit + ":");

        //powers of 4:
        for (int i = 0; Math.pow(4, i) <= limit; i++) {
            System.out.println("4^" + i + " = " + (int) Math.pow(4, i));
        }

        //powers of 5:
        for (int i = 0; Math.pow(5, i) <= limit; i++) {
            System.out.println("5^" + i + " = " + (int) Math.pow(5, i));
        }

        input.close();
    }
}