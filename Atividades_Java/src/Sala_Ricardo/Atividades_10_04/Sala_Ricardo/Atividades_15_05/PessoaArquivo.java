package Sala_Ricardo.Atividades_15_05;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class PessoaArquivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lê os dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = entrada.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = entrada.nextLine();

        // Cria o objeto Pessoa
        Pessoa pessoa = new Pessoa(nome, cpf, telefone);

        // Mostra os dados na tela
        System.out.println("\n--- Dados Armazenados ---");
        System.out.println(pessoa.exibirDados());

        // Salva os dados em um arquivo
        try {
            FileWriter escritor = new FileWriter("dados_pessoa.bat", true); // true = modo de adicionar
            escritor.write(pessoa.exibirDados() + "\n\n");
            escritor.close();
            System.out.println("✅ Dados salvos com sucesso no arquivo 'dados_pessoa.bat'!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }

        entrada.close();
    }
}

// Classe Pessoa
