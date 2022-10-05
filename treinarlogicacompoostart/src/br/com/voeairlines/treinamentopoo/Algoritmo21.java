package br.com.voeairlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo21 {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public void Atriangulo() {

		System.out.println("Algoritmo 21");
		System.out.println("Criar um algoritmo que calcule e imprima a área de um triângulo.");
		System.out.print("Informe a base: ");
		double base = sc.nextDouble();
		System.out.print("Informe a Altura: ");
		double altura = sc.nextDouble();

		double area = (base * altura) / 2;

		System.out.println("\nResultado: ");
		System.out.println();
		System.out.printf("Area: %.2f", area);
	}

}
