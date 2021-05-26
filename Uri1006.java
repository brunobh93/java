import java.util.Scanner;

public class Uri1006{
    public static void main(String[] args){

        double A, B, C, MEDIA;
        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));
    }
}