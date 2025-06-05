package Sala_Ricardo.Atividades_15_05;

public class Pessoa {
    String nome;
    String cpf;
    String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String exibirDados() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }
}

    

