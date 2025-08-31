import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private Set<Cliente> clientes = new HashSet<>(); 

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        clientes.add(conta.getCliente()); 
    }

    public void listarClientes() {
        System.out.println("=== Lista de Clientes do Banco " + this.nome + " ===");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }
}
