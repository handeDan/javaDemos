import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter: ");
        int howMany = input.nextInt();

        // İlk sayıyı alıyoruz ve başlangıçta hem en küçük hem de en büyük olarak kabul ediyoruz
        System.out.print("1. sayıyı girin: ");
        int number = input.nextInt();

        int min = number; // En küçük sayı
        int max = number; // En büyük sayı

        // Kullanıcıdan kalan N-1 sayıyı alıyoruz
        for (int i = 2; i <= howMany; i++) {
            System.out.print(i + ". sayıyı girin: ");
            number = input.nextInt();

            // En küçük sayıyı güncelleme
            if (number < min) {
                min = number;
            }

            // En büyük sayıyı güncelleme
            if (number > max) {
                max = number;
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        input.close();
        }
    }