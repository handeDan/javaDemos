import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.println("Your username : ");
        username = input.nextLine();

        System.out.println("Your password : ");
        password = input.nextLine();

        if(username.equals("correctUsername") && password.equals("correctPassword")) {
            System.out.println("Succesfully logged in!");
        } else {
            System.out.println("Wrong username / password.");
        }

        //updating password:
        if(!password.equals("correctPassword")) {
            int select;

            System.out.println("Would you like to update your password?: 1-YES 2-NO");
            select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1:
                    System.out.println("Please enter a valid password: ");
                    String newPassword = input.nextLine();

                    if (newPassword.isEmpty()) {
                        System.out.println("Password cannot be empty. Please enter a valid password.");
                    } else if (newPassword.equals(password)) {
                        System.out.println("New password can't be the same as the current password. Please enter another password.");
                    } else {
                        password = newPassword; // Şifre güncellendi
                        System.out.println("Your password is updated!");
                    }
                    break;
                case 2:
                    System.out.println("Your password is not updated.");
                    break;
                default:
                    System.out.println("You choose an unacceptable select.");

            }
        }
    }
}