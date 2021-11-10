package questao02;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("Recebe uma matriz MxN e retorna o maior valor.\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de M: ");
		int m = sc.nextInt();
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		int[][] matrizA = new int[m][n];
		
		int maior = Integer.MIN_VALUE;
		
		System.out.println("\nElementos da matriz A:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Digite o elemento A[%d][%d]: ", i, j);
				matrizA[i][j] = sc.nextInt();
				
				if(maior < matrizA[i][j]) {
					maior = matrizA[i][j];
				}
			}
		}
		
		System.out.printf("\nO maior valor da matriz é: %d\n", maior);
		
		sc.close();
		
	}
	
}
