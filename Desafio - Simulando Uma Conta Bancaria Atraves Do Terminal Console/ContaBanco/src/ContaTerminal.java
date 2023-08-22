import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * TODO:
         * - Importar a classe Scanner
         * - Exibir as mensagens para o usuario
         * - Ler os valores digitados pelo usuario
         * - Calcular o saldo final e exibir o resultado
         * 
         * Estrutura das variaveis:
         * - Numero da conta: int exemplo: 1021
         * - Agencia: String exemplo: "067-8"
         * - Nome Cliente: String exemplo: "Fernando"
         * - Saldo: double exemplo: 237,48
         * 
         * ao final exibir os dados no seguinte formato:
         * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
         */
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o numero da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite a agencia: ");
            String agencia = scanner.next();

            System.out.println("Digite o nome do cliente: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite o saldo: ");
            double saldo = scanner.nextFloat();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        } catch (Exception e) {
            System.out.println("Erro ao ler os dados");
        }
        scanner.close();
    }
}
