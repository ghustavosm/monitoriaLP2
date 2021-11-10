package questao01;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Verifica o maior entre dois números.\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º número inteiro: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		int numero2 = sc.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Os números são iguais.");
		} else if(numero1 > numero2) {
			System.out.printf("O maior valor digitado foi: %d", numero1);
		} else {
			System.out.printf("O maior valor digitado foi: %d", numero2);
		}
		
		sc.close();
		
	}

}
