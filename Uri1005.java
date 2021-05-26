import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }
}