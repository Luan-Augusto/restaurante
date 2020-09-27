package david.august.luan.entidades;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {

    private List<Funcionario> funcionarios;
    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
