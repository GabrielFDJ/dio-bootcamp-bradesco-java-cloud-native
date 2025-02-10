
// Classe Banco
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta de " + conta.getTitular() + " adicionada.");
    }

    public Conta buscarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.getTitular() + ", Saldo: " + conta.consultarSaldo());
        }
    }
}