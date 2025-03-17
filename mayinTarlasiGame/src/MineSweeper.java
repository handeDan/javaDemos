import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private static String[][] gameBoard;
    private static String[][] playerBoard;
    private static boolean[][] mineBoard;
    private static int rows;
    private static int cols;
    private static int totalMines;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");

        // Satır ve sütun boyutlarını kullanıcıdan al
        do {
            System.out.print("Satır Giriniz : ");
            rows = sc.nextInt();
            System.out.print("Sütun Giriniz : ");
            cols = sc.nextInt();

            if (rows < 2 || cols < 2) {
                System.out.println("Boyutlar en az 2x2 olmalıdır. Lütfen tekrar girin.");
            }
        } while (rows < 2 || cols < 2);

        // Mayın sayısını hesapla
        int totalCells = rows * cols;
        totalMines = totalCells / 4;

        // Oyun tahtasını başlat
        gameBoard = new String[rows][cols];
        playerBoard = new String[rows][cols];
        mineBoard = new boolean[rows][cols];

        // Tahtayı başlat
        initializeBoard();

        // Oyunu başlat
        playGame(sc);
    }

    // Tahtayı ve mayınları başlat
    private static void initializeBoard() {
        // Tüm oyuncu tahtasını "-" ile doldur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                playerBoard[i][j] = "-";
            }
        }

        // Mayınları rastgele yerleştir
        Random rand = new Random();
        int mineCount = 0;

        while (mineCount < totalMines) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);

            if (!mineBoard[r][c]) {
                mineBoard[r][c] = true;
                mineCount++;
            }
        }

        // Gerçek oyun tahtasını (gameBoard) doldur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineBoard[i][j]) {
                    gameBoard[i][j] = "*";
                } else {
                    gameBoard[i][j] = Integer.toString(countAdjacentMines(i, j));
                }
            }
        }
    }

    // Bir hücrenin komşularındaki mayınları say
    private static int countAdjacentMines(int row, int col) {
        int mineCount = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int r = row + i;
                int c = col + j;

                if (r >= 0 && r < rows && c >= 0 && c < cols && mineBoard[r][c]) {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }

    // Oyunu oynat
    private static void playGame(Scanner sc) {
        boolean gameOver = false;
        int uncoveredCells = 0;

        while (!gameOver) {
            printBoard();
            System.out.print("Satır Giriniz : ");
            int row = sc.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = sc.nextInt();

            if (row < 0 || row >= rows || col < 0 || col >= cols) {
                System.out.println("Geçersiz koordinat. Lütfen tekrar girin.");
                continue;
            }

            if (playerBoard[row][col].equals("-")) {
                if (mineBoard[row][col]) {
                    System.out.println("Game Over!!");
                    gameOver = true;
                    printBoard();
                } else {
                    uncoverCell(row, col);
                    uncoveredCells++;

                    // Kazanma kontrolü
                    if (uncoveredCells == (rows * cols - totalMines)) {
                        System.out.println("Oyunu Kazandınız!");
                        gameOver = true;
                        printBoard();
                    }
                }
            } else {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
            }
        }
    }

    // Seçilen hücreyi aç
    private static void uncoverCell(int row, int col) {
        if (playerBoard[row][col].equals("-")) {
            playerBoard[row][col] = gameBoard[row][col];

            // Eğer etrafında mayın yoksa, komşu hücreleri de aç
            if (gameBoard[row][col].equals("0")) {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int r = row + i;
                        int c = col + j;

                        if (r >= 0 && r < rows && c >= 0 && c < cols) {
                            uncoverCell(r, c);
                        }
                    }
                }
            }
        }
    }

    // Tahtayı yazdır
    private static void printBoard() {
        System.out.println("===========================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(playerBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
