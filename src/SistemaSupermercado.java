
import java.util.Scanner;

public class SistemaSupermercado {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteService clienteService = new ClienteService(clienteRepository);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        Cliente cliente = clienteService.buscarClientePorCPF(cpfCliente);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("E-mail: " + cliente.getEmail());

        } else {
            System.out.println("Cliente não encontrado. Deseja cadastrar um novo cliente? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                Cliente novoCliente = lerDadosCliente(scanner);
                clienteService.adicionarCliente(novoCliente);
                System.out.println("Novo cliente cadastrado com sucesso!");
            } else {
                System.out.println("Sem desconto aplicado.");
            }
        }

        scanner.close();
    }

    private static Cliente lerDadosCliente(Scanner scanner) {
        System.out.print("Digite o CPF do novo cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o nome do novo cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do novo cliente (apenas números): ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o e-mail do novo cliente: ");
        String email = scanner.nextLine();
        return new Cliente(nome, cpf, telefone, email);
    }
}
