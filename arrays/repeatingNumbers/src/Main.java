public class Main {
    // Verilen değeri dizide arayan fonksiyon
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 6, 4, 8, 10, 6, 2, 12, 14, 8};

        int[] duplicate = new int[list.length]; // Tekrar eden sayıları tutan dizi
        int startIndex = 0;

        // Dizi elemanlarını kontrol et
        for(int i = 0; i < list.length; i++) {
            for(int j = i + 1; j < list.length; j++) { // Çift kontrol
                if(list[i] == list[j]) {
                    // Eğer değeri zaten duplicate dizisinde eklemediysek
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        // Tekrar eden sayıları ekrana yazdır
        System.out.println("Tekrar eden sayılar:");
        for(int value : duplicate) {
            if(value != 0) { // Boş değerleri atla
                System.out.println(value);
            }
        }
    }
}
