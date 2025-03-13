import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı: ");
        RecursivePattern.printPattern(n, n, true);
    }

    public class RecursivePattern {

        static void printPattern(int n, int temp, boolean decrease) {
            System.out.print(temp + " ");

            if (decrease) {
                // Azaltma aşaması
                if (temp > 0) {
                    printPattern(n, temp - 5, true);
                } else {
                    // Negatif veya sıfır olduğunda geri eklemeye başla
                    printPattern(n, temp + 5, false);
                }
            } else {
                // Artırma aşaması (temp, başlangıç sayısına ulaşana kadar)
                if (temp < n) {
                    printPattern(n, temp + 5, false);
                }
            }
        }
    }
}