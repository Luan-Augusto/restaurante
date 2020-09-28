package david.august.luan.entidadesTestes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import david.august.luan.entidades.*;

public class testCliente {

	@Test
	void cadastarCupom() {
		Cliente cliente = new Cliente("Cicrano", "123412341");
		Funcionario funcionario = new Funcionario("Beltrano", "2345234");
		Pedido pedido = new Pedido("Coxinha", "Guarana", 7.50);
		CupomFiscal cupom = new CupomFiscal(pedido, cliente, funcionario);
		// como fazer um teste para saber se adicionou mesmo na nota fiscal?
		
	}

}
