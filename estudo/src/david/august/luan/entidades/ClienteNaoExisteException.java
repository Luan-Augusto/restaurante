package david.august.luan.entidades;

public class ClienteNaoExisteException extends Exception {
	public ClienteNaoExisteException(String nome) {
		super("O cliente " + nome + " nao existe!");
	}
}
