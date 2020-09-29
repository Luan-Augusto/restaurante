package david.august.luan.exceptions;

@SuppressWarnings("serial")
public class FuncionarioNaoExisteException extends Exception {

	public FuncionarioNaoExisteException(String nome) {
		super("O funcionario " + nome + " nao existe");
	}
}
