import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double pricePerKm = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.println("How much km? ");
        km = input.nextInt();
        System.out.println("How old are you? ");
        age = input.nextInt();
        System.out.println("What type is your flight? : 1-ONE WAY 2-RETURN");
        type = input.nextInt();

        double totalPrice;
        double discount = 0;

        if(km > 0 && age > 0 && (type == 1 || type == 2)){
            totalPrice = km*pricePerKm;

            //age discounts:
            if(age < 12){
                discount = totalPrice*0.5;
            } else if(age >= 12 && age <= 24) {
                discount = totalPrice*0.1;
            } else if(age >= 65) {
                discount = totalPrice*0.3;
            }
            totalPrice -= discount;

            //type 2 discount:
            if (type == 2) {
                totalPrice *= 0.8;
                totalPrice *= 2;
            }

            System.out.println("Total: " + String.format("%.2f", totalPrice) + " TL");
        } else{
            System.out.println("You have entered incorrect data!");
        }
    }
}