package questao09;

public class Funcionario extends Pessoa {
	
	private String matricula;
	private String dataAdmissao;
	private double salario;
	
	public Funcionario(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario) {
		super(nome, cpf, dataNasc);
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void mostrarFuncionario() {
		this.mostrarPessoa();
		System.out.println("Matricula: " + this.getMatricula() + System.lineSeparator() +
						   "Data de admissao: " + this.getDataAdmissao() + System.lineSeparator() +
						   "Salario: R$ " + String.format("%.2f", this.getSalario()));
	}
	
}