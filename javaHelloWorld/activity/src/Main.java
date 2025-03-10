import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the temperature? : ");
        heat = input.nextInt();

//        if(heat <= 5 && heat > -15) {
//            System.out.println("recommended activity: Skiing");
//        } else if(heat > 5 && heat <= 15) {
//            System.out.println("recommended activity: Cinema");
//        } else if(heat > 15 && heat <= 25) {
//            System.out.println("recommended activity: Picnic");
//        } else if(heat > 25 && heat < 50){
//            System.out.println("recommended activity: Swimming");
//        } else {
//            System.out.println("recommended activity: stay at home better");
//        }
        //*****
        //switch-case:
        switch (heat / 10) { // Sıcaklığı gruplara ayırıyoruz
            case 0: // 0 - 9°C arası
                System.out.println("Recommended activity: Skiing");
                break;
            case 1: // 10 - 19°C arası
                System.out.println("Recommended activity: Cinema");
                break;
            case 2: // 20 - 29°C arası
                System.out.println("Recommended activity: Picnic");
                break;
            default: // 30°C ve üzeri
                System.out.println("Recommended activity: Swimming");
                break;
        }
        input.close(); //Scanner kapatıldıktan sonra tekrar kullanılamaz!
    }
}