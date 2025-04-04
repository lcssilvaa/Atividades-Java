package Sala_Ricardo;

import java.util.Scanner;

public class Teste {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor para A");
        int a = sc.nextInt();

        System.out.println("Digite o valor para B");
        int b = sc.nextInt();

        if (a != b) {
            System.out.println("A é diferente de B");
        }

        if (a == b) {
            System.out.println("A é igual a B");
        }
    }

}
