package questao10;

public class CadastroPessoas {
	
	private Pessoa[] pessoas = new Pessoa[0];
	private int quantAtual;

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public int getQuantAtual() {
		return quantAtual;
	}

	public void setQuantAtual(int quantAtual) {
		this.quantAtual = quantAtual;
	}
	
	public void cadastrarPessoa(Pessoa pessoa) {
		Pessoa[] aux = new Pessoa[pessoas.length + 1];

		for (int i = 0; i < pessoas.length; i++) {
			aux[i] = pessoas[i];
		}
		
		aux[pessoas.length] = pessoa;
		pessoas = aux;
		
		quantAtual++;
	}
	
	public void mostraCadastro() {
		System.out.println("Cadastro:");
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("\nPessoa %d:\n", i + 1);
			pessoas[i].mostraDados();
		}
	}
	
	public static void main(String[] args) {
		
		CadastroPessoas cadastro = new CadastroPessoas();
		
		Pessoa pessoa = new Pessoa("Pessoa", "12345678910");
		Pessoa cliente = new Cliente("Cliente", "12345678911", 1);
		Pessoa funcionario = new Funcionario("Funcionario", "12345678912", "1234567", 2000);
		Pessoa gerente = new Gerente("Gerente", "12345678913", "1234568", 3000, 1);
		
		cadastro.cadastrarPessoa(pessoa);
		cadastro.cadastrarPessoa(cliente);
		cadastro.cadastrarPessoa(funcionario);
		cadastro.cadastrarPessoa(gerente);
		
		cadastro.mostraCadastro();
		
	}

}