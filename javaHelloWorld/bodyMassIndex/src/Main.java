import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height;
        int weight;

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu m cinsinden giriniz: ");
        height = input.nextDouble();

        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        weight = input.nextInt();

        double index = (double) weight /(height*height);

        System.out.println("Vücut kitle indeksiniz: " + String.format("%.2f", index) );
    }
}