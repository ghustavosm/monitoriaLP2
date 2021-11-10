package questao10;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.cpf = null;
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + this.getNome() + System.lineSeparator() +
						   "CPF: " + (this.getCpf() == null ? "Não informado" : this.getCpf()));
	}

}