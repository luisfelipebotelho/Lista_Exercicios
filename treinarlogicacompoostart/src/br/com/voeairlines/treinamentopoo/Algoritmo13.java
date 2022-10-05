package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo13 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public String medPonderada() {
		
		System.out.println("Entre com o primeiro número: ");
		double num1 = sc.nextInt()*1;
		System.out.println("Entre com o segundo número: ");
		double num2 = sc.nextInt()*2;
		System.out.println("Entre com o terceiro número: ");
		double num3 = sc.nextInt()*3;
		System.out.println("Entre com o quarto número: ");
		double num4 = sc.nextInt()*4;
		return "A média ponderada é: "+(num1+num2+num3+num4)/10;
	}

}
