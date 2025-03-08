import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables:
        double cost;

        //scanner:
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün fiyatını giriniz(TL): ");
        cost = input.nextDouble();

        //kdv:
        double tax;
        double totalCost;

        if(cost > 0 && cost <= 1000) {
            tax = cost*18/100;
            System.out.println("Ürünün KDV fiyatı: " + tax + " TL");

            //kdv'li fiyat:
            totalCost = cost + tax;
            System.out.println("Ürünün KDV dahil fiyatı: " + totalCost + " TL");

        } else if(cost > 1000){
            tax = cost*8/100;
            System.out.println("Ürünün KDV fiyatı: " + tax + " TL");

            //kdv'li fiyat:
            totalCost = cost + tax;
            System.out.println("Ürünün KDV dahil fiyatı: " + totalCost + " TL");

        } else if(cost <= 0) {
            System.out.println("Yanlış değer girdiniz.");
        }
    }
}