package Sala_Daniel.Lista_02;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class LitroGasolina {

    public static void main(String[] args) {
        
    double pGasolina;
    double  litros;
    Scanner sc = new Scanner(System.in);

    Locale localeBR = Locale.of("pt", "BR");
    NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBR);

    System.out.println("Qual o preço da gasolina?");
    pGasolina = sc.nextDouble();

    System.out.println("Quantos litros foi vendido ao cliente?");
    litros = sc.nextDouble();

    double valorPagamento = pGasolina * litros;

    String formatadoValor = formatador.format(valorPagamento);

    System.out.println("O preço a pagar é: " + formatadoValor);

    sc.close();
    }
}