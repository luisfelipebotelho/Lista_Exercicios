package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo15 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public void salarioMinimoQuilowatts() {
		
		System.out.println("Entre com o valor do salário mínimo: ");
		double salMin=sc.nextDouble();
		System.out.println("Entre com a quantidade de quilowatts: ");
		double quiloW=sc.nextDouble();
		double cadaQ=((salMin/7)*1)/quiloW;
		double valorPg = (salMin/7)*quiloW;
		System.out.println("O valor em reias de cada quilowatt é de: R$ %.2f"+cadaQ);
		System.out.println("\nO valor em reais a ser pago é: R$ %.2f"+valorPg);
		System.out.println("\nO valor final com desconto de 10% é de: R$ "+(valorPg-(valorPg*0.1)));
			
		
	}

}
