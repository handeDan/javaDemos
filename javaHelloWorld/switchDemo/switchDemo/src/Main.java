public class Main {
    public static void main(String[] args) {
        char grade = 'H';
        switch (grade) {
            case 'A': //case durum demek
                System.out.println("Mükemmel : Geçtiniz!");
                break; //kodu bitirir.
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz!");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz!");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz!");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız.");
                break;
            default: // belirtilen caseler dışında karakter girildiğinde verilecek olan uyarı.
                System.out.println("Geçersiz Not Girdiniz.");
        }
        //ctrl+alt+l intellij idea format shortcut.
    }
}