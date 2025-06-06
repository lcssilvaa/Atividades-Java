public class Celular {
    String marca;
    String modelo;
    String sistemaOperacional;
    int capacidadeArmazenamentoGB;
    double tamanhoTelaPolegadas;
    boolean ligado;

    public Celular(String marca, String modelo, String sistemaOperacional, int capacidadeArmazenamentoGB, double tamanhoTelaPolegadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.capacidadeArmazenamentoGB = capacidadeArmazenamentoGB;
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
        this.ligado = false; // Estado inicial
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("O celular " + marca + " " + modelo + " ligou.");
            this.ligado = true;
        } else {
            System.out.println("O celular " + marca + " " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("O celular " + marca + " " + modelo + " desligou.");
            this.ligado = false;
        } else {
            System.out.println("O celular " + marca + " " + modelo + " já está desligado.");
        }
    }

    public void fazerChamada(String numero) {
        if (ligado) {
            System.out.println("Fazendo chamada para " + numero + " com o celular " + marca + " " + modelo + ".");
        } else {
            System.out.println("Não é possível fazer chamada, o celular " + marca + " " + modelo + " está desligado.");
        }
    }

    public void enviarMensagem(String contato, String mensagem) {
        if (ligado) {
            System.out.println("Enviando mensagem para " + contato + ": '" + mensagem + "' com o celular " + marca + " " + modelo + ".");
        } else {
            System.out.println("Não é possível enviar mensagem, o celular " + marca + " " + modelo + " está desligado.");
        }
    }

    public void tirarFoto() {
        if (ligado) {
            System.out.println("Tirando foto com o celular " + marca + " " + modelo + ".");
        } else {
            System.out.println("Não é possível tirar foto, o celular " + marca + " " + modelo + " está desligado.");
        }
    }
}