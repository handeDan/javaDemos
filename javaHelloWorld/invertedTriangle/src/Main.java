import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alıyoruz
        System.out.print("Basamak Sayısı : ");
        int basamakSayisi = scanner.nextInt();

        // Ters üçgen çizmek için dış döngü: ters üçgenin her satırını oluşturur.
        for (int i = 0; i < basamakSayisi; i++) {
            // iç döngü: Satır başındaki boşlukları ekler.
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // iç döngü2: her satırda yıldız (*) yazdırır.
            for (int k = 0; k < (2 * (basamakSayisi - i) - 1); k++) {
                System.out.print("*");
            }

            // Bir satır tamamlandıktan sonra yeni satıra geçiyoruz
            System.out.println();
        }

        scanner.close();
    }
}
