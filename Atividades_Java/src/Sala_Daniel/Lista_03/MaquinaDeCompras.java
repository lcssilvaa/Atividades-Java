package Sala_Daniel.Lista_03;
import java.util.Scanner;

public class MaquinaDeCompras {

    public static void main(String[] args) {
        
        String[] itens = {"Salgadinhos", "Doces", "Sucos", "Refrigerantes"};
        double[] precos = {10.00, 15.00, 5.00, 7.00};
        double valorPago = 0, totalCompra = 0;
        
        Scanner sc = new Scanner(System.in);

        // Exibição dos itens e preços
        System.out.println("Itens disponíveis para compra:");
        for (int x = 0; x < itens.length; x++) {
            System.out.println((x + 1) + ". " + itens[x] + " - R$ " + precos[x]);
        }

        // Escolha de itens
        while (true) {
            System.out.println("\nEscolha um item para comprar: 1 a " + itens.length + " ou digite 0 para finalizar");
            int escolha = sc.nextInt();

            if (escolha == 0) {
                break; 
            }

            if (escolha < 1 || escolha > itens.length) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            totalCompra += precos[escolha - 1];
            System.out.println("Você escolheu: " + itens[escolha - 1] + " - R$ " + precos[escolha - 1]);
        }

        System.out.println("O valor total foi de: R$ " + String.format("%.2f", totalCompra));

        // Definindo as cédulas e a quantidade de cédulas
        double[] cedulas = {50.00, 20.00, 10.00, 5.00, 2.00, 1.00};
        int[] quantidades = new int[cedulas.length];

        // Solicitar pagamento
        while (valorPago < totalCompra) {
            System.out.println("Como você deseja pagar?:");
            
            // Exibe as opções de cédulas
            for (int y = 0; y < cedulas.length; y++) {
                System.out.println((y + 1) + ". R$ " + cedulas[y]);
            }

            System.out.print("Escolha a cédula (1 a " + cedulas.length + "): ");
            int cedulaEscolhida = sc.nextInt();

            if (cedulaEscolhida < 1 || cedulaEscolhida > cedulas.length) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.print("Quantas cédulas de R$ " + cedulas[cedulaEscolhida - 1] + " você deseja pagar? ");
            int quantidadeCedula = sc.nextInt();

            valorPago += cedulas[cedulaEscolhida - 1] * quantidadeCedula;
            System.out.println("Você pagou R$ " + String.format("%.2f", cedulas[cedulaEscolhida - 1] * quantidadeCedula));

            System.out.println("Valor pago até agora: R$ " + String.format("%.2f", valorPago));
        }

        // Verificando o troco
        double troco = valorPago - totalCompra;
        System.out.println("\nPagamento efetuado com sucesso!");
        System.out.println("Valor total: R$ " + String.format("%.2f", totalCompra));
        System.out.println("Valor pago: R$ " + String.format("%.2f", valorPago));
        System.out.println("Troco a ser devolvido: R$ " + String.format("%.2f", troco));

        sc.close();
    }
}