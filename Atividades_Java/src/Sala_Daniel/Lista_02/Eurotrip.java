package Sala_Daniel.Lista_02;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Eurotrip {

    public static void main(String[] args) {
        
        String[] nome = {"Alemanha", "Portugal", "Itália"};
        float[] preco = new float[3];
        float totalViagem = 0;  

    Scanner sc = new Scanner(System.in);

    Locale localeBR = Locale.of("pt", "BR");
    NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBR);

    for (int x = 0; x < 3; x++) {
        System.out.println("Qual o valor da viagem para " + nome[x]);
        preco[x] = sc.nextFloat();

        totalViagem += preco[x];
        }

        System.out.println("Quantas pessoas irão nessa viagem?");
        int pessoas = sc.nextInt();
        
        float valorTotal = totalViagem * pessoas;
        String vTotalFormatado = formatador.format(valorTotal);

    System.out.println("O valor total a pagar pela viagem é: " + vTotalFormatado);

    sc.close();
    }
}