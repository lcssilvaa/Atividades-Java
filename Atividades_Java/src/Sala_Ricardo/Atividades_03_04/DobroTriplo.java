package Sala_Ricardo.Atividades_03_04;

import java.util.Scanner;

public class DobroTriplo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        float n1 = sc.nextFloat();

        System.out.println("O dobro de " + n1 + " é: " + (n1 * 2));
        System.out.println("O triplo de " + n1 + " é: " + (n1 * 3));
        System.out.println("A terça parte de " + n1 + " é: " + (n1 / 3));

        sc.close();
    }
    
}
