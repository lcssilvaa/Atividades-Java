package Sala_Ricardo.Atividades_03_04;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
    
    int n1; 
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número");
        n1 = sc.nextInt();

    if(n1 % 2 == 0) {
        System.out.println("O número é par!");
        }

    else {
        System.out.println("O número é ímpar!");
        }
    } 
}
