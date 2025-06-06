public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        if (idade < 21) {
            altura += 0.5;
        }
        idade++;
    }

    public void engordar(double ganhoPeso) {
        peso += ganhoPeso;
    }

    public void emagrecer(double perdaPeso) {
        peso -= perdaPeso;
    }

    public void crescer(double aumentoAltura) {
        altura += aumentoAltura;
    }

    public String mostrarDados() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + " kg\nAltura: " + altura + " cm";
    }
}
