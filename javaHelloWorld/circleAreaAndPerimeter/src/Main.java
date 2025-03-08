import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int a; //merkez açısı

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı cm cinsinden giriniz: ");
        r = input.nextInt();

        System.out.println("Merkez açısını giriniz: ");
        a = input.nextInt();

        double area = pi*r*r;
        double perimeter = 2*pi*r;
        double areaPiece = (pi*(r*r)*a)/360; //daire dilimi alanı

        System.out.println("Daire alanı: " +  String.format("%.2f", area));
        System.out.println("Daire çevresi: " + String.format("%.2f", perimeter));
        System.out.println("Daire dilimi alanı: " + String.format("%.2f", areaPiece));

    }
}