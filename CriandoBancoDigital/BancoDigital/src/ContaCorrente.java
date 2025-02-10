// Classe ContaCorrente
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial) {
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (consultarSaldo() + limiteChequeEspecial)) {
            super.sacar(valor);
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }
}