import java.util.ArrayList;
import java.util.List;

class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void abrirConta(Cliente cliente, Conta conta) {
        cliente.setConta(conta);
        clientes.add(cliente);
        System.out.println("Conta aberta para o cliente " + cliente.getNome() + " com sucesso.");
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null; // Retorna null se o cliente não for encontrado
    }
}
