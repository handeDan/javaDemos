public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[5][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || i == 4) { // Üst, orta ve alt çizgi
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) { // Sol ve sağ kenarlar
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   "; // Boşluk ekleyerek hizalamayı düzeltiyoruz
                }
            }
        }

        // Ekrana Yazdırma
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
