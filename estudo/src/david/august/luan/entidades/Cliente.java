package david.august.luan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Cliente> clientes;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.clientes = new ArrayList<>();
    }

    /*
     * este construtor vai servir para clientes os quais nao saibam o numero do
     * cpf decorado e estejam sem documento ou optem em nao informar
     */
    public Cliente(String nome) {
        super(nome);
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

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nCPF: " + getCpf();
    }
}
