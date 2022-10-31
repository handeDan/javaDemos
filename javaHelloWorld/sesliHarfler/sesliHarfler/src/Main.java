public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " : Kalın sesli harf.");
                break;
            default:
                System.out.println(harf + " : İnce sesli harf.");


        }
    }
}