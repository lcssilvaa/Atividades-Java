public class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

    public String mostraCor() {
        return cor;
    }
}
