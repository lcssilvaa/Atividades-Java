package Sala_Ricardo.Atividades_Lista;

import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int velocidade, veiculos;
        int totalMultados = 0;

        System.out.println("Quantos veículos passou na estrada?");
        veiculos = sc.nextInt();

        for (int i = 1; i <= veiculos; i++) {
            System.out.print("Digite a velocidade do veículo " + i + ": ");
            velocidade = sc.nextInt();

            if (velocidade > 120) {
                System.out.println("Veículo " + i + " foi multado! Sua velocidade foi de: " + velocidade);
                totalMultados++;
            }
            else {
                System.out.println("Você não foi multado!");
            }
        }

        System.out.println("Total de veículos que passaram no radar: " + veiculos);
        System.out.println("Total de veículos multados " + totalMultados);
    }
}
