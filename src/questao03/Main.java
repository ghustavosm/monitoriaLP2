package questao03;

import java.util.Scanner;

public class Main {
	
	// ordem das matrizes
	private static int m = 5;
	private static int n = 5;
	
	public static int[][] matrizSoma(int[][] A, int[][] B) {
		int[][] soma = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				soma[i][j] = A[i][j] + B[i][j];
			}
		}
		
		return soma;
	}
	
	public static int[][] matrizDiferenca(int[][] A, int[][] B) {
		int[][] diferenca = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				diferenca[i][j] = A[i][j] - B[i][j];
			}
		}
		
		return diferenca;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		for(int i = 0; i < m; i++) {
			System.out.print("| ");
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d ", matriz[i][j]);
			}
			System.out.println("  |");
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println("Recebe duas matrizes inteiras 5x5 e retorna uma matriz diferença e uma matriz soma.\n");
		
		Scanner sc = new Scanner(System.in);
		
		int[][] A = new int[m][n];
		int[][] B = new int[m][n];
		
		System.out.println("Elementos da matriz A:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Digite o elemento A[%d][%d]: ", i, j);
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElementos da matriz B:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Digite o elemento B[%d][%d]: ", i, j);
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz Soma:\n");
		imprimirMatriz(matrizSoma(A, B));
		
		System.out.println("\nMatriz Diferença:\n");
		imprimirMatriz(matrizDiferenca(A, B));
		
		sc.close();
		
	}

}