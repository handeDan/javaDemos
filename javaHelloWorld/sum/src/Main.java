import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a valid even number: ");
        int number = input.nextInt();

        if(number%2 != 0){
            System.out.println("The number is not an even number.");
            return;
        }

        int sum=0;

        for(int i = 0; i <= number; i++){
            if(i%4 == 0){
                sum += i;
                System.out.println("The number: " + i);
            }
        }
        System.out.println("The sum of the numbers: " + sum);
        input.close();
    }
}