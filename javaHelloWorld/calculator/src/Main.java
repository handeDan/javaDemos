import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        num1 = input.nextDouble();

        System.out.println("Diğer sayıyı giriniz: ");
        num2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");

        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplam : " + (num1+num2));;
                break;
            case 2:
                System.out.println("Çıkarma : " + (num1-num2));;
                break;
            case 3:
                System.out.println("Çarpma : " + (num1*num2));;
                break;
            case 4:
                System.out.println("Bölme : " + (num1/num2));;
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");;
        }
    }
}