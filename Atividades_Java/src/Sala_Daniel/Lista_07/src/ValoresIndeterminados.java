import java.util.ArrayList;
import java.util.Scanner;

public class ValoresIndeterminados {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite seus números (digite um número negativo para finalizar):");

        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            numeros.add(num);
            soma += num;
        }

        sc.close();

        if (!numeros.isEmpty()) {
            double media = (double) soma / numeros.size();
            System.out.println("\nNúmeros digitados: " + numeros);
            System.out.println("A soma dos valores é igual a: " + soma);
            System.out.printf("A média dos valores é igual a: %.2f%n", media);

            System.out.println("\nValores acima da média:");
            for (int num : numeros) {
                if (num > media) {
                    System.out.println("- " + num);
                }
            }

            System.out.println("\nValores abaixo de 7:");
            for (int num : numeros) {
                if (num < 7) {
                    System.out.println("- " + num);
                }
            }
        } else {
            System.out.println("\nNenhum número foi digitado.");
        }
    }
}
