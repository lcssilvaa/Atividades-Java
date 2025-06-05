package Sala_Daniel.Atividades_na_Sala;

public class ProdutoMain {

    public static void main(String[] args) {

    Produto produto = new Produto();

    produto.nome = "Leite";
    produto.preco = 5.99;
    produto.quantidade = 4;
    produto.codigoBarras = 1234556677;
    produto.localArmazenado = "Estoque";

    produto.mostrarDados();

    }
    
}
