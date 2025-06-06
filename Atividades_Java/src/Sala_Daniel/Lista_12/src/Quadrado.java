public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void mudarValorLado(double novoLado) {
        this.lado = novoLado;
    }

    public double retornarValorLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
