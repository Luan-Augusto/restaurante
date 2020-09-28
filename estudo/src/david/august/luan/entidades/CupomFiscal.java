package david.august.luan.entidades;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class CupomFiscal {
	private Cliente cliente;
	private List<Cliente> clientes;
	private Funcionario funcionario;
	private List<Funcionario> funcionarios;
	private Pedido pedido;
	private Random codigo;
	private Calendar dataCompra;

	public CupomFiscal(Pedido pedido, Cliente cliente, Funcionario funcionario) {
		this.pedido = pedido;
		this.cliente = cliente;
		this.codigo = new Random(codigoPedido(getCodigo()));
		this.dataCompra = Calendar.getInstance();
	}

	public CupomFiscal() {
	}

	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
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
	public Cliente getCliente() {
		return cliente;
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
