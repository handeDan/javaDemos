import java.util.Scanner; //scanner import edilmeli

public class Main {
    public static void main(String[] args) {
        //Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz: "); //kullanıcıdan değer girmesi isteniyor
        String str = input.nextLine(); //string türünde olduğu için nextLine dedik, değişken türüne göre nextInt(), nextDouble() vb. olabilir.
        System.out.println(str);
    }
}