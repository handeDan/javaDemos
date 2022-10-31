import java.awt.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "   Bugün hava çok güzel.   ";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!"));
        System.out.println(mesaj.startsWith("B")); //hangi char ile başlar?
        System.out.println(mesaj.endsWith("l")); //hangi char ile biter?
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //bu karakter baştan kaçıncı char?
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e')); //bu karakter sondan başlar ama sağdan sayar.
        System.out.println(mesaj.lastIndexOf('a')); //bu karakter sondan başlar ama sağdan sayar.
*/
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(6, 10));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);


        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());

    }
}