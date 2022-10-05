package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo17 {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
	public void retangulo() {
		double base, altura, perimetro, area, diagonal;
		System.out.print("Informe a base: ");
		base = sc.nextDouble();
		System.out.print("Informe a Altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		perimetro = 2 * (base + altura);
		
		double teorP = Math.pow(altura, 2) + Math.pow(base, 2);
		diagonal = Math.sqrt(teorP);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("Diagonal: " + diagonal);
	}

}
