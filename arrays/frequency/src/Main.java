public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        for(int i = 0; i<arr.length; i++) {
            int count = 1;

            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // Eşleşen elemanı -1 yaparak tekrar sayılmasını engelle
                }
            }

            // Eğer sayı -1 değilse, yani daha önce yazdırılmadıysa, sonucu yazdır
            if(arr[i] != -1){
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}