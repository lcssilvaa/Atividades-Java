package Sala_Ricardo.Atividades_03_04;

import java.util.Scanner;

public class MaiorNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        float [] valor = new float[3];
        float maior = 0;
        String[] letras = new String[] {"A", "B", "C"};

        for(int x = 0; x < 3; x++) {
        System.out.println("Digite o valor de " + letras[x]);
        valor[x] = sc.nextFloat();
    
        if(x == 0) {
           maior = valor[x]; 
        }
        if(valor [x] > maior) {
            maior = valor[x];
        }
    }
        System.out.println("O maior número é: " + maior);
         
    }
}
