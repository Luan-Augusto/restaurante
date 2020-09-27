package david.august.luan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Cliente> clientes;

    public Cliente(String nome, String cpf) {
        super(cpf, nome);
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
