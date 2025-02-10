// Classe Main
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("123", "João", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("456", "Maria", 2000, 0.05);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(500);
        cc.sacar(200);
        cc.transferir(300, cp);

        cp.aplicarRendimento();

        banco.listarContas();
    }
}