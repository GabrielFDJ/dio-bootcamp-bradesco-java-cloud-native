import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()

        // Solicita e lê a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fecha o scanner para liberar recursos
        scanner.close();

        // Exibe a mensagem final com os dados inseridos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}