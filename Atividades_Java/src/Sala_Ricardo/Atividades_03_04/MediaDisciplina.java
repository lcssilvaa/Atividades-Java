package Sala_Ricardo.Atividades_03_04;

import java.util.Scanner;

public class MediaDisciplina {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float n1, n2;

        System.out.println("Digite a primeira nota:");
        n1 = sc.nextFloat();

        System.out.println("Digite a segunda nota:");
        n2 = sc.nextFloat();

        float media = (n1 + n2) / 2;

        System.out.println("A média entre as notas é: " + media);

        }
    }
