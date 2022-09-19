import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declaring
        Scanner input = new Scanner(System.in);

        //inputs
        System.out.println("Indsæt double i denne formel ( A + B )^2");

        System.out.print("A --> ");
        double A = input.nextInt();

        System.out.print("B --> ");
        double B = input.nextInt();
        input.close();

        System.out.println("Dine værdier er: " + A + " + " + B + "x");

        //Math
        //A + C + B
        double A2 = Math.pow(A, 2);
        double B2 = Math.pow(B, 2);
        double C = 2 * (A * B);

        //final
        System.out.print("Dit resultat: ");
        System.out.println(A2 + " + "+ C + "x" + " + "+ B2+ "x^2");
    }
}
