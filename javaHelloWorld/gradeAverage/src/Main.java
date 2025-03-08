import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables:
        int mat, fiz, kim, turk, muz;

        //Scanner sınıfını tanımlarız:
        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al:
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fiz = input.nextInt();

        System.out.println("Kimya notunuz: ");
        kim = input.nextInt();

        System.out.println("Türkçe notunuz: ");
        turk = input.nextInt();

        System.out.println("Müzik notunuz: ");
        muz = input.nextInt();

        //ortalama hesabı:
        double total = mat+fiz+kim+turk+muz;
        double average = total / 5;

        System.out.println("Ortalamanız: " + average);

        if(average > 60) {
            System.out.println("Geçtiniz.");
        } else {
            System.out.println("Kaldınız.");
        }
    }
}