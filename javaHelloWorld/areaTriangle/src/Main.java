import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk kenarı giriniz(cm): ");
        a = input.nextInt();

        System.out.println("İkinci kenarı giriniz(cm): ");
        b = input.nextInt();

        System.out.println("Üçüncü kenarı giriniz(cm): ");
        c = input.nextInt();

        int perimeter = a+b+c;
        double halfP = perimeter/2;

        double areaDouble = halfP*(halfP -a)*(halfP-b)*(halfP-c);
        double area = Math.sqrt(areaDouble);

        System.out.println("Üçgenin alanı: " + area + " cm2'dir.");
    }
}