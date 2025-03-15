import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int length = input.nextInt();

        int[] arr = new int[length];

        System.out.print("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < length; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sıralama : ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}