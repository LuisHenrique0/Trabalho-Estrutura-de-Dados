
import java.util.HashMap;
import java.util.Map;

public class ClienteRepository {
    private Map<String, Cliente> clientes;

    public ClienteRepository() {
        clientes = new HashMap<>();
        // Cadastro de alguns clientes
        clientes.put("12345678901", new Cliente("João", "12345678901", "85987654321", "joao@example.com"));
        clientes.put("98765432109", new Cliente("Maria", "98765432109", "85876543210", "maria@example.com"));
        clientes.put("45678912303", new Cliente("Pedro", "45678912303", "85432109876", "pedro@example.com"));
    }

    public Cliente buscarPorCPF(String cpf) {
        return clientes.get(cpf);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }
}
