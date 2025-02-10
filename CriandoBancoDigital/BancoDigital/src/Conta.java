// Classe Conta (Superclasse)
public abstract class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " para " + destino.getTitular() + " realizada.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
}