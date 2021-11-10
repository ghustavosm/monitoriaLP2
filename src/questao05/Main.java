package questao05;

import java.util.Scanner;

public class Main {
	
	public static double converterParaDolar(double valorEmReais, double cotacaoDolar) {
		return valorEmReais/cotacaoDolar;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Conversão de real para dólar.\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dólar: ");
		double cotacaoDolar = sc.nextFloat();
		
		System.out.print("Digite o valor em reais: ");
		double valorEmReais = sc.nextFloat();
		
		System.out.printf("\nO valor em dólares é: $ %.2f\n", converterParaDolar(valorEmReais, cotacaoDolar));
		
		sc.close();
		
	}

}
