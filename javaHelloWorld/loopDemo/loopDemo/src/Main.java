public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 1; i <= 10; i++) { // i++ ve i+1 aynı anlama gelip 1 arttır demek.
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        for (int i = 2; i <= 10; i += 2) { // i++ ve i+1 aynı anlama gelip 1 arttır demek.
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        //While
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti.");

        //Do-While döngüs
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 11);
        System.out.println("Do-While döngüsü bitti.");
    }
}