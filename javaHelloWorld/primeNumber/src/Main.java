import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number for beginner point: ");
        int numberBegin = input.nextInt();

        System.out.println("Please enter a number for ending point: ");
        int numberEnd = input.nextInt();

        if(numberBegin < 0 || numberEnd < 0 ){
            System.out.println("You have declared an invalid number.");
            return;
        }

        System.out.println("Prime numbers between " + numberBegin + " and " + numberEnd + " are:");

        for(int i=numberBegin; i <= numberEnd; i++) {
            boolean isPrime = true;

            if(i <= 1){
                continue; //1 ve daha küçük sayılar asal değildir.
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { // Eğer sayı j'ye tam bölünüyorsa asal değildir
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i); // Asal sayı ise yazdır
            }
        }
        input.close();
    }
}