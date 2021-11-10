package questao10;

public class Cliente extends Pessoa {
	
	private int codigo;
	
	public Cliente(String nome, int codigo) {
		super(nome, null);
		this.codigo = codigo;
	}
	
	public Cliente(String nome, String cpf, int codigo) {
		super(nome, cpf);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Código: " + this.getCodigo());
	}
	
}