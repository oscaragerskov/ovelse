import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indtast dit password");
        String password = input.nextLine();
        final int max = 8;
        final int min = 5;
        if (password.length() >= max) {
            System.out.println("dit password er godkendt");
        }
        if (password.length() <= min) {
            System.out.println("dit password er godkendt");
        } else {
            System.out.println("dit password har ikke følgende");
            if (password.length() < max) {
                System.out.println("Password er for langt");
            }
            if (password.length() > min) {
                System.out.println("password er for kort");
            }
        }
    }
}
