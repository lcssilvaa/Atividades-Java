public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    String genero;
    String editora;
    boolean aberto;
    int paginaAtual;

    public Livro(String titulo, String autor, int numeroPaginas, String genero, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.editora = editora;
        this.aberto = false; // Estado inicial
        this.paginaAtual = 0; // 0 significa fechado ou não iniciado
    }

    public void abrir() {
        if (!aberto) {
            System.out.println("O livro '" + titulo + "' foi aberto.");
            this.aberto = true;
            this.paginaAtual = 1; // Ao abrir, geralmente começa na primeira página
        } else {
            System.out.println("O livro '" + titulo + "' já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            System.out.println("O livro '" + titulo + "' foi fechado.");
            this.aberto = false;
            this.paginaAtual = 0; // Ao fechar, a página atual é redefinida
        } else {
            System.out.println("O livro '" + titulo + "' já está fechado.");
        }
    }

    public void ler() {
        if (aberto) {
            if (paginaAtual > 0) {
                System.out.println("Lendo o livro '" + titulo + "' na página " + paginaAtual + ".");
            } else {
                System.out.println("Começando a ler o livro '" + titulo + "' (página 1).");
                this.paginaAtual = 1;
            }
        } else {
            System.out.println("Não é possível ler, o livro '" + titulo + "' está fechado.");
        }
    }

    public void marcarPagina(int pagina) {
        if (aberto && pagina > 0 && pagina <= numeroPaginas) {
            this.paginaAtual = pagina;
            System.out.println("Página " + pagina + " marcada no livro '" + titulo + "'.");
        } else if (!aberto) {
            System.out.println("Não é possível marcar página, o livro '" + titulo + "' está fechado.");
        } else {
            System.out.println("Página " + pagina + " inválida para o livro '" + titulo + "'. Total de páginas: " + numeroPaginas);
        }
    }
}