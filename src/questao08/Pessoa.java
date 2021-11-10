package questao08;

public class Pessoa {
	
	private String nome;
	private Data dataNasc;
	private Endereco endereco;
	private Contato contato;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Data getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
