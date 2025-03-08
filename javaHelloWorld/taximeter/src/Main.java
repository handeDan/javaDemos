import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        double perKm = 2.20;
        double startPrice = 10;
        double total = (perKm*km) + startPrice;

        total = (total <= 20) ? 20 : total;

        System.out.println("Ödemeniz gereken ücret: " + String.format("%.2f", total) + " TL'dir.");
    }
}