class ContaPoupanca {
    private String numeroConta;
    private double saldo;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente [numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
    }
}
