import java.util.Scanner;
public class Distanceformlen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Indsæt dine værdier i formlen: dist(P,l)=((a*x1+b-y1*c))/(kvadratrod a^2+b)");

        System.out.println("indsæt y værdien til linje");
        double x2 = input.nextInt();

        System.out.println("indsæt x værdien til linje");
        double y2 = input.nextInt();

        System.out.println("indsæt a værdien til punkt");
        double a = input.nextInt();

        System.out.println("indsæt b værdien til punkt");
        double b = input.nextInt();

        System.out.println("indsæt c værdien til punkt");
        double c = input.nextInt();

        System.out.println("Dit resultat: ");
        System.out.println(Math.abs((a*x2+b*y2+c))/Math.sqrt(a*a+b*b));
 

