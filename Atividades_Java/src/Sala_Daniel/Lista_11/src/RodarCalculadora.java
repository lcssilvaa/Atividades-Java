import java.util.Scanner;

public class RodarCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a calculadora em Java!");

        System.out.println("\nEscolha as opções abaixo:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potência");
        System.out.println("6. Raiz");
        System.out.println("\n0. Sair do Sistema");

        int num = sc.nextInt();

        System.out.print("Escolha o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("\nEscolha o segundo número: ");
        double num2 = sc.nextDouble();

        switch (num) {
            case 1:
                System.out.println("Resultado: " + calculadora.adicao(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + calculadora.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + calculadora.multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + calculadora.divisao(num1, num2));
                break;
            case 5:
                System.out.println("Resultado: " + calculadora.potencia(num1, num2));
                break;
            case 6:
                System.out.println("Resultado n° 1: " + calculadora.raiz(num));
                System.out.println("Resultado n° 2: " + calculadora.raiz2(num2));
                break;
            case 0:
                break;
            default:
        }
    }
}