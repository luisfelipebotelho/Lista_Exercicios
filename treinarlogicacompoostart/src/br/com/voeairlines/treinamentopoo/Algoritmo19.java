package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo19 {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public void ladoQ() {
		
		double lado, perimetro, diagonal, area;
		System.out.print("Informe o valor do lado: ");
		lado = sc.nextDouble();
		
		area = Math.pow(lado, 2);
		
		perimetro = 4 * lado;
		
		double teoremaP = Math.pow(lado, 2) + Math.pow(lado, 2);
		diagonal = Math.sqrt(teoremaP);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.printf("Diagonal: %.2f", diagonal);
	}

}
