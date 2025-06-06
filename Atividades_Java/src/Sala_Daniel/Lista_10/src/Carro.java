// Carro.java
public class Carro {
    String cor;
    String marca;
    String modelo;
    int ano;
    String tipoCombustivel;
    double quilometragem;
    boolean ligado;

    public Carro(String cor, String marca, String modelo, int ano, String tipoCombustivel, double quilometragem) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.ligado = false; // Estado inicial
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("O carro " + marca + " " + modelo + " ligou.");
            this.ligado = true;
        } else {
            System.out.println("O carro " + marca + " " + modelo + " já está ligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
        } else {
            System.out.println("Não é possível acelerar, o carro " + marca + " " + modelo + " está desligado.");
        }
    }

    public void frear() {
        if (ligado) {
            System.out.println("O carro " + marca + " " + modelo + " está freando.");
        } else {
            System.out.println("Não é possível frear, o carro " + marca + " " + modelo + " está desligado.");
        }
    }

    public void abastecer(double quantidadeLitros) {
        System.out.println("Abastecendo " + quantidadeLitros + " litros de " + tipoCombustivel + " no carro " + marca + " " + modelo + ".");
    }

    public void desligar() {
        if (ligado) {
            System.out.println("O carro " + marca + " " + modelo + " desligou.");
            this.ligado = false;
        } else {
            System.out.println("O carro " + marca + " " + modelo + " já está desligado.");
        }
    }
}