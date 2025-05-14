import java.util.Scanner;

public class ExemploComScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número (0 para sair, 999 para parar imediatamente): ");
            numero = scanner.nextInt();

            if (numero == 999) {
                System.out.println("Número 999 detectado. Encerrando...");
                break; // encerra o loop imediatamente
            }

            if (numero < 0) {
                System.out.println("Número negativo ignorado.");
                continue; // pula o restante do loop
            }

            if (numero == 0) {
                System.out.println("Você escolheu sair.");
                break;
            }

            System.out.println("Você digitou: " + numero);
        }

        scanner.close();
    }
}
