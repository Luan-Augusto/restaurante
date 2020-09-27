package david.august.luan.entidades;

import java.util.Random;

public class CupomFiscal {
    private Cliente cliente;
    private Funcionario funcionario;
    private Random codigo;

    public CupomFiscal(Cliente cliente, Funcionario funcionario) {
        this.cliente = cliente;
        this.codigo = new Random();
    }

    // gerar um cod capaz de pegar 10 numeros aleatorios
    public int codigoPedido(Random codigo) {
        int cod = 0;
        // para i menor que 10 incremente i
        for (int i = 0; i < 10; i++) {
            // armazenando a sequencia numerica na variavel cod
            cod = codigo.nextInt();
        }
        return cod;// retorno
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Random getCodigo() {
        return codigo;
    }

    public void setCodigo(Random codigo) {
        this.codigo = codigo;
    }
}
