package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo24 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public void Fahrenheit() {
		
		System.out.println("Informa a temperatura em graus Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("A temperatura convertida para Fahrenheit é: %.1fºF", fahrenheit);
		
	}

}
