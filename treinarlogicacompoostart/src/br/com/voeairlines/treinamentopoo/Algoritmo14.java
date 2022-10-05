package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo14 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String saldoReajuste() {
		System.out.println("Entre com o saldo da aplicação: ");
		double saldo = sc.nextDouble();
		return "O saldo reajustado é de: " + (saldo+(saldo*0.01));
		
	}

}
