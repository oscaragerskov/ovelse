import java.util.Scanner;

public class Sekunder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("indtast antal sekunder:");
        int s= input.nextInt();
        int dag= s/(24*3600);
        s= s%(24*3600);
        int time= s/3600;
        s%= 3600;
        int min= s/60;
        s%= 60;
        int sek= s;

        System.out.println("dit resultat:");
        System.out.println(dag + "" + "dage" + time + "" + "timer" + min + "" + "minutter" + sek + "" + "sekunder");

    }
}