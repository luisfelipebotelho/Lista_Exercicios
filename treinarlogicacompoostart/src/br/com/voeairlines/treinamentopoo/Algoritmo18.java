package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo18 {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	public void raioCirculo() {
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Perímetro: %.3f", perimetro);
		System.out.printf("\nÁrea: %.3f", area);
	}
}
