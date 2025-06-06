// Bicicleta.java
public class Bicicleta {
    String cor;
    String tipo; // Montanha, Urbana
    int numeroMarchas;
    double tamanhoAro;
    boolean emMovimento;
    int marchaAtual;

    public Bicicleta(String cor, String tipo, int numeroMarchas, double tamanhoAro) {
        this.cor = cor;
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.tamanhoAro = tamanhoAro;
        this.emMovimento = false; // Estado inicial
        this.marchaAtual = 1;
    }

    public void pedalar() {
        if (!emMovimento) {
            System.out.println("A bicicleta " + cor + " está sendo pedalada.");
            this.emMovimento = true;
        } else {
            System.out.println("A bicicleta " + cor + " já está em movimento.");
        }
    }

    public void frear() {
        if (emMovimento) {
            System.out.println("A bicicleta " + cor + " está freando.");
            this.emMovimento = false;
        } else {
            System.out.println("A bicicleta " + cor + " já está parada.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha > 0 && novaMarcha <= numeroMarchas) {
            this.marchaAtual = novaMarcha;
            System.out.println("Marcha da bicicleta " + cor + " trocada para " + marchaAtual + ".");
        } else {
            System.out.println("Marcha " + novaMarcha + " inválida para esta bicicleta. Marchas disponíveis: 1 a " + numeroMarchas + ".");
        }
    }

    public void parar() {
        if (emMovimento) {
            System.out.println("A bicicleta " + cor + " parou.");
            this.emMovimento = false;
        } else {
            System.out.println("A bicicleta " + cor + " já está parada.");
        }
    }
}