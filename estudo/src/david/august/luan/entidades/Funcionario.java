package david.august.luan.entidades;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
