class ContaCorrente extends Conta {
    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (this.getSaldo() >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}