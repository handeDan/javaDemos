import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            int a, b;

            Scanner input = new Scanner(System.in);

            System.out.println("İlk dik kenarı giriniz(cm): ");
            a = input.nextInt();

            System.out.println("Diğer dik kenarı giriniz(cm): ");
            b = input.nextInt();

            double hypotenuse = Math.sqrt((a*a)+(b*b));

            System.out.println("a: " + a + " b: " + b + " hypotenuse: " + hypotenuse);
    }
}