package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo26 {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public void prestação() {
		System.out.print("Informe o valor: ");
		double valor = sc.nextDouble();
		System.out.print("Informe a taxa de encargos: ");
		double taxa = sc.nextDouble();
		System.out.print("Informe o tempo de atraso: ");
		double tempo = sc.nextDouble();
		double prestacao = valor + (valor * (taxa / 100) * tempo);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("O valor da prestação é R$: %.2f", prestacao);
	}
}
