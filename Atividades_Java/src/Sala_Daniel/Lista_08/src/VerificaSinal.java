import java.util.Scanner;

public class VerificaSinal {
    public static char verificarNumero(int num) {
        return (num > 0) ? 'P' : 'N';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("Resultado: " + verificarNumero(numero));
    }
}
