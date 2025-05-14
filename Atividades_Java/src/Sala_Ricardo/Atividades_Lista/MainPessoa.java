package Sala_Ricardo.Atividades_Lista;

public class MainPessoa { 

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();

        p1.nome = "Lucas";
        p1.idade = 19;

        Pessoa p2 = new Pessoa();

        p2.nome = "Tiago";
        p2.idade = 21;

        System.out.println(p1.apresentar());
        System.out.println(p2.apresentar());
}
}
