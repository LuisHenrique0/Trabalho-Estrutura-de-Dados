
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente buscarClientePorCPF(String cpf) {
        return clienteRepository.buscarPorCPF(cpf);
    }

    public void adicionarCliente(Cliente cliente) {
        clienteRepository.adicionarCliente(cliente);
    }
}
