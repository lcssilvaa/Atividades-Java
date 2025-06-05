import java.util.Scanner;

public class CalculaImposto {
    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * (taxaImposto / 100));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = scanner.nextDouble();
        System.out.print("Digite o custo do item: ");
        double custo = scanner.nextDouble();
        scanner.close();

        System.out.printf("O preço final com imposto é: %.2f%n", somaImposto(taxa, custo));
    }
}