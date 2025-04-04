package Sala_Ricardo.Atividades_03_04;

import java.util.Scanner;

public class SucessorAntecessor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("Digite um número");
        n1 = sc.nextInt();

        System.out.println("O antecessor de " + n1 + " é: " + (n1 - 1) + " e o sucessor é: " + (n1 + 1));
    }
    
}
