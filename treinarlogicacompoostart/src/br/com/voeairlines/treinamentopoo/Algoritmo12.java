package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo12 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String medAritmetica() {
		
		System.out.println("Digite o primeiro número real: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número real: ");
		double num2 = sc.nextDouble();
		return "A média Aritmética é: " + (num1 + num2 )/ 2;
		
		
	}

}
