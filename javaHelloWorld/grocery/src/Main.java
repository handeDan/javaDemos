import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5;

        Scanner input = new Scanner(System.in);

        double amountPear;
        System.out.println("Kaç kilo armut aldığınızı giriniz: ");
        amountPear = input.nextDouble();

        double amountApple;
        System.out.println("Kaç kilo elma aldığınızı giriniz: ");
        amountApple = input.nextDouble();

        double amountTomato;
        System.out.println("Kaç kilo domates aldığınızı giriniz: ");
        amountTomato = input.nextDouble();

        double amountBanana;
        System.out.println("Kaç kilo muz aldığınızı giriniz: ");
        amountBanana = input.nextDouble();

        double amountEggplant;
        System.out.println("Kaç kilo patlıcan aldığınızı giriniz: ");
        amountEggplant = input.nextDouble();

        double total = (amountPear*pear)+(amountApple*apple)+(amountTomato*tomato)+(amountBanana*banana)+(amountEggplant*eggplant);

        System.out.println("Toplam Tutar : " + String.format("%.2f", total) + " TL");
    }
}