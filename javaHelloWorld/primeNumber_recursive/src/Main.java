import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        input.close();
    }

    // Recursive asal kontrol metodu
    public static boolean isPrime(int num, int divisor) {
        if (num <= 1) return false; // 1 ve negatif sayılar asal değildir
        if (divisor == 1) return true; // Kendisi dışında böleni kalmadıysa asal
        if (num % divisor == 0) return false; // Eğer bölünebiliyorsa asal değildir

        return isPrime(num, divisor - 1); // Bir önceki böleni dene
    }
}
