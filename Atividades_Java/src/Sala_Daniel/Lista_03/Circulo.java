package Sala_Daniel.Lista_03;
import java.util.Scanner;


public class Circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio;
        int escolha;

        System.out.println("Qual operação você quer calcular?");
        System.out.println("\n1. Perímetro do círculo");
        System.out.println("2. Área do círculo");
        System.out.println("3. Volume da esfera");
        escolha = sc.nextInt();

        while(escolha < 1 || escolha > 3) {
            System.out.println("Valor inválido! Tente novamente");
            escolha = sc.nextInt();
        }

        if (escolha == 1) {
        System.out.println("Você escolheu o perímetro! Digite o valor do raio:");
        raio = sc.nextDouble(); 
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O valor do perímero do círculo é: " + perimetro);    
        }

        else if (escolha == 2) {
        System.out.println("Você escolheu a área do círculo! Digite o valor do raio:");
        raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("O valor da área do círculo é: " + area);    
        }

        else if (escolha == 3) {
        System.out.println("Você escolheu o volume da esfera! Digite o valor do raio:");
        raio = sc.nextDouble();
        double volume = (4.0/3) * Math.PI * Math.pow(raio, 3);
        System.out.println("O volume do círculo é: " + volume);
        }
        sc.close();
    }
}
