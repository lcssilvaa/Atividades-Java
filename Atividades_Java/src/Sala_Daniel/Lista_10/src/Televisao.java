// Televisao.java
public class Televisao {
    String marca;
    double tamanhoTelaPolegadas;
    String resolucao;
    String tipo; // Smart/LED
    int voltagem;
    boolean ligada;
    int canalAtual;
    int volume;

    public Televisao(String marca, double tamanhoTelaPolegadas, String resolucao, String tipo, int voltagem) {
        this.marca = marca;
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
        this.resolucao = resolucao;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.ligada = false; // Estado inicial
        this.canalAtual = 1;
        this.volume = 50; // Volume padrão
    }

    public void ligar() {
        if (!ligada) {
            System.out.println("A televisão " + marca + " ligou.");
            this.ligada = true;
        } else {
            System.out.println("A televisão " + marca + " já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            System.out.println("A televisão " + marca + " desligou.");
            this.ligada = false;
        } else {
            System.out.println("A televisão " + marca + " já está desligada.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            System.out.println("Mudando para o canal " + novoCanal + " na televisão " + marca + ".");
            this.canalAtual = novoCanal;
        } else {
            System.out.println("Não é possível mudar canal, a televisão " + marca + " está desligada.");
        }
    }

    public void ajustarVolume(String direcao) { // "aumentar" ou "diminuir"
        if (ligada) {
            if (direcao.equalsIgnoreCase("aumentar")) {
                this.volume = Math.min(100, this.volume + 5);
                System.out.println("Volume da televisão " + marca + " aumentado para " + volume + ".");
            } else if (direcao.equalsIgnoreCase("diminuir")) {
                this.volume = Math.max(0, this.volume - 5);
                System.out.println("Volume da televisão " + marca + " diminuído para " + volume + ".");
            } else {
                System.out.println("Direção de volume inválida. Use 'aumentar' ou 'diminuir'.");
            }
        } else {
            System.out.println("Não é possível ajustar volume, a televisão " + marca + " está desligada.");
        }
    }

    public void conectarWiFi(String rede) {
        if (ligada) {
            if (this.tipo.equalsIgnoreCase("Smart")) {
                System.out.println("Conectando a televisão " + marca + " à rede WiFi '" + rede + "'.");
            } else {
                System.out.println("A televisão " + marca + " não é Smart e não possui conexão WiFi.");
            }
        } else {
            System.out.println("Não é possível conectar WiFi, a televisão " + marca + " está desligada.");
        }
    }
}