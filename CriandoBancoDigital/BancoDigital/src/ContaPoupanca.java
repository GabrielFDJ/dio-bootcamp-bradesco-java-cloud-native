// Classe ContaPoupanca
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimento) {
        super(numero, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = consultarSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento aplicado. Novo saldo: " + consultarSaldo());
    }
}