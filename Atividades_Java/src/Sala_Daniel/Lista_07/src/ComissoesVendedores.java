import java.util.ArrayList;
import java.util.Scanner;

public class ComissoesVendedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<>();
        int[] contadores = new int[9];

        System.out.println("Digite as vendas brutas de cada vendedor (Digite 0 para sair)");

        while (true) {
            double vendas = scanner.nextDouble();
            if (vendas == 0) {
                break;
            }

            double salario = 200 + (0.09 * vendas);
            salarios.add(salario);
        }

        scanner.close();

        for (double salario : salarios) {
            if (salario >= 200 && salario <= 299) {
                contadores[0]++;
            } else if (salario <= 399) {
                contadores[1]++;
            } else if (salario <= 499) {
                contadores[2]++;
            } else if (salario <= 599) {
                contadores[3]++;
            } else if (salario <= 699) {
                contadores[4]++;
            } else if (salario <= 799) {
                contadores[5]++;
            } else if (salario <= 899) {
                contadores[6]++;
            } else if (salario <= 999) {
                contadores[7]++;
            } else {
                contadores[8]++;
            }
        }

        System.out.println("\nDistribuição dos salários:");
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);
    }
}
