public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();

            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();

            ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);
            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o valor do saque " + i + ": ");
                double valorSaque = scanner.nextDouble();

                try {
                    conta.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
                  // excecao
                } catch (SaldoInsuficienteException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        } finally {
            scanner.close();
        }
    }
}
