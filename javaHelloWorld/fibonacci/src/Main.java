import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = input.nextInt();

        // İlk iki Fibonacci sayısını başlatıyoruz
        int first = 0, second = 1;

        System.out.print("Fibonacci Serisi: ");

        for (int i = 0; i < n; i++) {
            // İlk iki sayıyı yazdırıyoruz
            if (i == 0) {
                System.out.print(first + " ");
            } else if (i == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second; // Bir sonraki sayıyı hesapla
                System.out.print(next + " ");

                // İlk ve ikinci sayıyı güncelle
                first = second;
                second = next;
            }
        }

        input.close();
    }
}
