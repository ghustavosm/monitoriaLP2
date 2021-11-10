package questao07;

public class UsuarioEncapsulado {
	
	private String login;
	private String senha;
	
	public UsuarioEncapsulado(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void imprimir() {
		System.out.println("Login: " + getLogin() + System.lineSeparator() + "Senha: " + getSenha());
	}
	
}