import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     *
//    ***
//   *****
//  *******
// *********
//***********
            Scanner klavye = new Scanner(System.in);
            System.out.println("Please enter a number :");
            int n = klavye.nextInt();

            for (int i = 0; i <= n ; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                    System.out.println(" ");
            }
        }
    }