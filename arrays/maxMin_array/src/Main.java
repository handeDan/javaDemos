import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(list); // Diziyi küçükten büyüğe sıralar
        System.out.println("Sıralı dizi: " + Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        Integer minNear = null;
        Integer maxNear = null;
        //int minNear = null; yazamamamızın sebebi, int veri tipinin null değerini alamamasıdır.
        //int bir primitive türdür ve sadece sayısal değerleri alabilir.
        //null ise bir referans veri tipi değeridir ve sadece nesneler (Integer, String, Double vb.) için kullanılabilir.
        //Eğer int minNear = null; yazarsak, derleme hatası alırız. - compilation exception

        for (int num : list) {
            if (num < number) {
                minNear = num; // Kendinden küçük en büyük sayıyı buluyoruz
            } else if (num > number && maxNear == null) {
                maxNear = num; // Kendinden büyük en küçük sayıyı buluyoruz (ilk büyük eleman)
            }
        }

        System.out.println("Girilen sayı: " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (minNear != null ? minNear : "Yok"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (maxNear != null ? maxNear : "Yok"));
    }
}