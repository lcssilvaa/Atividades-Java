import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] resposta = new double[12];
        double soma = 0;

        String[] perguntas = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho","Agosto","Setembro","Outubro",
                "Novembro", "Dezembro"};

        for (int x = 0; x < perguntas.length; x++) {
            System.out.println("Qual a temperatura do mês de " + perguntas[x]);
            resposta[x] = sc.nextDouble();

            soma += resposta[x];
        }
            double media = soma/12;

        System.out.println("A média das temperaturas é igual a " + media + "\n");

        for(int y = 0; y < perguntas.length; y++) {
            System.out.println("Temperatura do mês de " + perguntas[y] + " -> " + resposta[y]);
        }
    }
}
