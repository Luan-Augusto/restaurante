package david.august.luan.service;

import david.august.luan.entidades.Cliente;
import david.august.luan.entidades.Funcionario;
import david.august.luan.entidades.NotaFiscal;
import david.august.luan.entidades.Pedido;

public class Servico {

	public static void main(String[] args) {
		
		// funcionarios
		Funcionario funcionario = new Funcionario("Beltrano", "2345234");
		Funcionario funcionario2 = new Funcionario("Cicrano", "0729345");
		System.out.println(funcionario);
		System.out.println(funcionario2);
		
		// clientes
		Cliente c1 = new Cliente("Ana", "3452345");
		Cliente c2 = new Cliente("Rosa"); // cliente que nao informa cpf
		System.out.println(c1);
		System.out.println(c2);
		
		Pedido pedido = new Pedido("Sanduiche", "Refrigerante", 7.59);
		
	}
}
