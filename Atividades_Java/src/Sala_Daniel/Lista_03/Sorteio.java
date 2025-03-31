package Sala_Daniel.Lista_03;
import java.util.Scanner;
import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int n1, n2;

        System.out.println("Escolha um número:");
        n1 = sc.nextInt();

        System.out.println("Escolha outro número:");
        n2 = sc.nextInt();

        int nSorteado = rm.nextInt();

        if (nSorteado % 2 == 0) {
            System.out.println("O número sorteado é par, e foi: " + nSorteado);
        }
        else {
            System.out.println("O número sorteado é ímpar, e foi: " + nSorteado);
        }
        
        int maior = Math.max(n1, Math.max(n2, nSorteado));
        int menor = Math.min(n1, Math.max(n2, nSorteado));

        System.out.println("O menor número é o: " + menor);
        System.out.println("O maior número é o: " + maior);

        sc.close();

        }
        
    }
    

