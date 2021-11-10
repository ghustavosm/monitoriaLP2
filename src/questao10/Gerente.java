package questao10;

public class Gerente extends Funcionario {
	
	private int area;
	
	public Gerente(String nome, String matricula, int area) {
		super(nome, null, matricula, 0);
		this.area = area;
	}
	
	public Gerente(String nome, String cpf, String matricula, double salario, int area) {
		super(nome, cpf, matricula, salario);
		this.area = area;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	@Override
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Área: " + this.getArea());
	}

}