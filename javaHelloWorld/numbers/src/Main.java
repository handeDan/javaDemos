import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number larger than 0: ");
        int number = input.nextInt();

        if(number <= 0) {
            System.out.println("Please enter a valid number.");
            input.close();
            return;
        }

        int sum = 0;
        int count = 0;

        for(int i = 1; i <= number; i++) {
                if(i%3 == 0 && i%4 == 0){
                   sum += i;
                   count ++;
                }
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Average of numbers divisible by 3 and 4: " + average);
            } else {
                System.out.println("No number found that is divisible by 3 and 4.");
            }
        input.close();
    }
    }
