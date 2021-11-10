package questao07;

public class Usuario {
	
	String login;
	String senha;
	
	Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	String getLogin() {
		return login;
	}
	
	String getSenha() {
		return senha;
	}
	
	void imprimir() {
		System.out.println("Login: " + getLogin() + System.lineSeparator() + "Senha: " + getSenha());
	}
	
}
