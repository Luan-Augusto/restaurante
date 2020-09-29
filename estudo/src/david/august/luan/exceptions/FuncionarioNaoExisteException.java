package david.august.luan.exceptions;

public class FuncionarioNaoExisteException extends Exception {
	public FuncionarioNaoExisteException(String nome) {
		super("O funcionario " + nome + " nao existe");
	}
}
