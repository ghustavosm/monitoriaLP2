package questao06;

public class Filme {
	
	private String nome;
	private String autor;
	private String ano;
	private double preco;
	
	public Filme(String nome, String autor, String ano, double preco) {
		setNome(nome);
		setAutor(autor);
		setAno(ano);
		setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + getNome() + System.lineSeparator() +
						   "Autor: " + getAutor() + System.lineSeparator() +
						   "Ano: " + getAno() + System.lineSeparator() +
						   "Preço: R$ " + String.format("%.2f", getPreco()));
	}

}
