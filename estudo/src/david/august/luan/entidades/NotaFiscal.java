package david.august.luan.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class NotaFiscal {
	private Cliente cliente;
	private Funcionario funcionario;
	private List<Cliente> clientes;
	private Pedido pedido;
	private Random codigo;
	private Calendar dataCompra;

	public NotaFiscal(Pedido pedido, Cliente cliente, Funcionario funcionario) {
		this.pedido = pedido;
		this.cliente = cliente;
		this.clientes = new ArrayList<Cliente>();
		this.codigo = new Random(codigoPedido(getCodigo()));
		this.dataCompra = Calendar.getInstance();
	}

	public NotaFiscal() {
	}

	// gera um cod capaz de pegar 10 numeros aleatorios
	public int codigoPedido(Random codigo) {
		int cod = 0;
		// para i menor que 10 incremente i
		for (int i = 0; i < 10; i++) {
			// armazenando a sequencia numerica na variavel cod
			cod = codigo.nextInt();
		}
		return cod;// retorno
	}

	// GETTER'S / SETTER'S
	public Cliente getCliente() throws ClienteNaoExisteException {
		Cliente client = null;
		for (Cliente c : clientes) {
			if (clientes.contains(c)) {
				client = c;
			}
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

	public Calendar getDataCompra() {
		return dataCompra;
	}
}
