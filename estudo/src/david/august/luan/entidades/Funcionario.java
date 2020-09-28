package david.august.luan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	private static int nextRegistration = 0;

	private int idFuncionario;
	private List<Funcionario> funcionarios;
	private double salario;

	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		this.idFuncionario = nextRegistration;
		this.funcionarios = new ArrayList<>();
		nextRegistration++;
	}

	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public List<Funcionario> listarFuncionarios() {
		return funcionarios;
	}

	// getter's/ setter's
	public int getIdFuncionario() {
		return idFuncionario;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", funcionarios=" + funcionarios + ", salario=" + salario
				+ "]";
	}

}
