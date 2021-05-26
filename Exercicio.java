import java.util.Scanner;

public class Exercicio {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);     //ler teclado   

        double base, altura, area;

        //entrada
        System.out.println("Digite a base");
        base = teclado.nextDouble();

        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        //processamento
        System.out.println("area");
        area = (base*altura);

        //saida
        System.out.println("area do triangulo" + area);

    }
}