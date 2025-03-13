import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Year: ");
        year = input.nextInt();

        boolean isLeap = false;
        
        if(year%4 == 0) {
            if(year%100 != 0 || year%400 == 0){
                isLeap =true;
            }
        }
        
        if(isLeap){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    
    }
}