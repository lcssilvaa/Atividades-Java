import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int respostasPositivas = 0;

        String[] lista = {"Telefonou para a vítima? Sim ou Não",
        "Esteve no local do crime? Sim ou Não",
        "Mora perto da vítima? Sim ou Não",
                "Devia para a vítima? Sim ou Não",
        "Já trabalhou com a vítima? Sim ou Não"};

                for(String pergunta : lista) {
                    System.out.println(pergunta);
                    String resposta = sc.nextLine().trim().toLowerCase();

                if(resposta.equalsIgnoreCase("Sim")) {
                    respostasPositivas++;
                    }
                }
                sc.close();

                    String classificacao;
                    if (respostasPositivas == 5) {
                        classificacao = "Assassino";
                    } else if (respostasPositivas > 3) {
                        classificacao = "Cúmplice";
                    } else if (respostasPositivas == 2) {
                        classificacao = "Suspeito";
                    } else {
                        classificacao = "Inocente";
                    }

                    System.out.println("\nClassificação final: " + classificacao);
                }
        }