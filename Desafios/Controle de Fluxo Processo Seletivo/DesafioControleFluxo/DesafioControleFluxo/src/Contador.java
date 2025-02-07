import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicita os parâmetros ao usuário
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Lê o primeiro parâmetro

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Lê o segundo parâmetro

        try {
            // Chama o método contar e passa os parâmetros
            contar(parametroUm, parametroDois);
        } catch (Exception exception) {
            // Captura a exceção e exibe a mensagem de erro
            System.out.println(exception.getMessage());
        } finally {
            terminal.close(); // Fecha o Scanner para liberar recursos
        }
    }

    static void contar(int parametroUm, int parametroDois) throws Exception {
        // Valida se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de iterações
        int contagem = parametroDois - parametroUm;

        // Realiza a contagem e imprime os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}