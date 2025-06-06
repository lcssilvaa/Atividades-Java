import java.util.Scanner;

public class Retangulo {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mudarValorLados(double novoLadoA, double novoLadoB) {
        this.ladoA = novoLadoA;
        this.ladoB = novoLadoB;
    }

    public double[] retornarValoresLados() {
        return new double[]{ladoA, ladoB};
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida do lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite a medida do lado B: ");
        double ladoB = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(ladoA, ladoB);

        System.out.println("\nÁrea do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        scanner.close();
    }
}
