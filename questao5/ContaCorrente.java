class ContaCorrente {
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

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente [numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
    }
}
