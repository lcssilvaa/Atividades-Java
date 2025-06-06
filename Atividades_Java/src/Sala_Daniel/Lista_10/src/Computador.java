// Computador.java
public class Computador {
    String processador;
    String memoriaRAM;
    String armazenamento;
    String sistemaOperacional;
    String placaVideo;
    boolean ligado;

    public Computador(String processador, String memoriaRAM, String armazenamento, String sistemaOperacional, String placaVideo) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.ligado = false; // Estado inicial
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("O computador com " + processador + " ligou.");
            this.ligado = true;
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("O computador desligou.");
            this.ligado = false;
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    public void abrirPrograma(String programa) {
        if (ligado) {
            System.out.println("Abrindo o programa '" + programa + "' no computador.");
        } else {
            System.out.println("Não é possível abrir programa, o computador está desligado.");
        }
    }

    public void salvarArquivo(String nomeArquivo) {
        if (ligado) {
            System.out.println("Salvando o arquivo '" + nomeArquivo + "' no computador.");
        } else {
            System.out.println("Não é possível salvar arquivo, o computador está desligado.");
        }
    }

    public void reiniciar() {
        if (ligado) {
            System.out.println("Reiniciando o computador...");
            this.desligar(); // Desliga para simular o reinício
            this.ligar();    // Liga novamente
        } else {
            System.out.println("Não é possível reiniciar, o computador está desligado.");
        }
    }
}