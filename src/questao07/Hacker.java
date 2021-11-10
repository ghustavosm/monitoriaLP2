package questao07;

public class Hacker {
	
	public static void main(String args[]) {
		
		System.out.println("Usuário 1");
		Usuario usuario1 = new Usuario("user1", "1234");
		usuario1.login = "hackeado";
		usuario1.senha = "hackeado";
		usuario1.imprimir();
		
		System.out.println("\nUsuário 2");
		UsuarioEncapsulado usuario2 = new UsuarioEncapsulado("user2", "4321");
		//usuario2.login = "hackeado"; // erro, pois o login está encapsulado
		//usuario2.senha = "hackeado"; // erro, pois a senha está encapsulada
		usuario2.imprimir(); // os dados não foram alterados
		
	}

}
