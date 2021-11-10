package questao09;

public class TestaTudo {
	
	public static void main(String args[]) {
		
		System.out.println("Pessoa:");
		Pessoa pessoa = new Pessoa("João", "12345678911", "01/01/1991");
		pessoa.mostrarPessoa();
		
		System.out.println("\nFuncionario:");
		Funcionario funcionario = new Funcionario("Maria", "12345678912", "02/02/1992", "1234567", "02/02/2012", 2000);
		funcionario.mostrarFuncionario();
		
		System.out.println("\nChefeDepartamento:");
		ChefeDepartamento chefe = new ChefeDepartamento("José", "12345678913", "03/03/1993", "1234567", "03/03/2013", 3000, "Computação", "03/03/2014", 1000);
		chefe.mostrarChefe();
		
		System.out.println("\nAluno:");
		Aluno aluno = new Aluno("Ana", "12345678914", "04/04/1994", "123456789");
		aluno.mostrarAluno();
		
	}

}