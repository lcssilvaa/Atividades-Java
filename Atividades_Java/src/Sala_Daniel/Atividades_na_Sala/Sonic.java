package Sala_Daniel.Atividades_na_Sala;
import java.util.Scanner;

public class Sonic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int esperanca = 0, medo = 0, soma = 0, confianca = 0, desanimo = 0, determinacao = 0, incerteza = 0;

        System.out.println("Quantos novos aliados Sonic, Knuckles e Tails?");
        int aliados = sc.nextInt();

        if(aliados > 0) {
            esperanca += 40;
        }

        else {
            medo += 40;
        }

        int [] pontos = new int[3];
        String [] desafio = {"Desafio 1", "Desafio 2", "Desafio 3"};

        
        for(int x = 0; x < 3; x++) {
            System.out.println("Quantos pontos vocês fizeram no " + desafio[x] + " ? (de 0 a 10)");
            pontos [x] = sc.nextInt();

            while (pontos[x] > 10) {
                System.out.println("O número é maior que 10!");
                System.out.println("Quantos pontos vocês fizeram no " + desafio[x] + " ? (de 0 a 10)");
                pontos [x] = sc.nextInt();
            }

            soma += pontos[x];
        }

        if(soma >= 7 && soma <= 10) {
            confianca += 60;
            
        } else {
            desanimo += 60;
            
        }
    
           while(true) {
            System.out.println("\nDas 12 estratégias diferentes, quantas a equipe conseguiu analisar?");
            int estrategias = sc.nextInt();

            if (estrategias > 12) {
                System.out.println("Número inválido, precisa ser menor ou igual a 12");
                continue;
            } else {
                determinacao = estrategias * 10;
                incerteza = (12 - estrategias) * 10;
                break;
            }
       }

            System.out.println("Os pontos de esperança é igual a: " + esperanca);
            System.out.println("Os pontos de medo é igual a: " + medo);
            System.out.println("Os pontos de confiança é igual a: " + confianca);
            System.out.println("Os pontos de desânimo é igual a: " + desanimo);
            System.out.println("Os pontos de determinação é igual a: " + determinacao);
            System.out.println("Os pontos de incerteza é igual a: " + incerteza);

            int emocoesPositivas = esperanca + confianca + determinacao;
            int emocoesNegativas = medo + desanimo + incerteza;

            if (emocoesPositivas > emocoesNegativas) {
                System.out.println("\nO Shadow foi derrotado");
            }
            else {
                System.out.println("\nO Shadow venceu o time do Sonic");
            }

            sc.close();
        }
}
