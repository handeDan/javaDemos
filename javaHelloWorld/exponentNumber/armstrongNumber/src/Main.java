import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex. 407 :
        // (4^3)+ (0^3)+(7^3) = 64+0+343 = 407. Therefore 407 is an armstrong number.
        //ex. 1342 :
        //(1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354. Therefore 1342 is not an armstrong number.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}