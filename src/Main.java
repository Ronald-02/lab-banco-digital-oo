public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("C6 Bank");

        ContaCorrente cc1 = new ContaCorrente("12345-6", 1000.0);
        ContaPoupanca cp1 = new ContaPoupanca("54321-0", 500.0);

        Cliente cliente1 = new Cliente("Ronald", "123.456.789-00", cc1);
        Cliente cliente2 = new Cliente("Luan", "987.654.321-00", cp1);

        banco.abrirConta(cliente1, cc1);
        banco.abrirConta(cliente2, cp1);

        cliente1.getConta().depositar(200.0);
        cliente1.getConta().sacar(600.0);

        cliente2.getConta().depositar(700.0);
        cliente2.getConta().sacar(200.0);

        cliente1.getConta().transferir(cliente2.getConta(), 150.0);
    }
}
