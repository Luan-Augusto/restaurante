package david.august.luan.service;

import david.august.luan.entidades.Funcionario;

public class Servico {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("FUlano", "312341234");
		f.addFuncionario(f);
	}
}
