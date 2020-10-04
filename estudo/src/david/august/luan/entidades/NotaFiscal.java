package david.august.luan.entidades;

import david.august.luan.interfaces.Codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NotaFiscal implements Codigo {
    private Cliente cliente;
    private Funcionario funcionario;
    private List<Cliente> clientes;
    private Pedido pedido;
    private Random codigo;

    public NotaFiscal(Pedido pedido, Cliente cliente, Funcionario funcionario) {
        this.pedido = pedido;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.clientes = new ArrayList<>();
        this.codigo = new Random();
    }

    public NotaFiscal() {
    }

    // gera um cod capaz de pegar 10 numeros aleatorios
    @Override
    public int codigoPedido() {
        // algoritmo 1
//		int cod = 0;
//		// para i menor que 10 incremente i
//		for (int i = 0; i < 10; i++) {
//			// armazenando a sequencia numerica na variavel cod
//			cod = codigo.nextInt();
//		}
//		return cod;// retorno

        // algoritmo 2
//        Random cod = new Random();
//        AtomicInteger valor = new AtomicInteger();
//        Arrays.stream(cod)
//                // para cada numero q entrar aqui verifica se e menor ou maior q 0
//                .filter(numero -> numero == null)
//                .map(numero -> numero)
//                .forEach(numero -> valor.set(numero));
//        return valor.get();

        // algoritmo 3
        Random r = new Random();
        return r.nextInt(10000000);
    }

    // GETTER'S / SETTER'S
    public Cliente getCliente() throws ClienteNaoExisteException {
        Cliente client = null;
        for (Cliente c : clientes) {
            if (clientes.contains(c)) {
                client = c;
            }
            throw new ClienteNaoExisteException(c.getNome());
        }
        return client;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "\n---------------------------------------------------\nNotaFiscal \nCliente:" + cliente + "\n"
                + " \nFuncionario: " + funcionario + "\n" + " \nPedido: " + pedido + " \nCodigo do pedido: " + codigoPedido()
                + "\n---------------------------------------------------\n";
    }

}
