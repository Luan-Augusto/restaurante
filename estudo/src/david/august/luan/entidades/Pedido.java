package david.august.luan.entidades;

import java.util.*;

public class Pedido {

	private String refeicao;
	private String bebida;
	private double preco;
	private Date dataPedido;

	public Pedido(String refeicao, String bebida, double preco) {
		this.refeicao = refeicao;
		this.bebida = bebida;
		this.preco = preco;
		this.dataPedido = new Date();
	}

	public String getrefeicao() {
		return refeicao;
	}

	public void setrefeicao(String refeicao) {
		this.refeicao = refeicao;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	@Override
	public String toString() {
		return "\nRefeicao: " + refeicao + ", \nbebida: " + bebida + "\npreco: " + preco + "\nData do pedido: "
				+ dataPedido;
	}

}
