package questao06;

public class Main {
	
	public static void main(String args[]) {
		
		Filme filme1 = new Filme("À Espera de um Milagre", "Frank Darabont", "2000", 19.90);
		Filme filme2 = new Filme("Um Sonho de Liberdade", "Frank Darabont", "1995", 29.90);
		Filme filme3 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", "1972", 9.90);
		
		// Filme 1
		System.out.println("Lendo e imprimindo dados avulsos do objeto \"filme1\":");
		System.out.println(filme1.getNome());
		System.out.println(filme1.getAutor());
		System.out.println(filme1.getAno());
		System.out.println(filme1.getPreco());
		System.out.println("\nMétodo de impressão do objeto \"filme1\":");
		filme1.imprimir();
		
		// Filme 2
		System.out.println("\nLendo e imprimindo dados avulsos do objeto \"filme2\":");
		System.out.println(filme2.getNome());
		System.out.println(filme2.getAutor());
		System.out.println(filme2.getAno());
		System.out.println(filme2.getPreco());
		System.out.println("\nMétodo de impressão do objeto \"filme2\":");
		filme2.imprimir();
		
		// Filme 3
		System.out.println("\nLendo e imprimindo dados avulsos do objeto \"filme3\":");
		System.out.println(filme3.getNome());
		System.out.println(filme3.getAutor());
		System.out.println(filme3.getAno());
		System.out.println(filme3.getPreco());
		System.out.println("\nMétodo de impressão do objeto \"filme3\":");
		filme3.imprimir();
		
	}

}
