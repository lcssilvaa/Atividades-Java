public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String mostrarDados() {
        return "Conta: " + numeroConta + "\nNome: " + nomeCorrentista + "\nSaldo: $" + saldo;
    }
}
