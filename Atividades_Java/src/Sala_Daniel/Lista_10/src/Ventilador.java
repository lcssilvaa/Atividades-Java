// Ventilador.java
public class Ventilador {
    String marca;
    int potenciaWatts;
    int numeroPas;
    int velocidadesDisponiveis;
    String tipo; // De mesa, de teto
    boolean ligado;
    int velocidadeAtual;

    public Ventilador(String marca, int potenciaWatts, int numeroPas, int velocidadesDisponiveis, String tipo) {
        this.marca = marca;
        this.potenciaWatts = potenciaWatts;
        this.numeroPas = numeroPas;
        this.velocidadesDisponiveis = velocidadesDisponiveis;
        this.tipo = tipo;
        this.ligado = false; // Estado inicial
        this.velocidadeAtual = 0;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("O ventilador " + marca + " ligou.");
            this.ligado = true;
            this.velocidadeAtual = 1; // Liga na velocidade mínima
        } else {
            System.out.println("O ventilador " + marca + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("O ventilador " + marca + " desligou.");
            this.ligado = false;
            this.velocidadeAtual = 0;
        } else {
            System.out.println("O ventilador " + marca + " já está desligado.");
        }
    }

    public void ajustarVelocidade(int novaVelocidade) {
        if (ligado && novaVelocidade > 0 && novaVelocidade <= velocidadesDisponiveis) {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("Velocidade do ventilador " + marca + " ajustada para " + velocidadeAtual + ".");
        } else if (!ligado) {
            System.out.println("Não é possível ajustar velocidade, o ventilador " + marca + " está desligado.");
        } else {
            System.out.println("Velocidade " + novaVelocidade + " inválida para este ventilador. Velocidades disponíveis: 1 a " + velocidadesDisponiveis + ".");
        }
    }

    public void girar() {
        if (ligado) {
            System.out.println("O ventilador " + marca + " está girando.");
        } else {
            System.out.println("Não é possível girar, o ventilador " + marca + " está desligado.");
        }
    }
}