public class Relogio {
    String marca;
    String tipo; // Digital/Analógico
    String cor;
    String materialPulseira;
    String resistenciaAgua; // Ex: "50m", "Não"
    String horaAtual; // Simulação de hora

    public Relogio(String marca, String tipo, String cor, String materialPulseira, String resistenciaAgua) {
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.materialPulseira = materialPulseira;
        this.resistenciaAgua = resistenciaAgua;
        this.horaAtual = "00:00:00"; // Hora padrão ao inicializar
    }

    public void mostrarHora() {
        System.out.println("O relógio " + marca + " está mostrando: " + horaAtual + ".");
    }

    public void ajustarHora(String novaHora) {
        this.horaAtual = novaHora;
        System.out.println("Hora do relógio " + marca + " ajustada para: " + horaAtual + ".");
    }

    public void cronometro() {
        System.out.println("Cronômetro do relógio " + marca + " (iniciar/pausar/resetar - simulação).");
    }

    public void alarme(String horaAlarme) {
        System.out.println("Alarme do relógio " + marca + " configurado para " + horaAlarme + ".");
    }
}