package questao04;

import java.util.Scanner;
import java.text.Normalizer;

public class Main {
	
	public static int contarVogais(String nome) {
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};		
		nome = removerAcentos(nome.toLowerCase());	
		
		int total = 0;		
		for(int i = 0; i < nome.length(); i++) {
			for(int j = 0; j < vogais.length; j++) {
				if(nome.charAt(i) == vogais[j]) {
					total++;
				}
			}
		}
		
		return total;
	}
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
	
	public static void main(String args[]) {
		
		System.out.println("Recebe um nome e retorna o número de vogais.\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = sc.nextLine();
		
		System.out.printf("\nA quantidade de vogais da palavra é: %d\n", contarVogais(nome));
		
		sc.close();
		
	}

}