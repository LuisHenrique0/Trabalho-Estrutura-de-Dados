
import java.util.HashMap;
import java.util.Map;

public class ClienteRepository {
    private Map<String, Cliente> clientes;

    public ClienteRepository() {
        clientes = new HashMap<>();
        // Cadastro de alguns clientes
        clientes.put("12345678901", new Cliente("João", "12345678901", "85987654321", "joao@example.com"));
        clientes.put("98765432109", new Cliente("Maria", "98765432109", "85987544488", "maria@example.com"));
        clientes.put("45678912303", new Cliente("Pedro", "45678912303", "85943210987", "pedro@example.com"));
        clientes.put("14367459778", new Cliente( "Luis", "14367459778", "85987659971", "luis@example.com"));
        clientes.put("68034579521", new Cliente( "Augusto", "68034579521", "85986657009", "augusto@example.com"));
        clientes.put("98542335797", new Cliente( "Carlos", "98542335797", "85983210987", "carlos@example.com"));
        clientes.put("88764344677", new Cliente( "Cezar", "88764344677", "85988684225", "cezar@example.com"));
        clientes.put("16455895489", new Cliente( "Pedro", "16455895489", "85984233492", "pedro@example.com"));
        clientes.put("67688905621", new Cliente( "Vitctória" , " 67688905621", "85989956765", "victoria@example.com"));
    }

    public Cliente buscarPorCPF(String cpf) {
        return clientes.get(cpf);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }
}
