import java.util.Scanner;

public class SomaTresNumeros {
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite três números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        System.out.println("A soma dos números é: " + soma(num1, num2, num3));
    }
}
